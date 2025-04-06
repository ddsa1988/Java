package usingSuper;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        super();
        this.weight = -1;
    }

    public BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }

    public BoxWeight(BoxWeight obj) {
        super(obj);
        this.weight = obj.weight;
    }

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
