
import processing.core.*;

public class Enemy {
    private PApplet screen;
    private float x, y, width, height;

    public Enemy(PApplet s, float xPos, float yPos) {
        screen = s;
        x = xPos;
        y = yPos;
        width = 15;
        height = 10;

    }
}
