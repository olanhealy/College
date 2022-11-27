import java.util.Scanner;
public class Exercise6_13 {

        static final int SIZE = 5; //can be any number less than 54 you want
        public static void main (String[] args){
            int[] numbers = new int[SIZE]; //means we will enter 5 numbers to exclude from random
            Scanner input = new Scanner(System.in);
            System.out.print("Enter five numbers to exclude from random (1-54): ");
            for (int i = 0; i < numbers.length; i++) numbers[i] = input.nextInt(); // if i < 5, pick another number to exclude
            System.out.println("Random number generated between 1-45: " + getRandom(numbers));
        }//numbers are added as an int array

        public static int getRandom ( int...numbers){

            int random = (int) (Math.random() * 54 + 1); //random number between 1-54
            for (int i = 0; i < numbers.length; i++) { // for i < 5, if number generatoed is in list, generate another
                if (random == numbers[i]) {
                    random = (int) (Math.random() * 54 + 1);
                    i = -1;
                }
            }
            return random;
        }
    }


