package basics;

public class ClassA {
    public int i, j;

    public String showIj() {
        return "i = " + i + ", j = " + j;
    }

    @Override
    public String toString() {
        return "ClassA [i = " + i + ", j = " + j + "]";
    }
}
