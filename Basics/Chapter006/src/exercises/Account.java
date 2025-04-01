package exercises;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Account {
    private static double interestRate = 0.1;
    private String name;
    private String agency;
    private int number;
    private double balance;
    private LocalDate openingDate;

    public Account(String name, String agency, int number, LocalDate openingDate) {
        this(name, agency, number, 0, openingDate);
    }

    public Account(String name, String agency, int number, double balance, LocalDate openingDate) {
        setName(name);
        setAgency(agency);
        setNumber(number);
        setBalance(balance);
        setOpeningDate(openingDate);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Argument must be greater than zero.");
        }

        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount) throws Exception {
        if (amount <= 0) {
            throw new IllegalArgumentException("Argument must be greater than zero.");
        }

        double difference = getBalance() - amount;

        if (difference < 0) {
            throw new Exception("Insufficient balance.");
        }

        setBalance(difference);
    }

    public double getIncome() {
        double result = balance + (balance * interestRate);

        return result;
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

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        if (agency == null || agency.isEmpty() || agency.isBlank()) {
            throw new IllegalArgumentException("Argument must not be null or empty.");
        }

        this.agency = agency;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Argument must be greater than zero.");
        }

        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Argument must be equal or greater than zero.");
        }
        this.balance = balance;
    }

    public LocalDate getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(LocalDate openingDate) {
        LocalDate now = LocalDate.now();
        long elapsedDays = ChronoUnit.DAYS.between(openingDate, now);

        if (elapsedDays < 0) {
            throw new IllegalArgumentException("Argument must be equal or less than the date of today.");
        }

        this.openingDate = openingDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, agency, number);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || !(obj instanceof Account)) {
            return false;
        }

        // if (obj == null || this.getClass() != obj.getClass()) {
        // return false;
        // }

        Account other = (Account) obj;

        boolean isNameEqual = name != null && name.equals(other.name);
        boolean isAgencyEqual = agency != null && agency.equals(other.agency);
        boolean isNumberEqual = number == other.number;

        return isNameEqual && isAgencyEqual && isNumberEqual;
    }

    @Override
    public String toString() {
        return "Account [name = " + name + ", agency = " + agency + ", number = " + number + ", balance = " + balance
                + ", openingDate = " + openingDate + "]";
    }
}
