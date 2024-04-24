import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class figuras extends JFrame {
    private BufferedImage buffer;
    private Graphics graPixel;
    lineaBresenham bresenham = new lineaBresenham();
    rectangulo rectangulo = new rectangulo(this);
    polarCircle polar = new polarCircle(this);
    elipse elipse = new elipse(this);
    //constructor de ventana a dibujar
    public window() {
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
    public void paint(Graphics g) {
        super.paint(g);
        bresenham.drawLine(50, 50, 100, 100, Color.BLACK);
        bresenham.drawLine(100, 50, 200, 50, Color.BLACK);
        bresenham.drawLine(300, 50, 200, 100, Color.BLACK);
        bresenham.drawLine(450, 50, 350, 50, Color.BLACK);
        rectangulo.drawRectangle(300, 400, 100, 50, Color.black);
        rectangulo.drawRectangle(310, 410, 78, 30, Color.black);
        polar.drawPolarCircle(100, 400, 50, Color.black);
        polar.drawPolarCircle(100, 400, 30, Color.BLACK);
        polar.drawPolarCircle(100, 400, 15, Color.BLACK);
        polar.drawPolarCircle(100, 400, 5, Color.BLACK);
        elipse.drawEllipse(250, 250, 80, 50, Color.black);
        elipse.drawEllipse(250, 250, 60, 30, Color.black);
        elipse.drawEllipse(250, 250, 40, 15, Color.black);
        elipse.drawEllipse(250, 250, 20, 5, Color.black);
    }
    //dibujar linea recta con bresenham

}