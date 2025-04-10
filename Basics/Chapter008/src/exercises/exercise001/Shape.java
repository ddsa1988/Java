package exercises.exercise001;

public abstract class Shape {
    private double dim1;
    private double dim2;

    public Shape(double dim1, double dim2) {
        setDim1(dim1);
        setDim2(dim2);
    }

    public abstract double getArea();

    public double getDim1() {
        return dim1;
    }

    public void setDim1(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Argument must be equal or greater than zero");
        }

        this.dim1 = value;
    }

    public double getDim2() {
        return dim2;
    }

    public void setDim2(double value) {
        if (value < 0) {
            throw new IllegalArgumentException("Argument must be equal or greater than zero");
        }

        this.dim2 = value;
    }
}
