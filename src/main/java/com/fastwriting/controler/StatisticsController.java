package com.fastwriting.controler;

import com.fastwriting.model.GameModel;
import com.fastwriting.view.PrincipalWindow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class StatisticsController {


    public StatisticsController() {


    }
    @FXML
    private Button closeGame;

    @FXML
    private Label label;

    @FXML
    private Button playAgain;

    @FXML
    private TextField text1;

    @FXML
    private TextField text2;

    @FXML
    private TextField text3;
    @FXML
    public void showStatistics(GameModel gameModel){
        text1.setText(Integer.toString(gameModel.getSuccess()));
        text2.setText(Integer.toString(gameModel.getFailures()));
        text3.setText(Integer.toString(gameModel.getRemainingTime()));

        if(gameModel.getPlayerIsWin()){
            label.setText("CONGRATULATIONS, YOU WIN!!!");
        }
        else{
            label.setText("GAME OVER");
        }
    }



}