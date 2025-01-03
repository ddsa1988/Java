package org.s010_inheritance;

import org.s010_inheritance.models.Shape;
import org.s010_inheritance.models.Triangle;

public class ShapeDemo {
    public static void userMain() {
        Triangle t1 = new Triangle();

        t1.width = 10;
        t1.height = 20;

        System.out.println(t1.getArea());
        System.out.println(Shape.counter);
    }
}
