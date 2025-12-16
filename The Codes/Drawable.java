import java.awt.*;

public interface Drawable {

    String howToDraw();

    int draw(Graphics g, int x, int y);
}