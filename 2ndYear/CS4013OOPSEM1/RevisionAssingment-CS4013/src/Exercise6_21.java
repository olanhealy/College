import java.util.Scanner;

public class Exercise6_21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //set up scanner

        // Enter amount of balls you want to drop
        System.out.print("Enter the number of balls to drop: ");
        int drops = input.nextInt(); //save as int

        // Prompt the user to enter the number of slots
        System.out.print("Enter the number of slots in the bean machine: ");
        int slots = input.nextInt() - 1; // save as int but -1 from it

        String[] paths = new String[slots * drops]; // Path of each ball
        int[] balls = new int[slots]; // The slot of each ball

        int numberOfRs = 0; // The number of Rs in a path
        for (int i = 0; i < paths.length; i++) { //if i < number of paths available, then
            paths[i] = getRandomPath(); //get its random path and add it

            // If if ball path is right numberOfRs increases
            if (paths[i] == "R") {
                numberOfRs++;
            }

            // Count the number of balls in each slot
            if ((i + 1) % slots == 0) {
                balls[numberOfRs]++;
                numberOfRs = 0;
            }
        }

        // Display the path of the balls
        print(paths, slots);

        // Display the the final buildup of the balls in the slots in a histogram
        print(balls);

    }


    public static String getRandomPath() { //get random path of balls
        if ((int) (Math.random() * 2) == 0)
            return "L";
        else
            return "R";
    }


    public static void print(String[] list, int n) {
        System.out.println();
        for (int i = 0; i < list.length; i++) //i < list length, then do print statement of elements per row
            System.out.print(((i + 1) % n == 0) ? list[i] + "\n" : list[i]);
    }

    /**
     * print overloaded displays a histogram of the data in a list
     */
    public static void print(int[] list) {
        int max = max(list); //mac int is list value

        while (max > 0) { //while max > 0
            System.out.println();
            for (int i = 0; i < list.length; i++) { //for i < list length  go to if statement
                if (list[i] >= max) { //if its greater max, print a ball otherwise ball is not there and don't
                    System.out.print("O");
                } else
                    System.out.print(" ");
            }
            max--; //take away from max
        }
        System.out.println();
    }

    /**
     * max returns the largest integer in a list
     */
    public static int max(int[] list) {
        int max = list[0]; //max is the list first postion

        for (int i = 1; i < list.length; i++) { //for i < list length go to if
            if (list[i] > max) //if postion of i less than max
                max = list[i]; //max now equals postion i
        }
        return max;
    }
}
