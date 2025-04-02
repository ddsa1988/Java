package examples.objectsAsParameters;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equalTo(Point other) {
        return other != null && x == other.x && y == other.y;
    }
}
