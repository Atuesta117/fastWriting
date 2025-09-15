package com.fastwriting.controler;
import com.fastwriting.model.GameModel;
import com.fastwriting.model.Phrases;
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

import java.util.Objects;

public class Controller {
    public Controller() {}
    private GameModel gameModel = new GameModel();
    private Phrases phrases = new Phrases();
    private String userInput;
    private boolean inputIsCorrect = true;
    @FXML
    private Label labelLevel;

    @FXML
    private Label labelMessage;

    @FXML
    private Label labelPhrases;  // ✅ ¿Es este el Label para la frase?

    @FXML
    private TextField myInput;

    @FXML
    private Label myTimer;

    @FXML
    private ImageView imageValidator;



    @FXML
    private void initialize() {
        printLevel();
        printPhrase();
        startTimer();
        gameModel.startGame();


    }


    void printPhrase() {
        String phrase = phrases.getPhrase(gameModel.getLevel());
        // ✅ ¿Qué Label quieres usar? labelLevel o labelPhrases?
        labelPhrases.setText(phrase);  // ← Cambié a labelPhrases
        System.out.println("Frase actual: " + phrase + gameModel.getLevel());  // ✅ Debug en consola
    }
    void printLevel() {
        int level = gameModel.getLevel();
        labelLevel.setText(Integer.toString(level));
    }

    @FXML
    void enter(ActionEvent event) {
        this.userInput = myInput.getText();  // ✅ Obtener texto ACTUAL
        System.out.println("Input: " + userInput);


        myInput.clear();
    }

    @FXML
    void validateInput() {  // ✅ Recibir input como parámetro
        if (gameModel.isInputIsCorrect(userInput)) {
            stopTImer();
            gameModel.levelUp();
            startTimer();
            labelMessage.setText("¡That's correct! 🎉 ");

            labelMessage.setStyle("-fx-text-fill: green; -fx-font-weight: bold;");
            inputIsCorrect = true;
            System.out.println(inputIsCorrect);
            printPhrase();
            printLevel();
        } else {
            labelMessage.setText("You fail 😕 try again");
            labelMessage.setStyle("-fx-text-fill: red; -fx-font-weight: bold;");
            inputIsCorrect = false;

            System.out.println(inputIsCorrect);
        }
    }

    @FXML
    void detectKey(KeyEvent eventT) {
        KeyCode key = eventT.getCode();
        labelMessage.setStyle("-fx-text-fill: black; -fx-font-weight: bold;");
        labelMessage.setText(key.toString());

        // ✅ También validar con Enter directamente aquí
        if (key == KeyCode.ENTER) {
            validateInput();
            myInput.clear();
        }
    }

    private Timeline timeline;
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
                        System.out.println("hola?????");
                        timeline.stop();
                        myTimer.setText("0");
                        labelMessage.setText("Time is OUT, GAME OVER");
                        myInput.setDisable(true);
                    }
                })
        );

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void stopTImer() {
        timeline.stop();
    }

}


