package exercises;

public class Exercise004 {
    public static void userMain() {
        var acc1 = new Account("Diego", 352, 2500);
        var acc2 = new Account("Amanda", 685, 4000);
        var acc3 = new Account("Mike", 541, 1000);

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);
    }
}

final class Account {
    public static int counter;
    private String name;
    private int number;
    private int id;
    private double balance;

    static {
        counter = 1;
    }

    public Account(String name, int number) {
        this(name, number, 0);
    }

    public Account(String name, int number, double balance) {
        setName(name);
        setNumber(number);
        setBalance(balance);

        id = counter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            throw new IllegalArgumentException("Argument must not be null or empty.");
        }
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Argument must be equal or greater than zero.");
        }
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Argument must be equal or greater than zero.");
        }
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Account [name = " + name + ", number = " + number + ", id = " + id + ", balance = " + balance + "]";
    }
}
