package training.abstract_lessen_2;

public abstract class Figure {
    private int height;
    private int width;

    public Figure(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void square() {
    }
}
