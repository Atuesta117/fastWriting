package com.fastwriting.controler;

import com.fastwriting.model.GameModel;
import com.fastwriting.view.PrincipalWindow;
import com.fastwriting.view.StartWindow;
import com.fastwriting.view.StatisticsWindow;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class StatisticsController {
    @FXML
    private StatisticsWindow window;
    @FXML
    private PrincipalWindow principalWindow;
    public void setPrincipalWindow(PrincipalWindow principalWindow) {
        this.principalWindow = principalWindow;
    }
    public void setStatisticWindow(StatisticsWindow window) {
    this.window =  window;

    }
    @FXML
    private void initialize() {}
    @FXML
    private Button closeGame;

    @FXML
    private Label label;


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
    @FXML
    void  closeWindow(ActionEvent event) throws IOException {
        if(window!=null){
            window.close();
        }
    }
    @FXML
    private Button playAgain;

    @FXML
    void playAgainAction(ActionEvent event) throws IOException {
        principalWindow.close();
        window.close();
        PrincipalWindow newWindow = new PrincipalWindow();
        newWindow.show();
    }

}