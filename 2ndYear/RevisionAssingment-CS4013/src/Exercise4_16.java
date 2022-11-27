import java.util.Scanner;
public class Exercise4_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //set up scanner
        System.out.println("Enter any Integer (whole) number: ");
        int number = input.nextInt();
        System.out.println("List of prime numbers between 0 and " + number);


        for (int i = 0; i <= number; i++) {
            if (primeNumber(i) && number % i == 0) {
                System.out.println(i);
            }

        }
    }



    public static boolean primeNumber(int prime) {
        if (prime <= 1) {
            return false;
        }
        for (int i = 2; i <= prime; i++ ) {
            if (prime % i == 0) {
                return false;
            }
        }
        return true;
    }
}
