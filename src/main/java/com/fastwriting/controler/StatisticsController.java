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

    /**
     * Closes the statistics window when the close button is clicked.
     *
     * @param event The action event triggered by the button.
     * @throws IOException if there is an error closing the window.
     */
    @FXML
    void closeWindow(ActionEvent event) throws IOException {
        if (window != null) {
            window.close();
        }
    }
}