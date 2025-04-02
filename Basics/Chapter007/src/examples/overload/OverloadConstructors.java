package examples.overload;

public class OverloadConstructors {
    public static void userMain() {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube1 = new Box(7);

        System.out.println("myBox1: " + myBox1);
        System.out.println("myBox2: " + myBox2);
        System.out.println("myCube1: " + myCube1);
    }

    private static class Box {
        public double width;
        public double height;
        public double depth;

        public Box() {
            this(-1, -1, -1);
        }

        public Box(double len) {
            this(len, len, len);
        }

        public Box(double width, double height, double depth) {
            this.width = width;
            this.height = height;
            this.depth = depth;
        }

        @Override
        public String toString() {
            return "Box [width = " + width + ", height = " + height + ", depth = " + depth + "]";
        }
    }
}