package com.example.group13.rafi2231464;

import com.example.group13.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;

import java.io.IOException;

public class Membershipplan {


    public static class MembershipEntry {
        private String name;
        private String phone;
        private String plan;
        private String expirationDate;

        public MembershipEntry(String name, String phone, String plan, String expirationDate) {
            this.name = name;
            this.phone = phone;
            this.plan = plan;
            this.expirationDate = expirationDate;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public String getPlan() {
            return plan;
        }

        public String getExpirationDate() {
            return expirationDate;
        }
    }


    @javafx.fxml.FXML
    private TableColumn<MembershipEntry, String> dateTBC;
    @javafx.fxml.FXML
    private CheckBox premiumplanCB;
    @javafx.fxml.FXML
    private TextField nameFX;
    @javafx.fxml.FXML
    private TableColumn<MembershipEntry, String> planTBC;
    @javafx.fxml.FXML
    private TextField phone;
    @javafx.fxml.FXML
    private TableColumn<MembershipEntry, String> phoneTBC;
    @javafx.fxml.FXML
    private CheckBox basicplanCB;
    @javafx.fxml.FXML
    private DatePicker datepickerFX;
    @javafx.fxml.FXML
    private TableColumn<MembershipEntry, String> nameTBC;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private Button updateButton;
    @javafx.fxml.FXML
    private TableView<MembershipEntry> tableviewFX;

    private ObservableList<MembershipEntry> membershipList = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {

        nameTBC.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getName()));
        phoneTBC.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getPhone()));
        planTBC.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getPlan()));
        dateTBC.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getExpirationDate()));


        tableviewFX.setItems(membershipList);
    }


    @javafx.fxml.FXML
    public void backOA(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("rafi2231464/u6dashboard.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Member Dashboard");
        stage.show();
    }


    @javafx.fxml.FXML
    public void updateOA(ActionEvent actionEvent) {

        String name = nameFX.getText();
        String phoneNumber = phone.getText();
        String plan = basicplanCB.isSelected() ? "Basic Plan" : (premiumplanCB.isSelected() ? "Premium Plan" : "No Plan");
        String expirationDate = datepickerFX.getValue() != null ? datepickerFX.getValue().toString() : "";


        MembershipEntry newEntry = new MembershipEntry(name, phoneNumber, plan, expirationDate);


        membershipList.add(newEntry);


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Update");
        alert.setHeaderText(null);
        alert.setContentText("Update Successfully");
        alert.showAndWait();
    }
}
