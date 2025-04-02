package examples.objectsAsParameters;

public class PointDemo {
    public static void userMain() {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(35, 45);
        Point p3 = new Point(10, 20);

        System.out.println(p1.equalTo(p2));
        System.out.println(p1.equalTo(p3));
        System.out.println(p1.equalTo(null));
    }
}
