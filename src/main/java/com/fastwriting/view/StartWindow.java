package com.fastwriting.view;

import com.fastwriting.controler.StartController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * Represents the start window of the application, serving as the initial entry point.
 * This class extends {@link javafx.stage.Stage} and is responsible for
 * loading the {@code startWindow.fxml} layout, setting up the scene, and linking
 * it to the {@link StartController}.
 */
public class StartWindow extends Stage {

    /**
     * Constructs the main {@code StartWindow}.
     * It loads the FXML file for the start view, creates a scene, and sets the stage properties.
     * It also initializes the {@link StartController} and passes a reference to this stage.
     *
     * @throws IOException if the {@code startWindow.fxml} file cannot be loaded.
     */
    public StartWindow() throws IOException {
        FXMLLoader loader = new FXMLLoader(
                StartWindow.class.getResource("/com/fastwriting/startWindow.fxml")
        );

        Parent root = loader.load();
        Scene scene = new Scene(root);

        this.setScene(scene);
        this.setTitle("FastWriting");
        this.setResizable(false);

        StartController controller = loader.getController();
        controller.setStartWindow(this);
    }
}