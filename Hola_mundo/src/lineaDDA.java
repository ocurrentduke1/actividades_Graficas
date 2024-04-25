import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

import static java.lang.Math.abs;

public class lineaDDA extends JFrame {
    private BufferedImage buffer;
    private Graphics graPixel;
    //constructor de ventana a dibujar
    public lineaDDA() {
        setTitle("Ventana DDA");
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
    public void drawLineDDA(int x0, int y0, int x1, int y1, Color color) {
        int dx = x1 - x0;
        int dy = y1 - y0;
        int steps;

        if (Math.abs(dx) > Math.abs(dy))
            steps = Math.abs(dx);
        else
            steps = Math.abs(dy);

        float xinc = (float) dx / steps;
        float yinc = (float) dy / steps;
        float x = x0;
        float y = y0;

        for (int k = 0; k <= steps; k++) {
            putPixel(Math.round(x), Math.round(y), color);
            x += xinc;
            y += yinc;
        }
    }
    public void paint(Graphics g) {
        super.paint(g);
        drawLineDDA(100, 100, 300, 400, Color.red);
    }
    //dibujar linea recta con bresenham

    public static void main(String[] args) {

        lineaDDA ventana = new lineaDDA();

        ventana.setVisible(true);
    }

}