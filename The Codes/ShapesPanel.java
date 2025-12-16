import javax.swing.*;
import java.awt.*;

public class ShapesPanel extends JPanel {

    private Drawable[] shapes;

    public ShapesPanel(Drawable[] shapes) {
        this.shapes = shapes;
        setPreferredSize(new Dimension(800, 500));
        setBackground(Color.black);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON); // for smoothing edges of shapes
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON); // for smoothing edges of text

        g2.setStroke(new BasicStroke(1.5f)); 

        g2.setFont(new Font("Arial", Font.PLAIN, 14));

        int x = 50, y = 150;

        for (Drawable d : shapes) {
            if (d != null) {
                x += d.draw(g2, x, y);  // Polymorphism
            }
        }
    }
}