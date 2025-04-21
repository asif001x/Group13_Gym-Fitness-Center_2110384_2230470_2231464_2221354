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
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class Bansecuritystaff {

    @FXML
    private TableView<Staff> tableTF;
    @FXML
    private TextField nameTF;
    @FXML
    private TextField idTF;
    @FXML
    private TableColumn<Staff, String> nameTBC;
    @FXML
    private TableColumn<Staff, String> idTBC;
    @FXML
    private TableColumn<Staff, String> statusTBC;
    @FXML
    private Button banButton;
    @FXML
    private Button backButton;

    private ObservableList<Staff> staffList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        nameTBC.setCellValueFactory(new PropertyValueFactory<>("name"));
        idTBC.setCellValueFactory(new PropertyValueFactory<>("id"));
        statusTBC.setCellValueFactory(new PropertyValueFactory<>("status"));
        tableTF.setItems(staffList);
    }

    @FXML
    public void banOA(ActionEvent event) {
        String name = nameTF.getText();
        String id = idTF.getText();

        if (!name.isEmpty() && !id.isEmpty()) {
            // Check if ID already exists in the list
            for (Staff staff : staffList) {
                if (staff.getId().equals(id)) {
                    System.out.println("This staff member is already banned.");
                    return; // Stop if duplicate found
                }
            }

            Staff newStaff = new Staff(name, id, "Banned");
            staffList.add(newStaff);
            nameTF.clear();
            idTF.clear();
        }
    }

    @FXML
    public void backOA(ActionEvent event) throws IOException {
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("rafi2231464/u5dashboard.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Security Officer Dashboard");
        stage.show();
    }

    public static class Staff {
        private String name;
        private String id;
        private String status;

        public Staff(String name, String id, String status) {
            this.name = name;
            this.id = id;
            this.status = status;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public String getStatus() {
            return status;
        }
    }
}
