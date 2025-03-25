module com.example.group13 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.group13 to javafx.fxml;
    exports com.example.group13;
}