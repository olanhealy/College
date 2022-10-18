public class CurrentAccount extends BankAccount {
    private double limit = -200;

    public CurrentAccount(int id, double balance) {
        super(id, balance);
    }

        public void withdraw(double with) {
            double balance = getBalance();
            if (balance - with < limit) {
                System.out.println("INSUFFICENT FUNDS IN ACCOUNT");
            } else {
                balance = balance - with;
                setBalance(balance);

            }

        }
        public String toString() {
        return "ID: " + getId() + "\nBalance: " + getBalance();

        }
}