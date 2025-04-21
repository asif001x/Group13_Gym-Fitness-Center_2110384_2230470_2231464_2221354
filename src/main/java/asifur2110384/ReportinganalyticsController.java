package asifur2110384;

import com.example.group13.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.IOException;
import java.util.Optional;

public class ReportinganalyticsController {

    @FXML
    private Label outputLabel;
    @FXML
    private TextArea smsTextArea;

    @FXML
    public void initialize() {
        outputLabel.setText(""); // Clear output on load
        smsTextArea.setPromptText("Write your SMS report here");
    }

    @FXML
    public void currentButtonOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Showing current analytics reports");
        // Placeholder: Load and display reports
    }

    @FXML
    public void sendButtonOnAction(ActionEvent actionEvent) {
        String message = smsTextArea.getText().trim();

        if (message.isEmpty()) {
            outputLabel.setText("⚠ Please enter a message before sending.");
        } else {
            // Simulate sending the message
            outputLabel.setText("✅ Message sent: " + message);
            smsTextArea.clear();
        }
    }

    @FXML
    public void feedBackButtonOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Opening feedback viewer");

    }

    @FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group13/login.fxml", actionEvent);
    }

    @FXML
    public void BackButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/asifur2110384/managerdashboard.fxml", actionEvent);
    }
}
