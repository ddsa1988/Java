package practice;

public class Manager extends Employee {

    public Manager(String name, int id, double baseSalary) {
        super(name, id, baseSalary);
    }

    @Override
    public double getBonus() {
        return getBaseSalary() * 0.40;
    }
}
