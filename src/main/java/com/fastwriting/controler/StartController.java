package com.fastwriting.controler;

import com.fastwriting.view.PrincipalWindow;
import com.fastwriting.view.StartWindow;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class StartController {
    @FXML
    private StartWindow startWindow;
    public void setStartWindow(StartWindow startWindow) {
        this.startWindow = startWindow;
    }
    @FXML
    private void initialize() {}

    @FXML
    private void handleStartButton() {
        try {
            startWindow.close();
            PrincipalWindow principal = new PrincipalWindow();
            principal.show();


        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
