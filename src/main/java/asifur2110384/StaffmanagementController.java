package asifur2110384;

import com.example.group13.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.io.IOException;

public class StaffmanagementController
{
    @javafx.fxml.FXML
    private Label outputLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void currentButtonOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void addButtonOnAction(ActionEvent actionEvent) {
    }

    @Deprecated
    public void loginButtonOnAction(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("login.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void BackButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/asifur2110384/managerdashboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void assignOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void workinghourOnAction(ActionEvent actionEvent) {
    }
}