import processing.core.PApplet;

public class TryProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int x = 0;
    int x2 = 0;
    int x3 = 0;
    int x4 = 0;
    int y = HEIGHT;

    public static void main(String[] args) {
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        //background(255);
        drawCircle(x, (float) y / 5);
        drawCircle(x2, (float) (2 * y) / 5);
        drawCircle(x3, (float) (3 * y) / 5);
        drawCircle(x4, (float) (4 * y) / 5);

        x += 1;
        x2 += 2;
        x3 += 3;
        x4 += 4;
    }

    private void drawCircle(int x, float y) {
        ellipse(x, y, DIAMETER, DIAMETER);
    }
}
