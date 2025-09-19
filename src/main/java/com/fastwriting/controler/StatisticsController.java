package com.fastwriting.controler;

import com.fastwriting.model.GameModel;
import com.fastwriting.view.PrincipalWindow;
import com.fastwriting.view.StartWindow;
import com.fastwriting.view.StatisticsWindow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Controller for the statistics window.
 * This class handles the logic for displaying game statistics after a game session ends.
 */
public class StatisticsController {
    @FXML
    private StatisticsWindow window;


    /**
     * Sets the reference to the {@link StatisticsWindow} this controller manages.
     *
     * @param window The {@code StatisticsWindow} instance.
     */
    public void setStatisticWindow(StatisticsWindow window) {
        this.window = window;
    }



    /**
     * Initializes the controller after the FXML has been loaded.
     * This method is called automatically and can be used for initial setup tasks.
     * At the moment, it doesn't perform any actions.
     */
    @FXML
    private void initialize() {
        // Method called when the FXML is loaded.
    }

    @FXML
    private Button closeGame;

    @FXML
    private Label labelLevel;

    @FXML
    private TextField text1;

    @FXML
    private TextField text2;

    @FXML
    private TextField text3;

    /**
     * Populates the statistics window with data from the game model.
     * This method is called by the main game controller to display the final
     * results (success, failures, time) and the game outcome.
     *
     * @param gameModel The {@link GameModel} containing the final game statistics.
     */
    @FXML
    public void showStatistics(GameModel gameModel) {
        text1.setText(Integer.toString(gameModel.getSuccess()));
        text2.setText(Integer.toString(gameModel.getFailures()));
        text3.setText(Integer.toString(gameModel.getRemainingTime()));

        if (gameModel.getPlayerIsWin()) {
            labelLevel.setText("YOU WIN!!!");
        } else {
            labelLevel.setText("GAME OVER");
        }
    }


    @FXML
    private Button playAgain;

    /**
     * Restarts the game by closing the statistics window and opening a new main game window.
     * This provides the user with a fresh game session.
     *
     * @param event The action event triggered by the button.
     */
    @FXML
    void playAgain(ActionEvent event) {
        // Cierra la ventana actual de estadísticas
        if (window != null) {
            window.close();
        }


        // Abre una nueva instancia de la ventana principal para reiniciar el juego
        try {
            PrincipalWindow newPrincipalWindow = new PrincipalWindow();
            newPrincipalWindow.show();
        } catch (IOException e) {
            throw new RuntimeException("Error al abrir la nueva ventana principal", e);
        }
    }


    @FXML
    Button closeWindow;

    /**
     * Handles the action of closing the statistics window and the main game window.
     * This method is called when the user wants to exit the game completely.
     *
     * @param event The action event triggered by the button.
     */
    @FXML
     void closeWindow(ActionEvent event) {
        if (window != null) {
            window.close();
        }

    }
}