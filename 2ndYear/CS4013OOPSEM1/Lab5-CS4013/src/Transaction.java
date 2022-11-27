import java.time.LocalDateTime;
public class Transaction {
    private double amount, balance;
    private String type, description;

    /**
     * constructor
     * @param type
     * @param amount
     * @param balance
     * @param description
     */

    public Transaction( String type, double amount, double balance, String description ) {
        this.amount = amount;
        this.balance = balance;
        this.type = type;
        this.description = description;
    }

    public String toString() {
        return "Type: " + type + ", amount: " + amount + ", balance: " + ", description: " + description + "\n" ;
    }
}
