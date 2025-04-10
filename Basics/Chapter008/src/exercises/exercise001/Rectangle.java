package exercises.exercise001;

public class Rectangle extends Shape {

    public Rectangle(double width, double length) {
        super(width, length);
    }

    @Override
    public double getArea() {
        double width = getDim1();
        double length = getDim2();
        double area = width * length;

        return area;
    }

    @Override
    public String toString() {
        double width = getDim1();
        double length = getDim2();

        return "Rectangle [width = " + width + ", length = " + length + "]";
    }
}
