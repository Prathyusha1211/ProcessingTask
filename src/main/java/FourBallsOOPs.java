import processing.core.PApplet;

public class FourBallsOOPs extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER1 = 10;
    BallsClass[] balls = new BallsClass[4];

    public static void main(String[] args) {
        PApplet.main("FourBallsOOPs", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
        for (int i = 1; i <= balls.length; i++) {
            balls[i - 1] = new BallsClass(this, 0, (float) (i * HEIGHT) / 5, DIAMETER1, i);
        }
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        //background(255);
        for (BallsClass ball : balls) {
            ball.drawCircle();
            ball.move();
        }

    }


}

class BallsClass {
    private final PApplet parent;
    int x;
    float y;
    int diameter;
    int speed;

    BallsClass(PApplet parent, int x, float y, int diameter, int speed) {
        this.parent = parent;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.speed = speed;
    }

    public void drawCircle() {
        parent.ellipse(x, y, diameter, diameter);
    }

    public void move() {
        x += speed;
    }

}
