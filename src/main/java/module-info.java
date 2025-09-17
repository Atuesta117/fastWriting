module com.fastwriting {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.graphics;
    opens com.fastwriting.controler to javafx.fxml;


    opens com.fastwriting to javafx.fxml;
    exports com.fastwriting;
}