public class SavingsAccount extends BankAccount {

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    double overdrawn = 0;

    public void withdraw(double with) {
        double balance = getBalance();

        if (balance - with < overdrawn) {
            System.out.println("INSUFFICENT FUNDS");
        } else {
            balance = balance - with;
            setBalance(balance);
        }

    }
    public String toString() {
      return   "ID: " + getId() + "\nBalance: " + getBalance();
    }
}



