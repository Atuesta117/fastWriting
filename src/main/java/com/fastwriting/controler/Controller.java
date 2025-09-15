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

public class Controller {
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
    private void initialize() {
        // ✅ INICIALIZAR con una frase al empezar
        printPhrase();
    }

    void printPhrase(){
        String phrase = phrases.getPhrase(gameModel.getLevel());
        // ✅ ¿Qué Label quieres usar? labelLevel o labelPhrases?
        labelPhrases.setText(phrase);  // ← Cambié a labelPhrases
        System.out.println("Frase actual: " + phrase+ gameModel.getLevel());  // ✅ Debug en consola
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
            gameModel.levelUp();
            labelMessage.setText("¡That's correct! 🎉 ");
            labelMessage.setStyle("-fx-text-fill: green; -fx-font-weight: bold;");
            inputIsCorrect = true;
            System.out.println(inputIsCorrect);
            printPhrase();  // ✅ ¡AHORA SÍ se llama!
        }
        else {
            labelMessage.setText("You fail 😕 try again");
            labelMessage.setStyle("-fx-text-fill: red; -fx-font-weight: bold;");
            inputIsCorrect = false;
            System.out.println(inputIsCorrect);
        }
    }

    @FXML
    void detectKey(KeyEvent eventT) {
        KeyCode key = eventT.getCode();
        labelMessage.setText(key.toString());

        // ✅ También validar con Enter directamente aquí
        if (key == KeyCode.ENTER) {

            validateInput();
            myInput.clear();
        }
    }
}