package com.fastwriting.view;

import com.fastwriting.controler.RulesController;
import com.fastwriting.controler.StartController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Represents a JavaFX window that displays the game rules to the user.
 * This class extends {@link javafx.stage.Stage} and loads the
 * {@code RulesView.fxml} layout. It is a non-resizable window.
 */
public class RulesView extends Stage {

    /**
     * Constructs a new {@code RulesView}.
     * This constructor loads the FXML layout for the rules, sets up the scene,
     * and links the view to its corresponding {@link RulesController}.
     *
     * @throws IOException if the {@code RulesView.fxml} file cannot be loaded.
     */
    public RulesView() throws IOException {
        FXMLLoader loader = new FXMLLoader(
                StartWindow.class.getResource("/com/fastwriting/RulesView.fxml")
        );
        this.initStyle(javafx.stage.StageStyle.UNDECORATED);
        Parent root = loader.load();
        Scene scene = new Scene(root);
        this.setScene(scene);
        this.setTitle("FastWriting");
        this.setResizable(false);
        RulesController controller = loader.getController();
        controller.setRulesView(this);
    }
}