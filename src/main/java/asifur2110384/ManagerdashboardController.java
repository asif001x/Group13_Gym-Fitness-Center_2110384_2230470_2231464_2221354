package asifur2110384;

import com.example.group13.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.io.IOException;

public class ManagerdashboardController
{
    @javafx.fxml.FXML
    private Label outputLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("login.fxml", actionEvent);
    }


    @javafx.fxml.FXML
    public void meetingOnAction(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/asifur2110384/meetingschedule.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void classOnAction(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/asifur2110384/classscheduling.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void communicationOnAction(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/asifur2110384/communicationwithstaff.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void reportOnAction(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/asifur2110384/reportinganalytics.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void paymentOnAction(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/asifur2110384/prymentprocessing.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void hpOnAction(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/asifur2110384/hiringprotionuser.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void staffOnAction(ActionEvent actionEvent)  throws IOException{
        SceneSwitcher.switchTo("/asifur2110384/staffmanagement .fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void membersOnAction(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("/asifur2110384/membershipplan.fxml", actionEvent);
    }
}