package com.example.group13.rafi2231464;

import com.example.group13.HelloApplication;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class Cancelmembership {

    @javafx.fxml.FXML private TextField phoneTF;
    @javafx.fxml.FXML private TextField nameTF;
    @javafx.fxml.FXML private Button cancelButton;
    @javafx.fxml.FXML private Button backButton;
    @javafx.fxml.FXML private TableColumn<MemberData, String> phoneTBC;
    @javafx.fxml.FXML private TableColumn<MemberData, String> nameTBC;
    @javafx.fxml.FXML private TableColumn<MemberData, String> statusTBC;
    @javafx.fxml.FXML private TableView<MemberData> tableviewFX;

    private final ObservableList<MemberData> cancelledMembers = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        nameTBC.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        phoneTBC.setCellValueFactory(cellData -> cellData.getValue().phoneProperty());
        statusTBC.setCellValueFactory(cellData -> cellData.getValue().statusProperty());
        tableviewFX.setItems(cancelledMembers);
    }

    @javafx.fxml.FXML
    public void cancelMemberOA(ActionEvent actionEvent) {
        String name = nameTF.getText().trim();
        String phone = phoneTF.getText().trim();

        if (name.isEmpty() || phone.isEmpty()) {
            showAlert("Please enter both name and phone number.");
            return;
        }

        cancelledMembers.add(new MemberData(name, phone, "Cancelled"));
        nameTF.clear();
        phoneTF.clear();
        showAlert("Membership cancelled successfully!");
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


    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Membership Cancellation");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static class MemberData {
        private final SimpleStringProperty name;
        private final SimpleStringProperty phone;
        private final SimpleStringProperty status;

        public MemberData(String name, String phone, String status) {
            this.name = new SimpleStringProperty(name);
            this.phone = new SimpleStringProperty(phone);
            this.status = new SimpleStringProperty(status);
        }

        public SimpleStringProperty nameProperty() {
            return name;
        }

        public SimpleStringProperty phoneProperty() {
            return phone;
        }

        public SimpleStringProperty statusProperty() {
            return status;
        }
    }
}
