import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class circlepolar extends JFrame {
    private BufferedImage buffer;
    private Graphics graPixel;


    public circlepolar() {
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
        drawPolarCircle(250, 250, 100, Color.black);
    }

    public void putPixel(int x, int y, Color c) {
        buffer.setRGB(0, 0, c.getRGB());
        this.getGraphics().drawImage(buffer, x, y, this);
    }
    //dibujar circulo polar
    public void drawPolarCircle(int xc, int yc, int r, Color c) {
        for (double theta = 0; theta <= 2 * Math.PI; theta += 0.01) {
            int x = (int) (xc + r * Math.cos(theta));
            int y = (int) (yc + r * Math.sin(theta));
            putPixel(x, y, c);
        }
    }

    public static void main(String[] args) {
        circleMat ventana = new circleMat();
        ventana.setVisible(true);
    }
}
