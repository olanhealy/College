
import java.util.ArrayList;

public class TestBankAccount {
    public static void main(String args[]) {
        ArrayList<BankAccount> bankAcc = new ArrayList<>();
        bankAcc.add(new CurrentAccount(1122, 4000, "Olan"));
        bankAcc.add(new CurrentAccount(2146, 50000, "Katie"));
        bankAcc.add(new SavingsAccount(2147, 40000, "Aine"));
        bankAcc.get(0).setAnnualInterestRate(11);


        (bankAcc.get(0)).withdraw(2500);
        (bankAcc.get(0)).withdraw(100);
        (bankAcc.get(0)).withdraw(200);
        System.out.println("Bank Account id: " + bankAcc.get(0).getId() + " : Transaction History: \n " + (bankAcc.get(0).getTransactions().toString()) + "\n");

        (bankAcc.get(1)).deposit(200);
        (bankAcc.get(1)).withdraw(10000);
        (bankAcc.get(1)).deposit(8000);
        System.out.println("Bank Account id: " + bankAcc.get(1).getId() + " : Transaction History: \n " + (bankAcc.get(1).getTransactions().toString()) + "\n");



        (bankAcc.get(2)).withdraw(2500);


        (bankAcc.get(2)).withdraw(100000);



    }
}