package asifur2110384;

import com.example.group13.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ClassschedulingController {

    @FXML
    private ComboBox<String> addregComboBox;

    @FXML
    private TextArea outputTextArea;

    @FXML
    private TextField addtimeTextField;

    @FXML
    public void initialize() {
        addregComboBox.getItems().setAll(
                "Yoga Class",
                "Zumba Class",
                "Strength Training",
                "Cardio Blast",
                "Pilates",
                "Spin Class"
        );
        outputTextArea.setText("");
    }

    @FXML
    public void roomnumberOnAction(ActionEvent actionEvent) {
        String selectedClass = addregComboBox.getValue();
        String time = addtimeTextField.getText().trim();

        if (selectedClass == null || selectedClass.isEmpty()) {
            outputTextArea.setText("Please select a class type.");
        } else if (time.isEmpty()) {
            outputTextArea.setText("Please enter a time for the class.");
        } else {
            outputTextArea.setText(selectedClass + " scheduled at " + time + ".");
            addtimeTextField.clear();
            addregComboBox.getSelectionModel().clearSelection();
        }
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/asifur2110384/managerdashboard.fxml", actionEvent);
    }
}
