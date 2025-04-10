package examples.practice;

public class Analyst extends Employee {

    public Analyst(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public double getBonus() {
        return getBaseSalary() * 0.20;
    }
}
