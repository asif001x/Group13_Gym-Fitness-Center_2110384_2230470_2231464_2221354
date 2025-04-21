package asifur2110384;

import com.example.group13.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class CommunicationwithstaffController {

    @FXML
    private Label outputLabel;
    @FXML
    private ComboBox<String> userCombo;
    @FXML
    private TextArea smsTextArea;

    @FXML
    public void initialize() {
        // Prepopulate ComboBox with staff roles or names
        userCombo.getItems().setAll(
                "Maintenance Officer",
                "Account Officer",
                "Trainer",
                "Security Officer",
                "Member"
        );
        outputLabel.setText("");
        smsTextArea.setPromptText("Write your message here");
    }

    @FXML
    public void sendButtonOnAction(ActionEvent actionEvent) {
        String recipient = userCombo.getValue();
        String message = smsTextArea.getText().trim();

        if (recipient == null || recipient.isEmpty()) {
            outputLabel.setText("Please select a recipient");
        } else if (message.isEmpty()) {
            outputLabel.setText("Please write a message.");
        } else {
            outputLabel.setText("Message sent to " + recipient + ": " + message);
            smsTextArea.clear();
        }
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
