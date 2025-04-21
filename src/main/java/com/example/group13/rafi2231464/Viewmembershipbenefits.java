package com.example.group13.rafi2231464;

import com.example.group13.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class Viewmembershipbenefits {

    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private TextArea textAreaFX;

    @javafx.fxml.FXML
    public void initialize() {
        textAreaFX.setText(
                "🌟 Gym Membership Benefits 🌟\n\n" +
                        "✔ Unlimited access to all equipment\n" +
                        "✔ Group fitness classes (Zumba, Yoga, HIIT, etc.)\n" +
                        "✔ One free personal training session every month\n" +
                        "✔ Locker and shower facilities\n" +
                        "✔ Discounts on supplements and merchandise\n" +
                        "✔ Access to wellness seminars and events\n" +
                        "✔ Priority booking for premium services\n\n" +
                        "Stay fit, stay strong!"
        );
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("rafi2231464/u6dashboard.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Security Officer Dashboard");
        stage.show();
    }

}
