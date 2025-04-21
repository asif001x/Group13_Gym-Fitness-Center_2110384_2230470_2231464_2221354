package asifur2110384;

import com.example.group13.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.Optional;

public class PrymentprocessingController {

    @FXML
    private Label outputLabel;

    @FXML
    public void initialize() {
        outputLabel.setText("");
    }

    @FXML
    public void currentButtonOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Showing current payment records");
    }

    @FXML
    public void addButtonOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Adding new payment record");

    }

    @FXML
    public void loginButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group13/login.fxml", actionEvent);
    }

    @FXML
    public void BackButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/asifur2110384/managerdashboard.fxml", actionEvent);
    }

    @FXML
    public void paidButtonOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Displaying list of paid members");

    }

    @FXML
    public void dueButtonOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Displaying list of members with due payments");
    }

    @FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group13/login.fxml", actionEvent);
    }
}
