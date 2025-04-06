package basics;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "BoxWeight [width = " + width + ", height = " + height + ", depth = " + depth + ", weight = " + weight
                + "]";
    }
}
