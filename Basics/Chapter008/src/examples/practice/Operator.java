package examples.practice;

public class Operator extends Employee {

    public Operator(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public double getBonus() {
        return getBaseSalary() * 0.10;
    }
}
