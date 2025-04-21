package asifur2110384;

import com.example.group13.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Optional;

public class MembershipplanController {

    @FXML
    private DatePicker dateDatePicker;
    @FXML
    private Label outputLabel;
    @FXML
    private TextField priceTextField;
    @FXML
    private TextField plannameTextField;

    @FXML
    public void initialize() {
        outputLabel.setText("");
    }

    @FXML
    public void addButtonOnAction(ActionEvent actionEvent) {
        String planName = plannameTextField.getText().trim();
        String price = priceTextField.getText().trim();
        LocalDate date = dateDatePicker.getValue();

        if (planName.isEmpty() || price.isEmpty() || date == null) {
            outputLabel.setText("Please fill in all fields.");
            return;
        }

        // Simulate saving plan
        outputLabel.setText(" Plan added: " + planName + " | $" + price + " | Starts: " + date);
        plannameTextField.clear();
        priceTextField.clear();
        dateDatePicker.setValue(null);
    }

    @FXML
    public void currentButtonOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Showing current active membership plans");

    }

    @FXML
    public void upcomingButtonOnAction(ActionEvent actionEvent) {
        outputLabel.setText("Showing upcoming membership plans");
        // You can add future-date filtering here
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
