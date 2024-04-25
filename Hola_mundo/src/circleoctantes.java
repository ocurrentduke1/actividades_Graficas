import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class circleoctantes extends JFrame {
    private BufferedImage buffer;
    private Graphics graPixel;


    public circleoctantes() {
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
        drawCircle(250, 250, 100, Color.black);
    }

    public void putPixel(int x, int y, Color c) {
        buffer.setRGB(0, 0, c.getRGB());
        this.getGraphics().drawImage(buffer, x, y, this);
    }
    //dibujar circulo punto medio
    public void drawCircle(int xc, int yc, int R, Color c) {
        int x = 0;
        int y = R;
        int p0 = 5 / 4 - R;

        drawCirclePoints(xc, yc, x, y, c);

        while (x < y) {
            x++;
            if (p0 < 0) {
                p0 += 2 * x + 1;
            } else {
                y--;
                p0 += 2 * (x - y) + 1;
            }
            drawCirclePoints(xc, yc, x, y, c);
        }
    }
    //metodo para dibujar los 8 octantes
    private void drawCirclePoints(int xc, int yc, int x, int y, Color c) {
        putPixel(xc + x, yc + y, c);
        putPixel(xc - x, yc + y, c);
        putPixel(xc + x, yc - y, c);
        putPixel(xc - x, yc - y, c);
        putPixel(xc + y, yc + x, c);
        putPixel(xc - y, yc + x, c);
        putPixel(xc + y, yc - x, c);
        putPixel(xc - y, yc - x, c);
    }

    public static void main(String[] args) {
        circleMat ventana = new circleMat();
        ventana.setVisible(true);
    }
}
