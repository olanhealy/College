import java.time.LocalDate;

public class SavingsAccount extends BankAccount {
    /**
     * constructor
     * @param id
     * @param balance
     *
     */
    public SavingsAccount(int id, double balance) {
        super(id, balance );
    }

    /**
     * overdrawn decleratiom
     */
    double overdrawn = 0;

    /**
     *
     * @param with
     * withdraw method for savings account
     */

    public void withdraw(double with) {
        double balance = getBalance();

        if (balance - with < overdrawn) {
            System.out.println("INSUFFICENT FUNDS");
        } else {
           super.withdraw(balance - with);
        }

    }



    public String toString() {
        return   "ID: " + getId() + "\nBalance: € " + getBalance() + "\nAnnual Interest Rate: " + getAnnualInterestRate() + "\nData Created: " + getDataCreated();
    }
}



