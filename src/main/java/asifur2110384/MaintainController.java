package asifur2110384;

import com.example.group13.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class MaintainController
{
    @javafx.fxml.FXML
    public void initialize() {
        
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("login.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/asifur2110384/managerdashboard.fxml", actionEvent);
    }
}