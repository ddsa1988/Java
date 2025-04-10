package examples.basics;

public class ClassB extends ClassA {
    public int k;

    public String showK() {
        return "k = " + k;
    }

    public int sum() {
        return i + j + k;
    }

    @Override
    public String toString() {
        return "ClassB [i = " + i + ", j = " + j + ", k = " + k + "]";
    }
}
