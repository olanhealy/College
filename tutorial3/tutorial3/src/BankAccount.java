import java.time.LocalDate;

public class BankAccount {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private LocalDate dataCreated;


    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id ) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }
    public void setBalance(double balance) {
        this.balance  = balance;

    }

    public double getInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate() {
        this.annualInterestRate = annualInterestRate;
    }

    public LocalDate getDataCreated() {
        return this.dataCreated;

    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12);

    }

    public void withdraw(double total) {
        this.balance -= total;
    }

    public void deposit(double total) {
        this.balance += total;
    }
    public String toString() {
        return "ID: " + getId() + "\nBalance: " + getBalance() +   "\nAnnual Interest Rate: " + getInterestRate() + "\nData Created: " + getDataCreated();
    }
}





