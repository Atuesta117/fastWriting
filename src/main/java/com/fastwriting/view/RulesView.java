package com.fastwriting.view;

import com.fastwriting.controler.RulesController;
import com.fastwriting.controler.StartController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RulesView extends Stage {

    public RulesView() throws IOException {
        FXMLLoader loader = new FXMLLoader(
                StartWindow.class.getResource("/com/fastwriting/RulesView.fxml")
        );
        Parent root = loader.load();
        Scene scene = new Scene(root);
        this.setScene(scene);
        this.setTitle("FastWriting");
        this.setResizable(false);
        RulesController controller = loader.getController();
        controller.setRulesView(this);
         // ¡Esta línea es crucial!
    }
}
