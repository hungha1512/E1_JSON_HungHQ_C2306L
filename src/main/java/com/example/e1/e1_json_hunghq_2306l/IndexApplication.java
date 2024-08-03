package com.example.e1.e1_json_hunghq_2306l;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class IndexApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("/com/example/e1/e1_json_hunghq_2306l/Index.fxml"));
       Scene scene = new Scene(root);
       stage.setTitle("Student Management");
       stage.setScene(scene);
       stage.setMaximized(true);
       stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}