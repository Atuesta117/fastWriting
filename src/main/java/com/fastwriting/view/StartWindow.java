package com.fastwriting.view;

import com.fastwriting.controler.StartController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;

public class StartWindow extends Stage{

    public StartWindow() throws IOException{
        FXMLLoader loader = new FXMLLoader(
                StartWindow.class.getResource("/com/fastwriting/startWindow.fxml")
        );
        Parent root = loader.load();
        Scene scene = new Scene(root);
        this.setScene(scene);
        this.setTitle("FastWriting");
        this.setResizable(false);
        StartController controller = loader.getController();
        controller.setStartWindow(this); // ¡Esta línea es crucial!
    }



}
