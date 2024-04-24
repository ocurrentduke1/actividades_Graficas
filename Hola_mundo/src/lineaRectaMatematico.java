import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class lineaRectaMatematico extends JFrame {
    private BufferedImage buffer;
    private Graphics graPixel;
    //constructor de ventana a dibujar
    public lineaRectaMatematico() {
        setTitle("Ventana");
        setVisible(true);
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        buffer = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
        graPixel = buffer.createGraphics();
    }
    //dibujar pixel
    public void putPixel(int x, int y, Color c) {
        buffer.setRGB(0, 0, c.getRGB());
        this.getGraphics().drawImage(buffer, x, y, this);
    }
    //dibujar los metodos
    public void drawLineMath(int x1, int y1, int x2, int y2, Color color) {
        int dx = x2 - x1;
        int dy = y2 - y1;

        // Si la pendiente es infinita, dibujar una línea vertical
        if (dx == 0) {
            for (int y = y1; y <= y2; y++) {
                putPixel(x1, y, color);
            }
        } else {
            double m = (double) dy / dx;
            double b = y1 - m * x1;

            // Dibujar la línea iterando sobre el rango de x
            for (int x = x1; x <= x2; x++) {
                int y = (int) Math.round(m * x + b);
                putPixel(x, y, color);
            }
        }
    }
    public void paint(Graphics g) {
        super.paint(g);
        drawLineMath(100, 100, 200, 300, Color.BLACK);
    }
    //dibujar linea recta con bresenham

    public static void main(String[] args) {

        lineaRectaMatematico ventana = new lineaRectaMatematico();

        ventana.setVisible(true);
    }

}