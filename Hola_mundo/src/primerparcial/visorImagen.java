package primerparcial;

import primerparcial.Pantalla;

import javax.swing.*;
import java.awt.*;

public class visorImagen extends JFrame {
    private JScrollPane panel;
    private Pantalla pantalla;

    public visorImagen(){
        super("visor imagen");
        Image img = Toolkit.getDefaultToolkit().getImage("C:\\Users\\vdavi\\Desktop\\actividades graficas\\Hola_mundo\\imagenes\\arbol.jpg");
        pantalla = new Pantalla();
        panel = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        getContentPane().add(panel);
        panel.setViewportView(pantalla);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setVisible(true);
    }

    public static void main(String[] args) {
         new visorImagen();
    }
}
