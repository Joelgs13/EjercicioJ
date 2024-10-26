package com.example.ejercicioj;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Clase principal de la aplicación JavaFX.
 * Esta clase extiende {@link Application} y es responsable de iniciar la aplicación.
 */
public class HelloApplication extends Application {

    /**
     * Método que se invoca al iniciar la aplicación.
     *
     * @param stage El escenario principal de la aplicación.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage stage) throws IOException {
        // Cargar el archivo FXML
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/ejercicioj/EjercicioJ.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 650);

        // Configurar la ventana
        stage.setTitle("MINI COOPER!");
        stage.setScene(scene);
        stage.setMinHeight(700);
        stage.setMinWidth(620);
        stage.show();
    }

    /**
     * Método principal que lanza la aplicación.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        launch();
    }
}
