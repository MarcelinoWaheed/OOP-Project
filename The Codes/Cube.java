import java.awt.*;

public class Cube extends ThreeDShape {
    private double side;

    public Cube(double s) {
        super("Black");
        this.side = s;
    }

    public Cube(String c, double s) {
        super(c);
        this.side = s;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double s) {
        this.side = s;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getPerimeter() {
        return 12 * side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public String howToDraw() {
        return "Draw cube: side=" + side;
    }

    @Override
    public String toString() {
        return "Cube details: " + howToDraw() + ", surface Area: " + getArea();
    }

    @Override
    public int draw(Graphics g, int x, int y) {
        int s = (int) side;
        int dis = s / 2;

        g.setColor(Color.RED);

        // front
        int Fx = x;
        int Fy = y;
        g.drawRect(Fx, Fy, s, s);

        // 2. Back
        int Bx = x + dis;
        int By = y - dis;
        g.drawRect(Bx, By, s, s);

        // 3. Lines
        // top lift line
        g.drawLine(Fx, Fy, Bx, By);

        // top right line 
        g.drawLine(Fx + s, Fy, Bx + s, By);

        // bottom lift line
        g.drawLine(Fx, Fy + s, Bx, By + s);

        // bottom right line
        g.drawLine(Fx + s, Fy + s, Bx + s, By + s);
        
        // 4. Text
        g.setColor(Color.CYAN);
        g.drawString("Cube (s=" + side + ")", x, y + s + 20);

        return s + dis + 80;
    }
}