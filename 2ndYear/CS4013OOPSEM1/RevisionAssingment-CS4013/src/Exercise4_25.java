import java.util.Scanner;
public class Exercise4_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //scanner setup
    System.out.println("Enter a number: ");
    double number = input.nextInt(); //number saved as double
    double output = 0;
        for(double i = 1; i<= number; i++){ //if i < number inputted, add 1 to output and check again, loop adds up all
            output = output + (output + 1);
            System.out.printf("%.0f\n", output); //output with no decimal points
        }
    }
}