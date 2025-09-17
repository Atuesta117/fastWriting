package com.fastwriting.view;

import com.fastwriting.controler.Controller;
import com.fastwriting.controler.StatisticsController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


/**
 * Represents the main game window where the typing test is conducted.
 * This class extends {@link javafx.stage.Stage} and loads the {@code gameView.fxml} layout.
 * It is responsible for setting up the game environment and linking to the main {@link Controller}.
 */
public class PrincipalWindow extends Stage {

    /**
     * Constructs the {@code PrincipalWindow}.
     * It loads the FXML layout, sets up the scene, and initializes the stage with a title.
     * A reference to this window is passed to the main {@link Controller}.
     *
     * @throws IOException if the {@code gameView.fxml} file cannot be loaded.
     */
    public PrincipalWindow() throws IOException {
        // Constructor
        FXMLLoader fxmlLoader = new FXMLLoader(
                PrincipalWindow.class.getResource("/com/fastwriting/gameView.fxml")
        );
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);

        this.setScene(scene);
        this.setTitle("FastWriting");
        this.setResizable(false); // this is for dont resize
        Controller controller = fxmlLoader.getController();
        controller.setPrincipalWindow(this);

    }
}