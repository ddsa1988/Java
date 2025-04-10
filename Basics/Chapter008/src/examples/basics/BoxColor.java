package examples.basics;

public class BoxColor extends Box {
    int color;

    public BoxColor(double width, double height, double depth, int color) {
        super(width, height, depth);
        this.color = color;
    }

    @Override
    public String toString() {
        return "BoxColor [width = " + width + ", height = " + height + ", depth = " + depth + ", color = " + color
                + "]";
    }
}
