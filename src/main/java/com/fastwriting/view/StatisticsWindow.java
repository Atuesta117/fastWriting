package com.fastwriting.view;

import com.fastwriting.controler.StartController;
import com.fastwriting.controler.StatisticsController;
import com.fastwriting.model.GameModel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Represents a JavaFX window that displays the game statistics.
 * This class extends {@link javafx.stage.Stage} and is responsible for
 * loading the {@code statisticsWindow.fxml} file, setting the appropriate
 * controller, and displaying the statistics from a {@link com.fastwriting.model.GameModel} object.
 * The window is not resizable.
 */
public class StatisticsWindow extends Stage {

    /**
     * Constructs a new {@code StatisticsWindow} to display the game statistics.
     * It loads the FXML layout, links it to the {@link StatisticsController}, and
     * initializes the view with data from the {@link GameModel}. The window is
     * set to a fixed size and titled "Statistics".
     *
     * @param gameModel The {@code GameModel} containing the game session data, which is used to populate the statistics view.
     * @throws IOException If the {@code statisticsWindow.fxml} file cannot be loaded.
     */
    public StatisticsWindow(GameModel gameModel) throws IOException {

        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/fastwriting/statisticsWindow.fxml")); // ✅take de fxml

            Parent root = loader.load();
            StatisticsController controller = loader.getController();
            controller.setStatisticWindow(this);


            controller.showStatistics(gameModel);


            Scene scene = new Scene(root);
            this.setScene(scene);
            this.setTitle("Statistics");
            this.setResizable(false);

        } catch (Exception e) {
            System.err.println("Error creating StatisticsWindow: " + e.getMessage());
            throw e; // this will not be realized
        }
    }
}