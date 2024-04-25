import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Calendar;

public class lineamidpoint extends JFrame {
    private BufferedImage buffer;
    private Graphics graPixel;

    public lineamidpoint() {
        setTitle("Ventana MidPoint");
        setVisible(true);
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        buffer = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
        graPixel = buffer.createGraphics();
    }

    public static void main(String[] args) {
        lineamidpoint ventana = new lineamidpoint();
        ventana.setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawMidpointLine(100, 100, 200, 400,Color.RED);
    }

    public void putPixel(int x, int y, Color c) {
        buffer.setRGB(0, 0, c.getRGB());
        this.getGraphics().drawImage(buffer, x, y, this);
    }
    public void drawMidpointLine(int x1, int y1, int x2, int y2, Color c) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;

        int err = dx - dy;
        int x = x1;
        int y = y1;

        while (true) {
            putPixel(x, y, c);

            if (x == x2 && y == y2) {
                break;
            }

            int e2 = 2 * err;
            if (e2 > -dy) {
                err -= dy;
                x += sx;
            }
            if (e2 < dx) {
                err += dx;
                y += sy;
            }
        }
    }
}