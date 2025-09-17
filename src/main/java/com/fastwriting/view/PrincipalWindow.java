package com.fastwriting.view;

import com.fastwriting.controler.Controller;
import com.fastwriting.controler.StatisticsController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class PrincipalWindow extends Stage {

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
