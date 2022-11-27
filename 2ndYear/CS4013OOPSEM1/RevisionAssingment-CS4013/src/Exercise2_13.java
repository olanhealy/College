import java.util.Scanner;
public class Exercise2_13 {
    public static void main(String[] args) {
        double total, temp, temp2; //temp ints so we can get a total amount easier after 6 months
        Scanner input = new Scanner(System.in); //set up scanner to allow user input
        System.out.println("Enter a monthly saving amount: ");
        double amount = input.nextDouble(); //save amount entered as double as can have decimal points
        temp = amount * (1 + .00417); //1st month
        temp2 = (amount + temp) * (1 + .00417); //2nd month
        temp = (amount + temp2) * (1 + .00417); //3rd month
        temp2 = (amount + temp) * (1 + .00417); //4th month
        temp = (amount + temp2) * (1 + .00417); //5th month
        total = (amount + temp) * (1 + .00417); //6th and final month
        System.out.println("After the 6th month,the account value is: €" + total);
    }

}
