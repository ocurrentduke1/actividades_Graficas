import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Calendar;



public class rectangle extends JFrame {
    private BufferedImage buffer;
    private Graphics graPixel;


    public rectangle() {
        setTitle("Ventana Rectangle");
        setVisible(true);
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        buffer = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
        graPixel = buffer.createGraphics();
    }

    public static void main(String[] args) {
        rectangle ventana = new rectangle();
        ventana.setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawRectangle(100, 100, 200, 100, Color.BLACK);
    }

    public void putPixel(int x, int y, Color c) {
        buffer.setRGB(0, 0, c.getRGB());
        this.getGraphics().drawImage(buffer, x, y, this);
    }

    public void drawRectangle(int x, int y, int width, int height, Color c) {
        for (int i = x; i < x + width; i++) {
            putPixel(i, y, c);
            putPixel(i, y + height - 1, c);
        }

        for (int j = y; j < y + height; j++) {
            putPixel(x, j, c);
            putPixel(x + width - 1, j, c);
        }
    }
}