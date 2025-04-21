package com.example.group13.rafi2231464;

import com.example.group13.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

// Combined model and controller
public class Checkgymtimingsformembers {

    @FXML
    private TableColumn<GymTiming, String> datTBC;

    @FXML
    private TableColumn<GymTiming, String> timingsTBC;

    @FXML
    private TableView<GymTiming> tableviewFX;

    // Initialize the table with gym timings
    @FXML
    public void initialize() {
        // Set cell value factories
        datTBC.setCellValueFactory(new PropertyValueFactory<>("day"));
        timingsTBC.setCellValueFactory(new PropertyValueFactory<>("timing"));

        // Sample gym timings
        ObservableList<GymTiming> timings = FXCollections.observableArrayList(
                new GymTiming("Monday", "6:00 AM - 10:00 PM"),
                new GymTiming("Tuesday", "6:00 AM - 10:00 PM"),
                new GymTiming("Wednesday", "6:00 AM - 10:00 PM"),
                new GymTiming("Thursday", "6:00 AM - 10:00 PM"),
                new GymTiming("Friday", "6:00 AM - 9:00 PM"),
                new GymTiming("Saturday", "8:00 AM - 6:00 PM"),
                new GymTiming("Sunday", "Closed")
        );

        // Set data to table
        tableviewFX.setItems(timings);
    }

    @FXML
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

    // Inner model class for gym timing
    public static class GymTiming {
        private String day;
        private String timing;

        public GymTiming(String day, String timing) {
            this.day = day;
            this.timing = timing;
        }

        public String getDay() {
            return day;
        }

        public String getTiming() {
            return timing;
        }
    }
}
