package exercises.exercise001;

import java.util.Arrays;
import java.util.List;

public class TestDemo {
    public static void userMain() {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 20);

        List<Shape> shapes = Arrays.asList(circle, rectangle);

        for (Shape shape : shapes) {
            System.out.printf("%s => Area = %.2f\n", shape.getClass().getSimpleName(), shape.getArea());
        }
    }
}
