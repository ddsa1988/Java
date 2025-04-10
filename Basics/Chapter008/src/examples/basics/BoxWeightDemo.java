package examples.basics;

public class BoxWeightDemo {
    public static void userMain() {
        var box1 = new BoxWeight(10, 20, 15, 34.3);
        var box2 = new BoxWeight(2, 3, 4, 0.076);

        System.out.println("box1: " + box1);
        System.out.println("box2: " + box2);
    }
}
