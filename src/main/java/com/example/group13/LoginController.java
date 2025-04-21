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
        typeComboBox.getItems().setAll("Manager","Maintenance Officer","Account Officer","Trainer","Security Officer","Member");
    }

    @javafx.fxml.FXML
    public void loginButtonOnAction(ActionEvent actionEvent) throws IOException {
        String userId = useridTextField.getText().trim();
        String password = passwordPasswordField.getText().trim();
        String userType = typeComboBox.getValue();

        if (userId.isEmpty() || password.isEmpty() || userType == null) {
            System.out.println("⚠ Please fill in all fields.");
            return;
        }

        // Dummy login logic — replace with real DB/auth system later
        boolean isAuthenticated = false;

        switch (userType) {
            case "Manager":
                if (userId.equals("manager") && password.equals("1234")) {
                    SceneSwitcher.switchTo("/asifur2110384/managerdashboard.fxml", actionEvent);
                    isAuthenticated = true;
                }
                break;
            case "Maintenance Officer":
                if (userId.equals("maintenance") && password.equals("maint123")) {
                    SceneSwitcher.switchTo("/asifur2110384/maintenancedashboard.fxml", actionEvent);
                    isAuthenticated = true;
                }
                break;
            case "Account Officer":
                if (userId.equals("account") && password.equals("account123")) {
                    SceneSwitcher.switchTo("/asifur2110384/accountdashboard.fxml", actionEvent);
                    isAuthenticated = true;
                }
                break;
            case "Trainer":
                if (userId.equals("trainer") && password.equals("trainer123")) {
                    SceneSwitcher.switchTo("/asifur2110384/trainerdashboard.fxml", actionEvent);
                    isAuthenticated = true;
                }
                break;
            case "Security Officer":
                if (userId.equals("security") && password.equals("security123")) {
                    SceneSwitcher.switchTo("/asifur2110384/securitydashboard.fxml", actionEvent);
                    isAuthenticated = true;
                }
                break;
            case "Member":
                if (userId.equals("member") && password.equals("member123")) {
                    SceneSwitcher.switchTo("/asifur2110384/memberdashboard.fxml", actionEvent);
                    isAuthenticated = true;
                }
                break;
        }

        if (!isAuthenticated) {
            System.out.println("Invalid credentials for user type: " + userType);
        }
    }



    @Deprecated
    public void createaccountOnAction(ActionEvent actionEvent) {
    }
}