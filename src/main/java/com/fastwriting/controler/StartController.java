package com.fastwriting.controler;

import com.fastwriting.view.PrincipalWindow;
import com.fastwriting.view.RulesView;
import com.fastwriting.view.StartWindow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Controller for the start window.
 * This class handles the user actions on the initial screen, such as
 * starting a new game or viewing the rules.
 */
public class StartController {
    @FXML
    private StartWindow startWindow;
    private PrincipalWindow principal;
    private RulesView rulesView;

    {
        try {
            rulesView = new RulesView();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Sets the reference to the {@link StartWindow} this controller manages.
     *
     * @param startWindow The {@code StartWindow} instance.
     */
    public void setStartWindow(StartWindow startWindow) {
        this.startWindow = startWindow;
    }

    @FXML
    private void initialize() {
        // Method called when the FXML is loaded.
    }

    /**
     * Handles the action of the "Start" button.
     * It closes the current start window and opens the main game window ({@link PrincipalWindow}).
     */
    @FXML
    Button startButon;
    @FXML
    private void handleStartButton(ActionEvent event) {
        try {
            startWindow.close();
            this.principal = new PrincipalWindow();
            principal.show();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @FXML
    Button rules;

    /**
     * Handles the action of the "Rules" button.
     * It displays the rules window ({@link RulesView}).
     *
     * @param event The action event triggered by the button.
     */
    @FXML
    void rules(ActionEvent event) {
        rulesView.show();
    }

    @FXML
    private Button closeWindow;
    @FXML
    void closeWindow(ActionEvent event) {
            startWindow.close();
    }
}