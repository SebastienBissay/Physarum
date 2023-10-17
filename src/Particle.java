public class Particle {
    protected float x, y, heading;
    public static float sensorAngle, sensorDistance, rotationAngle, deposition, stepSize;

    public Particle(float x, float y){
        this.x = x;
        this.y = y;
    }

    void move() {
        x += stepSize * Math.cos(sensorAngle);
        y += stepSize * Math.sin(sensorAngle);
    }

    void depositPheromone(Layer layer) {
        layer.grid[(int) x][(int) y] += deposition;
    }
}