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

public class Createworkoutplan {
    @javafx.fxml.FXML
    private TextField workoutPlanNameTF;
    @javafx.fxml.FXML
    private TextField settingDurationTF;
    @javafx.fxml.FXML
    private ComboBox<String> exerciseCategoriesCB;
    @javafx.fxml.FXML
    private ComboBox<String> specificExcercisesCB;
    @javafx.fxml.FXML
    private TableView<WorkoutPlan> tableViewFX;
    @javafx.fxml.FXML
    private TableColumn<WorkoutPlan, String> workPlanNameTBC;
    @javafx.fxml.FXML
    private TableColumn<WorkoutPlan, String> settingDurationTBC;
    @javafx.fxml.FXML
    private TableColumn<WorkoutPlan, String> exerciseCategoryTBC;
    @javafx.fxml.FXML
    private TableColumn<WorkoutPlan, String> specificExerciseTBC;

    private final ObservableList<WorkoutPlan> workoutPlans = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        // Sample data for combo boxes
        exerciseCategoriesCB.setItems(FXCollections.observableArrayList(
                "Cardio", "Strength", "Flexibility", "Balance"
        ));

        specificExcercisesCB.setItems(FXCollections.observableArrayList(
                "Push-ups", "Running", "Squats", "Yoga", "Deadlifts", "Plank"
        ));

        // Bind table columns
        workPlanNameTBC.setCellValueFactory(data -> data.getValue().workPlanNameProperty());
        settingDurationTBC.setCellValueFactory(data -> data.getValue().settingDurationProperty());
        exerciseCategoryTBC.setCellValueFactory(data -> data.getValue().exerciseCategoryProperty());
        specificExerciseTBC.setCellValueFactory(data -> data.getValue().specificExerciseProperty());

        // Bind data to table
        tableViewFX.setItems(workoutPlans);
    }

    @javafx.fxml.FXML
    public void savePlanOA(ActionEvent actionEvent) {
        String name = workoutPlanNameTF.getText();
        String duration = settingDurationTF.getText();
        String category = exerciseCategoriesCB.getValue();
        String specificExercise = specificExcercisesCB.getValue();

        if (name.isEmpty() || duration.isEmpty() || category == null || specificExercise == null) {
            showAlert("Please fill in all fields.");
            return;
        }

        WorkoutPlan newPlan = new WorkoutPlan(name, duration, category, specificExercise);
        workoutPlans.add(newPlan);

        // Clear fields
        workoutPlanNameTF.clear();
        settingDurationTF.clear();
        exerciseCategoriesCB.getSelectionModel().clearSelection();
        specificExcercisesCB.getSelectionModel().clearSelection();
    }

    @javafx.fxml.FXML
    public void deletePlanOA(ActionEvent actionEvent) {
        WorkoutPlan selected = tableViewFX.getSelectionModel().getSelectedItem();
        if (selected != null) {
            workoutPlans.remove(selected);
        } else {
            showAlert("Please select a plan to delete.");
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

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Info");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static class WorkoutPlan {
        private final SimpleStringProperty workPlanName;
        private final SimpleStringProperty settingDuration;
        private final SimpleStringProperty exerciseCategory;
        private final SimpleStringProperty specificExercise;

        public WorkoutPlan(String name, String duration, String category, String exercise) {
            this.workPlanName = new SimpleStringProperty(name);
            this.settingDuration = new SimpleStringProperty(duration);
            this.exerciseCategory = new SimpleStringProperty(category);
            this.specificExercise = new SimpleStringProperty(exercise);
        }

        public SimpleStringProperty workPlanNameProperty() {
            return workPlanName;
        }

        public SimpleStringProperty settingDurationProperty() {
            return settingDuration;
        }

        public SimpleStringProperty exerciseCategoryProperty() {
            return exerciseCategory;
        }

        public SimpleStringProperty specificExerciseProperty() {
            return specificExercise;
        }
    }
}
