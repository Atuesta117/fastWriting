package com.fastwriting;

import com.fastwriting.view.PrincipalWindow;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage primaryStage) throws Exception {
       PrincipalWindow principalWindow= new PrincipalWindow();
        principalWindow.show();
    }
}
