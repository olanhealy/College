import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class BankAccount {
    private int id;
    private double balance;
    private double annualInterestRate;
    private LocalDate dataCreated;

    private String name; //Lab 5

    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    /**
     * constructor
     * @param id
     * @param balance
     */
    public BankAccount(int id, double balance,String name) {
        this.id = id;
        this.balance = balance;
        this.name = name;

    }
    public ArrayList<Transaction> getTransactions() {
        return transactions;
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
        Transaction newTransaction = new Transaction("w", total, balance, "Withdrawal");
        transactions.add((transactions.size()), newTransaction);
    }

    /**
     *
     * @param total
     * deposit method
     */
    public void deposit(double total) {
        balance += total;
        Transaction newTransaction = new Transaction("d", total, balance, "deposit");
        transactions.add((transactions.size()), newTransaction);
    }

    /**
     *
     * @override
     */
    public String toString() {
        return "ID: " + getId() + "\nBalance: €" + getBalance() +   "\nAnnual Interest Rate: " + getAnnualInterestRate() + "\nData Created: " + getDataCreated();
    }
}





