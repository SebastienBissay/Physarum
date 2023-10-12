public class Layer {
    int width;
    int height;

    float[][] grid;

    public Layer(int width, int height) {
        this.width = width;
        this.height = height;
        grid = new float[width][height];
    }
}