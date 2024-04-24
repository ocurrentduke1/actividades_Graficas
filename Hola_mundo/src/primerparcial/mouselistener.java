package primerparcial;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class mouselistener extends JFrame implements MouseListener {
    private JButton boton;
    private JFrame ventanaHija;

    public mouselistener() {
        // Configuración básica del JFrame
        setBounds(0, 0, 500, 500);
        setLayout(null);

        // Creación de un botón
        boton = new JButton("Botón");
        boton.setBounds(100, 100, 100, 30);
        boton.addMouseListener(this); // Agregamos el MouseListener al botón
        add(boton);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // No hacemos nada en este evento
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("el mouse esta sobre un boton");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("el mouse salio del boton");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("el mouse fue presionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("el mouse fue soltado");

    }

    public static void main(String[] args) {
        new mouselistener();
    }
}
