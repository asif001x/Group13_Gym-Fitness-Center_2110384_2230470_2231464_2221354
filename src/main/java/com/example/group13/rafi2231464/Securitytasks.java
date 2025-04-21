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

import java.io.*;

public class Securitytasks {
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private TextArea taskTextArea;
    private final String FILE_PATH = "tasks.txt";

    @javafx.fxml.FXML
    public void initialize() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            taskTextArea.setText(content.toString());
        } catch (IOException e) {
            taskTextArea.setText("• Check main gate cameras\n• Inspect fire extinguishers\n• Ensure emergency exits are clear");
        }
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("rafi2231464/u5dashboard.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Security Officer Dashboard");
        stage.show();
    }

    @javafx.fxml.FXML
    public void handleSaveButton(ActionEvent event) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write(taskTextArea.getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
