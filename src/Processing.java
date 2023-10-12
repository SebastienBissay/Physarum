import processing.core.PApplet;

public class Processing extends PApplet {
    public static void main(String[] args) {
        PApplet.main(Processing.class);
    }

    private Layer trail;

    @Override
    public void settings() {
        size(1000, 1000);
    }

    @Override
    public void setup() {
        background(255);
        stroke(0);
        noFill();

        trail = new Layer(width, height);

        noLoop();
    }

    @Override
    public void draw() {
        
    }
}
