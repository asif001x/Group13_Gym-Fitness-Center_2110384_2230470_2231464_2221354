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

public class Bookspaormassage {


    public static class BookingEntry {
        private String name;
        private String phone;
        private String type;
        private String date;
        private String time;

        public BookingEntry(String name, String phone, String type, String date, String time) {
            this.name = name;
            this.phone = phone;
            this.type = type;
            this.date = date;
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public String getType() {
            return type;
        }

        public String getDate() {
            return date;
        }

        public String getTime() {
            return time;
        }
    }


    @javafx.fxml.FXML
    private ComboBox<String> timeCB;
    @javafx.fxml.FXML
    private TextField phoneTF;
    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private DatePicker datepickerTF;
    @javafx.fxml.FXML
    private ComboBox<String> typeCB;
    @javafx.fxml.FXML
    private TableColumn<BookingEntry, String> dateTBC;
    @javafx.fxml.FXML
    private TableColumn<BookingEntry, String> phoneTBC;
    @javafx.fxml.FXML
    private TableColumn<BookingEntry, String> timeTBC;
    @javafx.fxml.FXML
    private TableColumn<BookingEntry, String> nameTBC;
    @javafx.fxml.FXML
    private TableView<BookingEntry> tableviewFX;
    @javafx.fxml.FXML
    private Button bookNowButton;
    @javafx.fxml.FXML
    private TableColumn<BookingEntry, String> typeTBC;


    private ObservableList<BookingEntry> bookingList = FXCollections.observableArrayList();


    @javafx.fxml.FXML
    public void initialize() {

        nameTBC.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getName()));
        phoneTBC.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getPhone()));
        typeTBC.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getType()));
        dateTBC.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getDate()));
        timeTBC.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getTime()));


        tableviewFX.setItems(bookingList);


        typeCB.getItems().addAll("Spa", "Massage");
        timeCB.getItems().addAll("Morning", "Afternoon", "Evening");
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


    @javafx.fxml.FXML
    public void bookNowTF(ActionEvent actionEvent) {

        String name = nameTF.getText();
        String phone = phoneTF.getText();
        String type = typeCB.getValue();
        String date = datepickerTF.getValue() != null ? datepickerTF.getValue().toString() : "";
        String time = timeCB.getValue();


        BookingEntry newBooking = new BookingEntry(name, phone, type, date, time);


        bookingList.add(newBooking);


        nameTF.clear();
        phoneTF.clear();
        typeCB.getSelectionModel().clearSelection();
        timeCB.getSelectionModel().clearSelection();
        datepickerTF.setValue(null);


        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Booking Success");
        alert.setHeaderText(null);
        alert.setContentText("Your booking has been successfully added!");
        alert.showAndWait();
    }
}
