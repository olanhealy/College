import java.util.Scanner;
public class Exercise2_25 {
    public static void main (String[] args ) {
        Scanner input = new Scanner(System.in); //set up scanner for inputs
        System.out.println("Enter employee's name: ");
        String name = input.next();
        System.out.println("Enter number of hours worked in a week: ");
        double hours = input.nextDouble(); //double as can be decimal points
        System.out.println("Enter hourly pay rate: ");
        double pay = input.nextDouble(); //double as can be decimal points
        System.out.println("Enter federal tax withholding rate: ");
        double federalTax = input.nextDouble(); //double as can be decimal points
        System.out.println("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble(); //double as can be decimal points
        double grossPay = pay * hours;
        System.out.println("Employee's name: " + name);
        System.out.println("Hours worked: " + hours);
        System.out.printf("Hourly pay rate: €%.2f\n", pay); //.2f to only allow 2 decimal points
        System.out.printf("Gross pay: €%.2f\n", grossPay);
        System.out.println("Deductions: ");
        double federalAmount = ((grossPay * (federalTax/100)));
        double stateAmount = ((grossPay * (stateTax/100)));
        double netPay = (grossPay - federalAmount - stateAmount);
        System.out.println("   Federal tax withholding rate (" + federalTax + "%): " + federalAmount);
        System.out.println("   State tax withholding rate (" + stateTax + "%): " + stateAmount);
        System.out.printf("Net Pay: €%.2f\n", netPay);



    }
}
