package com.example.group13.rafi2231464;

import com.example.group13.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.stage.Stage;

import java.io.IOException;

public class Reportbrokenequipments {

    @javafx.fxml.FXML
    private CheckBox ACB;
    @javafx.fxml.FXML
    private CheckBox BCB;
    @javafx.fxml.FXML
    private CheckBox CCB;
    @javafx.fxml.FXML
    private CheckBox DCB;
    @javafx.fxml.FXML
    private CheckBox ECB;
    @javafx.fxml.FXML
    private CheckBox FCB;
    @javafx.fxml.FXML
    private CheckBox GCB;
    @javafx.fxml.FXML
    private CheckBox HCB;
    @javafx.fxml.FXML
    private CheckBox ICB;

    @javafx.fxml.FXML
    private Button submitButton;
    @javafx.fxml.FXML
    private Button backButton;

    @javafx.fxml.FXML
    private TableView<BrokenEquipment> tableviewFX;
    @javafx.fxml.FXML
    private TableColumn<BrokenEquipment, String> equipmentsTBC;
    @javafx.fxml.FXML
    private TableColumn<BrokenEquipment, String> statusTBC;

    private final ObservableList<BrokenEquipment> equipmentList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        equipmentsTBC.setCellValueFactory(cellData -> cellData.getValue().equipmentNameProperty());
        statusTBC.setCellValueFactory(cellData -> cellData.getValue().statusProperty());
        tableviewFX.setItems(equipmentList);
    }

    @javafx.fxml.FXML
    public void submitOA(ActionEvent actionEvent) {
        boolean anySelected = false;

        // Check all checkboxes and add selected ones
        if (ACB.isSelected()) {
            equipmentList.add(new BrokenEquipment(ACB.getText(), "Broken"));
            anySelected = true;
        }
        if (BCB.isSelected()) {
            equipmentList.add(new BrokenEquipment(BCB.getText(), "Broken"));
            anySelected = true;
        }
        if (CCB.isSelected()) {
            equipmentList.add(new BrokenEquipment(CCB.getText(), "Broken"));
            anySelected = true;
        }
        if (DCB.isSelected()) {
            equipmentList.add(new BrokenEquipment(DCB.getText(), "Broken"));
            anySelected = true;
        }
        if (ECB.isSelected()) {
            equipmentList.add(new BrokenEquipment(ECB.getText(), "Broken"));
            anySelected = true;
        }
        if (FCB.isSelected()) {
            equipmentList.add(new BrokenEquipment(FCB.getText(), "Broken"));
            anySelected = true;
        }
        if (GCB.isSelected()) {
            equipmentList.add(new BrokenEquipment(GCB.getText(), "Broken"));
            anySelected = true;
        }
        if (HCB.isSelected()) {
            equipmentList.add(new BrokenEquipment(HCB.getText(), "Broken"));
            anySelected = true;
        }
        if (ICB.isSelected()) {
            equipmentList.add(new BrokenEquipment(ICB.getText(), "Broken"));
            anySelected = true;
        }

        if (anySelected) {
            resetCheckboxes();
            showAlert("Submitted successfully!");
        } else {
            showAlert("Please select at least one equipment.");
        }
    }

    private void resetCheckboxes() {
        ACB.setSelected(false);
        BCB.setSelected(false);
        CCB.setSelected(false);
        DCB.setSelected(false);
        ECB.setSelected(false);
        FCB.setSelected(false);
        GCB.setSelected(false);
        HCB.setSelected(false);
        ICB.setSelected(false);
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Submission");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static class BrokenEquipment {
        private final SimpleStringProperty equipmentName;
        private final SimpleStringProperty status;

        public BrokenEquipment(String equipmentName, String status) {
            this.equipmentName = new SimpleStringProperty(equipmentName);
            this.status = new SimpleStringProperty(status);
        }

        public SimpleStringProperty equipmentNameProperty() {
            return equipmentName;
        }

        public SimpleStringProperty statusProperty() {
            return status;
        }
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