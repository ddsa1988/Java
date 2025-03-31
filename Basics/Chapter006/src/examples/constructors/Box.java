package examples.constructors;

public class Box {
    public double width;
    public double height;
    public double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "width = " + width + ", height = " + height + ", depth = " + depth;
    }
}
