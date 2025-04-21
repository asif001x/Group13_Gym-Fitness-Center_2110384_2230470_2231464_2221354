package asifur2110384;

import com.example.group13.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;

public class MeetingscheduleController {

    @FXML
    private DatePicker dateDatePicker;
    @FXML
    private Label outputLabel;
    @FXML
    private TextField timeTextField;
    @FXML
    private TextField reasonTextField;

    @FXML
    public void initialize() {
        outputLabel.setText("");
        timeTextField.setPromptText("10:30 AM");
        reasonTextField.setPromptText("Reason for meeting");
    }

    @FXML
    public void addButtonOnAction(ActionEvent actionEvent) {
        LocalDate date = dateDatePicker.getValue();
        String time = timeTextField.getText().trim();
        String reason = reasonTextField.getText().trim();

        if (date == null || time.isEmpty() || reason.isEmpty()) {
            outputLabel.setText("Please fill in all fields.");
            return;
        }

        // Simulate storing meeting details
        outputLabel.setText("✅ Meeting scheduled on " + date + " at " + time + " for: " + reason);

        // Clear fields
        dateDatePicker.setValue(null);
        timeTextField.clear();
        reasonTextField.clear();
    }

    @FXML
    public void upcomingButtonOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Showing upcoming meetings");
        // Placeholder: add future meeting display logic here
    }

    @FXML
    public void loginButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/group13/login.fxml", actionEvent);
    }

    @FXML
    public void BackButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/asifur2110384/managerdashboard.fxml", actionEvent);
    }
}
