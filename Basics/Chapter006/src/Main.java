import java.time.LocalDate;

import exercises.*;

public class Main {
    public static void main(String[] args) {
        var acc1 = new Account("Diego", "Ag. 3253", 125, 1000, LocalDate.now());
        var acc2 = new Account("Diego", "Ag. 3253", 125, 2000, LocalDate.now());

        System.out.println(acc1);
        System.out.println(acc2);

        System.out.println();

        System.out.println("acc1.equals(acc2) => " + acc1.equals(acc2));
        System.out.println("acc1 == acc2 => " + (acc1 == acc2));
        System.out.println();

        acc1.deposit(2800);
        System.out.println(acc1);

        try {
            acc1.withdraw(2000);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(acc1);
        System.out.println();

        System.out.println("Income acc1: " + acc1.getIncome());
        System.out.println("Income acc2: " + acc2.getIncome());
    }
}
