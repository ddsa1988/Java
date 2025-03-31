package examples.declaringObjects;

public class BoxDemo1 {
    public static void userMain() {
        Box myBox = new Box();

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        double volume = myBox.width * myBox.height * myBox.depth;

        System.out.println("Volume is " + volume);
    }
}
