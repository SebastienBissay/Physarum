public class Layer {
    int width, height;
    float[][] grid;

    public Layer(int width, int height) {
        this.width = width;
        this.height = height;
        grid = new float[width][height];
    }

    public float getPheromones(float x, float y) {
        int intX = (int) Math.floor(x);
        int intY = (int) Math.floor(y);
        // Out of bounds, no trail
        if (intX < 0 || intX > width - 1 || intY < 0 || intY > height - 1) return 0;
        return
                (1 - y + intY) *
                        ((1 - x + intX) * grid[intX][intY]
                        + (x - intX) * grid[intX + 1][intY])
                + (y - intY) *
                        ((1 - x + intX) * grid[intX][intY + 1]
                                + (x - intX) * grid[intX + 1][intY + 1]);
    }
}