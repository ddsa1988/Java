package practice;

public abstract class Employee {
    private String name;
    private int id;
    private double baseSalary;

    public Employee(String name, int id, double baseSalary) {
        setName(name);
        setId(id);
        setBaseSalary(baseSalary);
    }

    public abstract double getBonus();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Argument must not be null or empty.");
        }

        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("Argument must be equal or greater than zero.");
        }

        this.id = id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary <= 0) {
            throw new IllegalArgumentException("Argument must be greater than zero.");
        }

        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Employee [name = " + name + ", id = " + id + ", baseSalary = " + baseSalary + "]";
    }
}
