package asifur2110384;

import com.example.group13.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.Optional;

public class StaffmanagementController {

    @FXML
    private Label outputLabel;

    @FXML
    public void initialize() {
        outputLabel.setText("");
    }

    @FXML
    public void currentButtonOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Viewing current staff...");
    }

    @FXML
    public void addButtonOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Adding a new staff member...");
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
    public void logoutButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group13/login.fxml", actionEvent);

    }

    @FXML
    public void assignOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Assigning staff to tasks");

    }

    @FXML
    public void workinghourOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Managing staff working hours");

    }
}
