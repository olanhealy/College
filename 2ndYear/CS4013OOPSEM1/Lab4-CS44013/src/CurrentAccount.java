

public class CurrentAccount extends BankAccount {
    private double limit = -200;

    /**
     * constructor
     * @param id
     * @param balance
     */

    public CurrentAccount(int id, double balance) {
        super(id, balance );

    }
    /**
     *
     * @param with
     * withdraw method for current account
     */
    public void withdraw(double with) {
        double balance = getBalance();
        if (balance - with < limit) {
            System.out.println("INSUFFICENT FUNDS IN ACCOUNT");
        } else {
           super.withdraw(balance - with);

        }

    }
    public String toString() {
        return "ID: " + getId() + "\nBalance: €" + getBalance() + "\nAnnual Interest Rate: " + getAnnualInterestRate() + "\nData Created: " + getDataCreated();

    }
}
