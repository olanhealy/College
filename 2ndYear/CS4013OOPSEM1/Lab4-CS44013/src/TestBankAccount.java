import java.time.LocalDate;
import java.util.ArrayList;

public class TestBankAccount {
    public static void main(String args[]) {
        ArrayList<BankAccount> bankAcc = new ArrayList<>();
        bankAcc.add(new CurrentAccount(1122, 4000));
        bankAcc.add(new CurrentAccount(2146, 50000));
        bankAcc.add(new SavingsAccount(2147, 40000));
        bankAcc.get(0).setAnnualInterestRate(11);


        (bankAcc.get(0)).withdraw(2500);


        (bankAcc.get(1)).deposit(8000.00);


        (bankAcc.get(2)).withdraw(100000);


        System.out.println(bankAcc);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.printf(bankAcc.toString());


    }
}