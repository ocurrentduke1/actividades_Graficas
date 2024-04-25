import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class circleMat extends JFrame {
    private BufferedImage buffer;
    private Graphics graPixel;


    public circleMat() {
        setTitle("Ventana Rectangle");
        setVisible(true);
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        buffer = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
        graPixel = buffer.createGraphics();
    }
    public void paint(Graphics g) {
        super.paint(g);
        drawBasicCircle(250, 250, 100, Color.black);
    }

    public void putPixel(int x, int y, Color c) {
        buffer.setRGB(0, 0, c.getRGB());
        this.getGraphics().drawImage(buffer, x, y, this);
    }
    //dibujar circulo basico
    public void drawBasicCircle(int xc, int yc, int r, Color c) {
        for (int x = xc - r; x <= xc + r; x++) {
            int y0 = yc + (int) (Math.sqrt(r * r - (x - xc) * (x - xc)));
            int y1 = yc - (int) (Math.sqrt(r * r - (x - xc) * (x - xc)));
            putPixel(x, y0, c);
            putPixel(x, y1, c);
        }
    }

    public static void main(String[] args) {
        circleMat ventana = new circleMat();
        ventana.setVisible(true);
    }
}
