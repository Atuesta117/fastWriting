package com.fastwriting.controler;

import com.fastwriting.view.RulesView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class RulesController {
    @FXML
    private RulesView view;
    public void setRulesView(RulesView view){
        this.view = view;
    }
    private void inicialize(){

    }
    @FXML
    private Button close;


    @FXML
    void close(ActionEvent event) {
        view.close();
    }





}
