package com.example.ejercicioj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/ejercicioj/EjercicioJ.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 650);
        stage.setTitle("MINI COOPER!");
        stage.setScene(scene);
        stage.setMinHeight(700);
        stage.setMinWidth(620);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}