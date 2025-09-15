package com.fastwriting;

import com.fastwriting.view.PrincipalWindow;
import com.fastwriting.view.StartWindow;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
       StartWindow startWindow = new StartWindow();
       startWindow.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
