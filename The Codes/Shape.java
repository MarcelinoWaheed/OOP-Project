import java.util.Date;

public abstract class Shape implements Drawable {
    private Date dateCreated;
    private String color;

    public Shape() {
        this.color = "Black";
        this.dateCreated = new Date();
    }

    public Shape(String color) {
        this.color = color;
        this.dateCreated = new Date();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}