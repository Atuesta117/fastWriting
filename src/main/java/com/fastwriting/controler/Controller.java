package com.fastwriting.controler;

import com.fastwriting.model.GameModel;
import com.fastwriting.model.Phrases;
import com.fastwriting.view.PrincipalWindow;
import com.fastwriting.view.StartWindow;
import com.fastwriting.view.StatisticsWindow;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.stage.Stage;
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

    /**
     * Sets the reference to the {@link PrincipalWindow} this controller manages.
     *
     * @param principalWindow The {@code PrincipalWindow} instance.
     */
    public void setPrincipalWindow(PrincipalWindow principalWindow) {
        this.principalWindow = principalWindow;
    }

    private GameModel gameModel = new GameModel();
    private Phrases phrases = new Phrases();
    private StatisticsWindow statisticsWindow;
    private String userInput;
    private boolean inputIsCorrect = true;

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
    private Button playAgain;

    @FXML
    private Button closeGame;

    /**
     * Closes the main game window.
     *
     * @param event The action event triggered by the button.
     */
    @FXML
    private void closeGame(ActionEvent event) {
        principalWindow.close();
    }

    /**
     * Initializes the controller after the FXML has been loaded.
     * This method sets up the initial game state, prints the first phrase,
     * and starts the game timer.
     */
    @FXML
    private void initialize() {
        printLevel();
        printPhrase();
        startTimer();
        gameModel.startGame();
        playAgain.setDisable(true);
    }

    /**
     * Displays the statistics window at the end of the game.
     * It creates a new {@link StatisticsWindow} and shows it to the user.
     */
    void mostrarEstadisticas() {
        try {
            StatisticsWindow statsWindow = new StatisticsWindow(gameModel);
            statsWindow.show();
        } catch (IOException e) {
            System.err.println("Error opening statistic window: " + e.getMessage());
        }
    }

    /**
     * Retrieves and displays a new random phrase on the screen.
     */
    void printPhrase() {
        String phrase = phrases.getPhrase(gameModel.getLevel());
        labelPhrases.setText(phrase);
    }

    /**
     * Updates the level label on the screen with the current game level.
     */
    void printLevel() {
        int level = gameModel.getLevel();
        labelLevel.setText("Level: " + Integer.toString(level));
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
            inputIsCorrect = true;
            System.out.println(inputIsCorrect);
            printPhrase();
            printLevel();
        } else {
            labelMessage.setText("   You fail 😕 try again");
            labelMessage.setStyle("-fx-text-fill: #ff0000;");
            inputIsCorrect = false;
            gameModel.countFailures();
            System.out.println(inputIsCorrect);
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
            myInput.clear();
        }
    }

    private Timeline timeline;

    /**
     * Starts or restarts the game timer.
     * It sets a countdown and handles the game over logic when the time runs out.
     */
    @FXML
    private void startTimer() {
        int time = gameModel.getTime();
        myTimer.setText(String.valueOf(time));

        timeline = new Timeline(
                new KeyFrame(Duration.seconds(1), event -> {
                    int actualTime = Integer.parseInt(myTimer.getText()) - 1;
                    gameModel.setRemainingTime(actualTime);
                    myTimer.setText(String.valueOf(actualTime));

                    if (actualTime == 0) {
                        playAgain.setDisable(false);
                        gameModel.setIsPlaying(false);
                        timeline.stop();
                        myTimer.setText("0");
                        labelMessage.setText("Time is OUT, GAME OVER");
                        myInput.setDisable(true);
                        mostrarEstadisticas();
                    } else if (gameModel.getPlayerIsWin()) {
                        playAgain.setDisable(false);
                        gameModel.setIsPlaying(false);
                        timeline.stop();
                        labelMessage.setText("YOU WIN, GAME OVER");
                        myInput.setDisable(true);
                        mostrarEstadisticas();
                    }
                })
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    /**
     * Stops the game timer.
     */
    private void stopTImer() {
        timeline.stop();
    }

    /**
     * Handles the "Play Again" button action.
     * It closes the current game window and opens a new one to start a new game.
     *
     * @param event The action event triggered by the button.
     */
    @FXML
    void playAgain(ActionEvent event) {
        if (!gameModel.getIsPlaying()) {
            principalWindow.close();
            PrincipalWindow newPrincipalWindow;
            try {
                newPrincipalWindow = new PrincipalWindow();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            newPrincipalWindow.show();
        }
    }
}