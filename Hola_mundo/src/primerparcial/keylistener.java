package primerparcial;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keylistener {
    public static void main(String[] args) {
        // Crear un JFrame
        JFrame frame = new JFrame("Eventos de Teclado");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear un panel para agregar componentes
        JPanel panel = new JPanel();

        // Agregar un campo de texto para mostrar los eventos
        JTextArea textArea = new JTextArea(10, 30);
        panel.add(textArea);

        // Agregar un KeyListener al campo de texto
        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Evento cuando se presiona una tecla
                System.out.println("tecla presionada: " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // Evento cuando se mantiene presionada una tecla
                System.out.println("la tecla " + e.getKeyChar() + " se mantiene presionada");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // Evento cuando se suelta una tecla
                System.out.println("tecla soltada: " + e.getKeyChar());
            }
        });

        // Agregar el panel al JFrame
        frame.add(panel);

        // Hacer visible el JFrame
        frame.setVisible(true);
    }
}
