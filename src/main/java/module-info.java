module com.example.group13 {
        requires javafx.controls;
        requires javafx.fxml;


        opens com.example.group13 to javafx.fxml;
        exports com.example.group13;
    opens com.example.group13.rafi2231464 to javafx.fxml, javafx.graphics;
    exports com.example.group13.rafi2231464;

}