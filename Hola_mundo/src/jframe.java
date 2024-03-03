import javax.swing.*;

import javax.swing.JFrame;

public class jframe {
    public static void main(String[] args) {
        // Crear una nueva instancia de JFrame
        JFrame ventana = new JFrame("Mi Ventana");

        // Establecer el tamaño de la ventana
        ventana.setSize(400, 300);

        // Establecer la operación por defecto al cerrar la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hacer visible la ventana
        ventana.setVisible(true);
    }
}
