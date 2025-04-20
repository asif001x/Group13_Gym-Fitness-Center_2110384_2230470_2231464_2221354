module com.example.group13 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires jdk.jfr;


    opens com.example.group13 to javafx.fxml;
    exports com.example.group13;
}