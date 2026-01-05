import processing.core.*;
import java.util.*;

public class App extends PApplet {
    ArrayList<Enemy> enemies = new ArrayList<>();
    private float r;
    private float g;
    private float b;

    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void settings() {
        size(800, 600);
    }

    public void setup() {
        r = random(0, 255);
        g = random(0, 255);
        b = random(0, 255);
    }

    public void draw() {
    }

    public void mousePressed() {
        fill(r,g,b);
        float x = mouseX;
        float y = mouseY;
        Enemy enemy = new Enemy(this, x, y);
        enemies.add(enemy);
        for (Enemy i : enemies) {
            rect(x, y, 50, 50);
        }
    }
}
