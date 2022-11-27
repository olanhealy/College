import java.time.LocalDate;

public class BankAccount {
    private int id;
    private double balance;
    private double annualInterestRate;
    private LocalDate dataCreated;

    /**
     * constructor
     * @param id
     * @param balance
     */
    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;

    }

    /**
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * set id
     */
    public void setId(int id ) {
        this.id = id;
    }

    /**
     *
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     *
     * set balance
     */
    public double setBalance(double balance) {
        this.balance  = balance;
        return this.balance;

    }

    /**
     *
     * @return annual interest rate
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     *
     * set annual interest rate
     */
    public double setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
        return annualInterestRate;

    }

    /**
     *
     * @return data created
     */
    public LocalDate getDataCreated() {
        return dataCreated;

    }

    /**
     *
     * @return monthly interest rate
     */
    public double getMonthlyInterestRate() {
        return (annualInterestRate / 12);

    }

    /**
     *
     * @param total
     * withdraw method
     */
    public void withdraw(double total) {
        balance -= total;
    }

    /**
     *
     * @param total
     * deposit method
     */
    public void deposit(double total) {
        balance += total;
    }

    /**
     *
     * @override
     */
    public String toString() {
        return "ID: " + getId() + "\nBalance: €" + getBalance() +   "\nAnnual Interest Rate: " + getAnnualInterestRate() + "\nData Created: " + getDataCreated();
    }
}





