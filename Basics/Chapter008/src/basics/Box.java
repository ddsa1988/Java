package basics;

public class Box {
    public double width;
    public double height;
    public double depth;

    public Box() {
        this(-1, -1, -1);
    }

    public Box(double len) {
        this(len, len, len);
    }

    public Box(Box obj) {
        this(obj.width, obj.height, obj.depth);
    }

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
        return "Box [width = " + width + ", height = " + height + ", depth = " + depth + "]";
    }
}
