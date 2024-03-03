import java.awt.*;
import javax.swing.*;

public class EspiralArquimedes extends JFrame {

    private double theta = 0.0; // Ángulo inicial
    private double dTheta = 0.05; // Incremento angular
    private double a = 1.0; // Constante a (ajuste según tus preferencias)
    private double b = 1.0; // Constante b (ajuste según tus preferencias)

    public EspiralArquimedes() {
        super("Espiral de Arquímedes");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        for (int i = 0; i < 500; i++) {
            double r = a + b * theta;
            int x = (int) (centerX + r * Math.cos(theta));
            int y = (int) (centerY - r * Math.sin(theta));
            int width = (int) (2 * r); // Ancho del arco
            int height = (int) (2 * r); // Alto del arco
            int startAngle = (int) Math.toDegrees(theta); // Ángulo inicial del arco
            int arcAngle = 10; // Ángulo de extensión del arco (puedes ajustarlo)

            g.drawArc(x - width / 2, y - height / 2, width, height, startAngle, arcAngle);
            theta += dTheta;
            try {
                Thread.sleep(5); // Controla la velocidad de generación
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new EspiralArquimedes());
    }
}