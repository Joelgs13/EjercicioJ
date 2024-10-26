package com.example.ejercicioj;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * Controlador para la interfaz de usuario de la aplicación EjercicioJ.
 * Esta clase implementa {@link Initializable} para inicializar componentes
 * de la interfaz y gestionar eventos de usuario relacionados con la
 * selección de colores y el estado de la luz del coche.
 */
public class ejercicioJController implements Initializable {

    // Componentes de la interfaz
    @FXML
    private ImageView imgAzulClaro;     // Imagen del coche azul claro
    @FXML
    private ImageView imgAzulOscuro;    // Imagen del coche azul oscuro
    @FXML
    private ImageView imgBlanco;         // Imagen del coche blanco
    @FXML
    private ImageView imgCoche;          // Imagen del coche principal
    @FXML
    private ImageView imgGris;           // Imagen del coche gris
    @FXML
    private ImageView imgGrisOscuro;     // Imagen del coche gris oscuro
    @FXML
    private ImageView imgLuz;            // Imagen de la luz del coche
    @FXML
    private ImageView imgMarron;         // Imagen del coche marrón
    @FXML
    private ImageView imgNegro;          // Imagen del coche negro
    @FXML
    private ImageView imgRojo;           // Imagen del coche rojo
    @FXML
    private ImageView logoLuz;           // Imagen del logo de luz

    private boolean bEncendido;          // Estado de la luz (encendida/apagada)

    /**
     * Método que cambia el icono de la luz entre encendido y apagado
     * y visibiliza la imagen de luces en función del estado actual.
     *
     * @param event El evento de ratón que desencadena el método.
     */
    @FXML
    void luz(MouseEvent event) {
        if (!bEncendido) {
            bEncendido = true;
            logoLuz.setImage(new Image(getClass().getResource("/img/lucesOn.png").toString()));
        } else {
            bEncendido = false;
            logoLuz.setImage(new Image(getClass().getResource("/img/lucesOff.png").toString()));
        }
        imgLuz.setVisible(bEncendido);
    }

    /**
     * Método que cambia la imagen del coche a color azul claro.
     *
     * @param event El evento de ratón que desencadena el método.
     */
    @FXML
    void colorAzulClaro(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResource("/img/miniElectricBlue.png").toString()));
    }

    /**
     * Método que cambia la imagen del coche a color azul oscuro.
     *
     * @param event El evento de ratón que desencadena el método.
     */
    @FXML
    void colorAzulOscuro(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResource("/img/miniLapisluxuryBlue.png").toString()));
    }

    /**
     * Método que cambia la imagen del coche a color blanco.
     *
     * @param event El evento de ratón que desencadena el método.
     */
    @FXML
    void colorBlanco(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResource("/img/miniPepperWhite.png").toString()));
    }

    /**
     * Método que cambia la imagen del coche a color gris.
     *
     * @param event El evento de ratón que desencadena el método.
     */
    @FXML
    void colorGris(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResource("/img/miniMoonwalkGrey.png").toString()));
    }

    /**
     * Método que cambia la imagen del coche a color gris oscuro.
     *
     * @param event El evento de ratón que desencadena el método.
     */
    @FXML
    void colorGrisOscuro(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResource("/img/miniThunderGray.png").toString()));
    }

    /**
     * Método que cambia la imagen del coche a color marrón.
     *
     * @param event El evento de ratón que desencadena el método.
     */
    @FXML
    void colorMarron(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResource("/img/miniVolcaninOrange.png").toString()));
    }

    /**
     * Método que cambia la imagen del coche a color negro.
     *
     * @param event El evento de ratón que desencadena el método.
     */
    @FXML
    void colorNegro(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResource("/img/miniMidnightBlack.png").toString()));
    }

    /**
     * Método que cambia la imagen del coche a color rojo.
     *
     * @param event El evento de ratón que desencadena el método.
     */
    @FXML
    void colorRojo(MouseEvent event) {
        imgCoche.setImage(new Image(getClass().getResource("/img/miniBlazingRed.png").toString()));
    }

    /**
     * Método de inicialización que se llama al cargar el controlador.
     * Aquí se establece el estado inicial de la luz como apagada.
     *
     * @param arg0 URL de la localización del recurso.
     * @param arg1 Recursos localizados.
     */
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        bEncendido = false; // Inicializa la luz apagada
    }
}
