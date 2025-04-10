package examples.abstractClass;

import java.util.Arrays;
import java.util.List;

public class TestDemo2 {
    public static void userMain() {
        List<Figure> figures = Arrays.asList(new Rectangle(9, 5), new Triangle(10, 8));

        for (Figure fig : figures) {
            System.out.println("Area is " + fig.area());
        }
    }
}

abstract class Figure {
    double dim1;
    double dim2;

    public Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    public abstract double area();
}

class Rectangle extends Figure {
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double area() {
        System.out.println("Inside area for rectangle.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    public Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double area() {
        System.out.println("Inside area for triangle.");
        return dim1 * dim2 / 2;
    }
}
