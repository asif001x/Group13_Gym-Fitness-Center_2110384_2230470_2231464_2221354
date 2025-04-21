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
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Revokemembership {
    @FXML
    private TextField memberNameTF;
    @FXML
    private TableColumn<Member, String> nameTBC;
    @FXML
    private TableColumn<Member, String> statusTBC;
    @FXML
    private Button backButton;
    @FXML
    private TableView<Member> tableviewFX;
    @FXML
    private TableColumn<Member, String> idTBC;
    @FXML
    private TextField memberIDTF;
    @FXML
    private Button saveButton;
    @FXML
    private Button removeStatusButton;

    private ObservableList<Member> memberList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        nameTBC.setCellValueFactory(new PropertyValueFactory<>("name"));
        idTBC.setCellValueFactory(new PropertyValueFactory<>("id"));
        statusTBC.setCellValueFactory(new PropertyValueFactory<>("status"));
        tableviewFX.setItems(memberList);
    }

    @FXML
    public void revokeOA(ActionEvent actionEvent) {
        String name = memberNameTF.getText();
        String id = memberIDTF.getText();

        if (!name.isEmpty() && !id.isEmpty()) {
            Member newMember = new Member(name, id, "Revoked");
            memberList.add(newMember);
            memberNameTF.clear();
            memberIDTF.clear();
        }
    }

    @FXML
    public void saveOA(ActionEvent actionEvent) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("revoked_members.txt"))) {
            for (Member m : memberList) {
                writer.write(m.getName() + "," + m.getId() + "," + m.getStatus());
                writer.newLine();
            }
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Saved successfully!");
            alert.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
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


    public static class Member {
        private String name;
        private String id;
        private String status;

        public Member(String name, String id, String status) {
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

        public void setStatus(String status) {
            this.status = status;
        }
    }
}

