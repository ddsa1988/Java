package exercises.exercise001;

public class Circle extends Shape {
    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    public double getArea() {
        double radius = getDim1();
        double area = Math.PI * Math.pow(radius, 2);

        return area;
    }

    @Override
    public String toString() {
        double radius = getDim1();

        return "Circle [radius = " + radius + "]";
    }
}
