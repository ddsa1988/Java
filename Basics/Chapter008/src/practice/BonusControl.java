package practice;

public class BonusControl {
    private double totalBonus;

    public void register(Employee emp) {
        totalBonus += emp.getBonus();
    }

    public double getTotalBonus() {
        return totalBonus;
    }

    public void setTotalBonus(double totalBonus) {
        if (totalBonus <= 0) {
            throw new IllegalArgumentException("Argument must be greater than zero.");
        }

        this.totalBonus = totalBonus;
    }
}
