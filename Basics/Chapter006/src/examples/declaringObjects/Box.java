package examples.declaringObjects;

public class Box {
    public double width;
    public double height;
    public double depth;

    @Override
    public String toString() {
        return "width = " + width + ", height = " + height + ", depth = " + depth;
    }
}
