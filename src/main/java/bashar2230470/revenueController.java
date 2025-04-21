package com.example.group13.bashar2230470;

import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import javax.swing.table.TableColumn;
import java.awt.event.ActionEvent;

public class revenueController
{
    @javafx.fxml.FXML
    private ComboBox yearComboBox;
    @javafx.fxml.FXML
    private TableColumn yearTableColumn;
    @javafx.fxml.FXML
    private ComboBox monthComboBox;
    @javafx.fxml.FXML
    private TableColumn monthTableColumn;
    @javafx.fxml.FXML
    private TextField revenueTextField;
    @javafx.fxml.FXML
    private TableColumn revenueTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backOnAction(ActionEvent actionEvent) {
    }
}