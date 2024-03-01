import javax.swing.*;
import java.awt.*;

public class Pantalla extends JPanel {

    private Image imagen;

    public Pantalla() {
        // Carga la imagen desde el archivo especificado
        imagen = Toolkit.getDefaultToolkit().getImage("C:\\Users\\vdavi\\Desktop\\actividades graficas\\Hola_mundo\\imagenes\\arbol.jpg");
    }

    public void paint(Graphics g){
        super.paint(g);
        Dimension tam = new Dimension(imagen.getWidth(this), imagen.getHeight(this));
        setPreferredSize(tam);
        setMinimumSize(tam);
        setMaximumSize(tam);
        setSize(tam);
        update(g);
    }
    public void update(Graphics g){
        g.drawImage(imagen, 0, 0, this);
    }
}

