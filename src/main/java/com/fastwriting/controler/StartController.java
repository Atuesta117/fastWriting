package com.fastwriting.controler;

import com.fastwriting.view.PrincipalWindow;
import com.fastwriting.view.RulesView;
import com.fastwriting.view.StartWindow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
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

    public void setStartWindow(StartWindow startWindow) {
        this.startWindow = startWindow;
    }
    @FXML
    private void initialize() {}

    @FXML
    private void handleStartButton() {
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

    @FXML
    void rules(ActionEvent event) {
        rulesView.show();

    }


}


