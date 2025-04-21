package com.example.group13;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.io.IOException;

public class testController
{
    @javafx.fxml.FXML
    private Label outputLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void currentempButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void newempButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void promotedButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void notselectButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void selectButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("login.fxml",actionEvent);
    }

    @javafx.fxml.FXML
    public void FireButtonOnAction(ActionEvent actionEvent) {
    }
}