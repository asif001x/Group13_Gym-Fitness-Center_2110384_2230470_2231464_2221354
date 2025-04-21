module com.example.group {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires jdk.jfr;

    opens com.example.group13 to javafx.fxml;
    exports com.example.group13;
    opens bashar2230470 to javafx.fxml;
    exports bashar2230470;

}
