package com.fastwriting.controler;

import com.fastwriting.view.PrincipalWindow;
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


}
