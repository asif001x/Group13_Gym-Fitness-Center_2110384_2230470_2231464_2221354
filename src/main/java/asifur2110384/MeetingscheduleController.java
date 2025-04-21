package asifur2110384;

import com.example.group13.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class MeetingscheduleController
{
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private Label outputLabel;
    @javafx.fxml.FXML
    private TextField timeTextField;
    @javafx.fxml.FXML
    private TextField reasonTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loginButtonOnAction(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("login.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void BackButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/asifur2110384/managerdashboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void upcomingButtonOnAction(ActionEvent actionEvent) {
    }
}