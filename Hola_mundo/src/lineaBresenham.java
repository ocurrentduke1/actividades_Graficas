import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Calendar;

public class lineaBresenham extends JFrame {
    private BufferedImage buffer;
    private Graphics graPixel;

    public lineaBresenham() {
        setTitle("Ventana");
        setVisible(true);
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        buffer = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
        graPixel = buffer.createGraphics();
    }

    public static void main(String[] args) {
        lineaBresenham ventana = new lineaBresenham();
        ventana.setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawLine(100, 100, 200, 400,Color.RED);
    }

    public void putPixel(int x, int y, Color c) {
        buffer.setRGB(0, 0, c.getRGB());
        this.getGraphics().drawImage(buffer, x, y, this);
    }
    private void drawLine(int x0,int y0,int x1, int y1, Color c){
        int dx = (x1 - x0);
        int dy = (y1 - y0);
        int stepY, stepX,pk;
        int xk = x0;
        int yk = y0;
        // determinar punto de partida y fin
        if (dy < 0) {
            dy = -dy;
            stepY = -1;
        }
        else
            stepY = 1;
        if (dx < 0) {
            dx = -dx; stepX = -1;
        }
        else
            stepX = 1;
        putPixel(xk,yk,c);
        /* se cicla hasta llegar al extremo de la línea */
        if(dx>dy){
            pk = 2*dy - dx;
            while (xk != x1){
                xk += stepX;
                if (pk < 0)
                    pk += 2*dy;
                else {
                    yk += stepY;
                    pk += 2*(dy-dx);
                }
                putPixel(xk,yk,c);
            }
        }
        else{
            pk = 2*dx - dy;
            while (yk != y1){
                yk += stepY;
                if (pk < 0)
                    pk += 2*dx;
                else {
                    xk += stepX;
                    pk += 2*(dx-dy);
                }
                putPixel(xk,yk,c);
            }
        }
    }
}