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

public class StatisticsWindow extends Stage {


    public StatisticsWindow(GameModel gameModel) throws IOException {

        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/com/fastwriting/statisticsWindow.fxml")); // ✅ Usar getClass()

            Parent root = loader.load();
            StatisticsController controller = loader.getController();
            controller.setStatisticWindow(this);


            controller.showStatistics(gameModel);


            Scene scene = new Scene(root);
            this.setScene(scene);
            this.setTitle("Statistics");
            this.setResizable(false);

        } catch (Exception e) {
            System.err.println("Error grave creando StatisticsWindow: " + e.getMessage());
            throw e; // Relanzar la excepción
        }
    }

}
