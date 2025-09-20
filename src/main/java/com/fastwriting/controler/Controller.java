package com.fastwriting.controler;

import com.fastwriting.model.GameModel;
import com.fastwriting.model.Phrases;
import com.fastwriting.view.PrincipalWindow;
import com.fastwriting.view.StartWindow;
import com.fastwriting.view.StatisticsWindow;
import javafx.animation.KeyValue;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.KeyCode;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.scene.input.KeyEvent;
import javafx.scene.image.Image;

import java.io.IOException;
import java.security.Principal;
import java.util.Objects;
import java.util.SplittableRandom;

/**
 * The main controller for the game view.
 * This class handles all the logic and user interactions for the typing game itself,
 * including managing the timer, validating user input, updating the UI, and
 * handling the game state.
 */
public class Controller {
    @FXML
    private PrincipalWindow principalWindow;



    private GameModel gameModel = new GameModel();
    private Phrases phrases = new Phrases();
    private StatisticsWindow statisticsWindow;
    private StartWindow startWindow;
    private String userInput;
    private Boolean inputIsValid;


    @FXML
    private Label labelLevel;

    @FXML
    private Label labelMessage;

    @FXML
    private Label labelPhrases;

    @FXML
    private TextField myInput;

    @FXML
    private Label myTimer;

    @FXML
    private ImageView imageValidator;

    @FXML
    private ProgressBar progressBar;

    @FXML
    Button closeGame;
    @FXML
    Button back;
    boolean theUserIsBack;

    /**
     * Sets the reference to the {@link PrincipalWindow} this controller manages.
     *
     * @param principalWindow The {@code PrincipalWindow} instance.
     */
    public void setPrincipalWindow(PrincipalWindow principalWindow) {
        this.principalWindow = principalWindow;
    }

    /**
     * This back to the start window, if the player do, theUserIsBack will be true
     */
    @FXML
    void back(ActionEvent event) {
        principalWindow.close();
        try {
            startWindow = new StartWindow();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        startWindow.show();
        theUserIsBack = true;
    }
    /**
     * An internal class that have helpers functions
     *
     */
    public class HelpersFunctions {
        /**
         * Retrieves and displays a new random phrase on the screen and displays the actual level that the user is
         */
        public void printLabels() {
            String phrase = phrases.getPhrase(gameModel.getLevel());
            labelPhrases.setText(phrase);
            int level = gameModel.getLevel();
            labelLevel.setText("Level: " + level);
        }
        /**
         * Displays the statistics window at the end of the game.
         * It creates a new {@link StatisticsWindow} and shows it to the user.
         * if the player plays back, to do not show the statistic window, we validated that the user is not back
         */
        public void showStatistics() {
            if(!theUserIsBack){
                try {
                     statisticsWindow = new StatisticsWindow(gameModel, principalWindow);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                statisticsWindow.show();
            }

        }

    }

    HelpersFunctions helpers = new HelpersFunctions();



    /**
     * Initializes the controller after the FXML has been loaded.
     * This method sets up the initial game state, prints the first phrase,
     * and starts the game timer.
     */
    @FXML
    private void initialize() {

        helpers.printLabels();
        startTimer();
        theUserIsBack = false;
    }




    /**
     * Handles the action when the user presses Enter on the input field.
     * It gets the user input and clears the text field.
     *
     * @param event The action event from the text field.
     */
    @FXML
    void enter(ActionEvent event) {
        this.userInput = myInput.getText();
        myInput.clear();
    }

    /**
     * Validates the user's input against the current phrase.
     * If correct, it advances the level and updates the UI. If incorrect, it counts a failure.
     */
    @FXML
    void validateInput() {
        if (gameModel.isInputIsCorrect(userInput)) {
            stopTImer();
            gameModel.levelUp();
            startTimer();
            labelMessage.setText("      ¡That's correct! 🎉 ");
            labelMessage.setStyle("-fx-text-fill: #3ed0c6; ");
            inputIsValid = true;

           helpers.printLabels();
        } else {
            labelMessage.setText("   You fail 😕 try again");
            labelMessage.setStyle("-fx-text-fill: #ff0000;");
            gameModel.countFailures();
            inputIsValid = false;

        }
    }

    /**
     * Detects key presses in the input field.
     * Specifically, it triggers the validation logic when the Enter key is pressed.
     *
     * @param eventT The key event.
     * @throws IOException if there is an issue during the process.
     */
    @FXML
    void detectKey(KeyEvent eventT) throws IOException {
        KeyCode key = eventT.getCode();
        labelMessage.setStyle("-fx-text-fill: black; -fx-font-weight: bold;");
        labelMessage.setText(key.toString());

        if (key == KeyCode.ENTER) {
            validateInput();
        }
    }

    private Timeline timeline;

    /**
     * Starts or restarts the game timer and the progress bar animation.
     * It retrieves the total time from the game model, sets up a timeline for the progress bar animation,
     * and a separate timeline for the second-by-second countdown logic. It handles the game over
     * conditions for both time running out and the player winning.
     */
    @FXML
    private void startTimer() {
        int time = gameModel.getTime();
        progressBar.setProgress(1.0);
        myTimer.setText(String.valueOf(time));
        //create the progres barr animation
        Timeline progressBarTimeLine = new Timeline(
                // Animated since 1.0 to 0.0
                new KeyFrame(Duration.seconds(time), new KeyValue(progressBar.progressProperty(), 0.0))
        );
        progressBarTimeLine.setCycleCount(time);
        progressBarTimeLine.play();
        timeline = new Timeline(
                new KeyFrame(Duration.seconds(1), event -> {
                    int actualTime = Integer.parseInt(myTimer.getText()) - 1;
                    gameModel.setRemainingTime(actualTime);
                    myTimer.setText(String.valueOf(actualTime));

                    if (actualTime == 0) {

                        this.userInput= myInput.getText();
                        myInput.clear();
                        validateInput();
                        if(!inputIsValid){
                            timeline.stop();
                            progressBarTimeLine.stop();
                            myTimer.setText("0");
                            labelMessage.setText("Time is OUT, GAME OVER");
                            myInput.setDisable(true);
                            principalWindow.close();
                            helpers.showStatistics();
                        }


                    } else if (gameModel.getPlayerIsWin()) {


                        timeline.stop();
                        progressBarTimeLine.stop();
                        labelMessage.setText("YOU WIN, GAME OVER");
                        myInput.setDisable(true);
                        principalWindow.close();
                        helpers.showStatistics();
                    }
                })
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    /**
     * Stops the main game countdown timer.
     * This method is typically called when the game ends, either by the user
     * completing the phrase or by the timer running out.
     */

    private void stopTImer() {
        timeline.stop();

    }

    /**
     * Closes the main game window when the corresponding button is clicked.
     *
     * @param event The action event triggered by the button.
     */
    @FXML
    void closeGame(ActionEvent event) {
        principalWindow.close();
    }



}