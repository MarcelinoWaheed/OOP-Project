import java.awt.*;
public class Circle extends Shape {
    private double radius;

    public Circle(double r) {
        super("Black");
        this.radius = r;
    }

    public Circle(String c, double r) {
        super(c);
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String howToDraw() {
        return "Draw circle: radius=" + radius;
    }

    @Override
    public String toString() {
        return "Circle details: " + howToDraw() + ", Area: " + getArea();
    }

    @Override
    public int draw(Graphics g, int x, int y) {
        int r = (int) radius;

        // 1.circle
        g.setColor(Color.BLUE);
        g.fillOval(x, y, r*2, r*2);
        g.drawOval(x, y, r * 2, r * 2);

        // 2. text
        g.setColor(Color.GREEN);
        g.drawString("Circle (r=" + radius + ")", x + r - 40, y + r * 2 + 20);

        return (r * 2) + 80;
    }
}
