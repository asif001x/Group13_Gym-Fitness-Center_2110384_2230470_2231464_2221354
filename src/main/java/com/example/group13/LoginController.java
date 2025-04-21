package com.example.group13;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController
{
    @javafx.fxml.FXML
    private ComboBox<String> typeComboBox;
    @javafx.fxml.FXML
    private PasswordField passwordPasswordField;
    @javafx.fxml.FXML
    private TextField useridTextField;

    @javafx.fxml.FXML
    public void initialize() {
        typeComboBox.getItems().setAll("Manager","Maintenance Officer","Member");
    }

    @javafx.fxml.FXML
    public void loginButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/asifur2110384/managerdashboard.fxml", actionEvent);
    }

    @javafx.fxml.FXML
    public void createaccountOnAction(ActionEvent actionEvent) {
    }
}