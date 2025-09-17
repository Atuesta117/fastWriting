package com.fastwriting.controler;

import com.fastwriting.view.RulesView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * Controller for the rules window.
 * This class manages user interactions within the rules view.
 */
public class RulesController {
    @FXML
    private RulesView view;

    /**
     * Sets the reference to the {@link RulesView} this controller manages.
     *
     * @param view The {@code RulesView} instance.
     */
    public void setRulesView(RulesView view) {
        this.view = view;
    }

    @FXML
    private Button close;

    /**
     * Handles the action of the "Close" button.
     * It closes the rules window.
     *
     * @param event The action event triggered by the button.
     */
    @FXML
    void close(ActionEvent event) {
        view.close();
    }
}