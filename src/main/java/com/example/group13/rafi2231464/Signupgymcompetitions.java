package com.example.group13.rafi2231464;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class Signupgymcompetitions {

    @javafx.fxml.FXML
    private TableColumn<Participant, String> dateTBC;
    @javafx.fxml.FXML
    private TextField phoneTF;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private Button submitButton;
    @javafx.fxml.FXML
    private DatePicker competitionDP;
    @javafx.fxml.FXML
    private TableColumn<Participant, String> phoneTBC;
    @javafx.fxml.FXML
    private ComboBox<String> competitionNameCB;
    @javafx.fxml.FXML
    private Button backButton;
    @javafx.fxml.FXML
    private TableColumn<Participant, String> nameTBC;
    @javafx.fxml.FXML
    private TableColumn<Participant, String> competitionNameTBC;
    @javafx.fxml.FXML
    private TableView<Participant> tableviewFX;

    private ObservableList<Participant> participantList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        nameTBC.setCellValueFactory(new PropertyValueFactory<>("name"));
        phoneTBC.setCellValueFactory(new PropertyValueFactory<>("phone"));
        competitionNameTBC.setCellValueFactory(new PropertyValueFactory<>("competitionName"));
        dateTBC.setCellValueFactory(new PropertyValueFactory<>("date"));

        tableviewFX.setItems(participantList);

        // Populating ComboBox with 4 random gym competition names
        competitionNameCB.getItems().addAll("Weightlifting", "Treadmill Run", "Bench Press", "Pull-Up Challenge");
    }

    @javafx.fxml.FXML
    public void submitOA(ActionEvent actionEvent) {
        String name = nameTF.getText().trim();
        String phone = phoneTF.getText().trim();
        String competition = competitionNameCB.getValue();
        LocalDate date = competitionDP.getValue();

        if (name.isEmpty() || phone.isEmpty() || competition == null || date == null) {
            showAlert("Please fill in all fields.");
            return;
        }

        // Check for duplicates
        for (Participant p : participantList) {
            if (p.getName().equalsIgnoreCase(name) && p.getPhone().equals(phone)) {
                showAlert("This person has already signed up.");
                return;
            }
        }

        // Creating a new participant and adding it to the table
        Participant newParticipant = new Participant(name, phone, competition, date.toString());
        participantList.add(newParticipant);

        // Clear input fields
        nameTF.clear();
        phoneTF.clear();
        competitionNameCB.setValue(null);
        competitionDP.setValue(null);
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void backOA(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("u6dashboard.fxml"));
            Stage stage = (Stage) backButton.getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void competitionNameCBOA(ActionEvent actionEvent) {
    }

    // Participant class
    public static class Participant {
        private String name;
        private String phone;
        private String competitionName;
        private String date;

        public Participant(String name, String phone, String competitionName, String date) {
            this.name = name;
            this.phone = phone;
            this.competitionName = competitionName;
            this.date = date;
        }

        public String getName() { return name; }
        public String getPhone() { return phone; }
        public String getCompetitionName() { return competitionName; }
        public String getDate() { return date; }
    }
}
