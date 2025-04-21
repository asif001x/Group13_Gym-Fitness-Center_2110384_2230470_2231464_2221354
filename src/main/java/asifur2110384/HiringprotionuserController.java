package asifur2110384;

import com.example.group13.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class HiringprotionuserController {

    @FXML
    private Label outputLabel;

    @FXML
    public void initialize() {
        outputLabel.setText("");
    }

    @FXML
    public void currentempButtonOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Showing current employees...");

    }

    @FXML
    public void newempButtonOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Showing new employee applicants...");
    }

    @FXML
    public void promotedButtonOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Promoting selected employee...");
    }

    @FXML
    public void notselectButtonOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Applicant marked as not selected.");
    }

    @FXML
    public void selectButtonOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Applicant selected!");

    }

    @FXML
    public void FireButtonOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Employee marked for termination.");

    }

    @FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group13/login.fxml", actionEvent);
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/asifur2110384/managerdashboard.fxml", actionEvent);
    }
}
