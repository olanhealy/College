import java.util.Scanner;
public class Exercise5_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numA,numB,numC;
        System.out.println("Enter 3 numbers: ");
        numA = input.nextDouble();
        numB = input.nextDouble();
        numC = input.nextDouble();
        System.out.print("largest number: ");
        displayLargestNumber(numA,numB,numC); //uses method to display largest number of 3

    }
    public static void displayLargestNumber(
            double num1, double num2, double num3){
        if (num1>num2){ //if statements to find largest number
            if(num1>num3){
                System.out.print(num1);
            }else{
                System.out.print(num3);
            }
        }else if(num2>num3) {
            System.out.print(num2);
        }else{
            System.out.print(num3);
        }

    }
}


