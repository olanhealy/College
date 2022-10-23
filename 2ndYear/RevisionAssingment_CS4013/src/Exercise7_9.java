import java.util.Scanner;
public class Exercise7_9 {
    public static void main(String[] args) {
        String [][] board = getBoard();

        // Create the Not's and crosses for tic tac toe
        String[] tokens = {" X "," O "};

        int result; // game status result

        // Repeat while result is continue
        do {
            // Display board
            print(board);

            // Get available cell to mark
            int[] cell = getCell(board, tokens[0]);

            // Mark available cell with player's token
            placeToken(board, cell, tokens[0]);

            // Determine game status
            result = gameStatus(board, tokens[0]);

            // If status is continue make next player take turn
            if (result == 2) {
                swap(tokens);
            }

        } while(result == 2);

        // Display board
        print(board);

        // Display game results
        if (result == 0)
            System.out.println(tokens[0] + "player won");
        else
            System.out.println("Players draw");

    }

    public static int gameStatus(String[][] m, String e) {
        if (isWin(m, e))
            return 0; //  returns Win
        else if (isDraw(m))
            return 1; // returns Draw
        else
            return 2; // Continue the game
    }


    public static boolean isWin(String[][] m, String t) { //checks other win functions to see if game was won
        return isHorizontalWin(m, t) || isVerticalWin(m, t) || isDiagonalWin(m, t);
    }


    public static boolean isHorizontalWin(String[][] m, String t) {
        for (int i = 0; i < m.length; i++) { //checks horizontal win
            int count = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == t)
                    count++;
            }
            if (count == 3)
                return true;
        }
        return false;
    }


    public static boolean isVerticalWin(String[][] m, String t) {
        for (int i = 0; i < m.length; i++) { //checks vertical win
            int count = 0;
            for (int j = 0; j < m[i].length; j++) {
                if (m[j][i] == t)
                    count++;
            }
            if (count == 3)
                return true;
        }
        return false;
    }


    public static boolean isDiagonalWin(String[][] m, String t) {
        int count = 0;
        for (int i = 0; i < m.length; i++) { //for i < length of string array m
            if (m[i][i] == t) // if position of m == t
                count++; // increase count by 1
            if (count == 3) //if count == 3 player has won
                return true;
        }

        count = 0;
        for (int i = 0, j = m[i].length - 1; j >= 0 ; j--, i++) {
            if (m[i][j] == t)
                count++;
            if (count == 3)
                return true;
        }
        return false;
    }

    public static boolean isDraw(String[][] m) { //ceck if game is a draw
        for (int i = 0; i < m.length; i++) { //for i < length of string array m
            for (int j = 0; j < m[i].length; j++) { //for j < position of i in length of string array m
                if (m[i][j] == "   ") //if position of m is blank return false
                    return false;
            }
        }
        return true;
    }

    public static void swap(String[] p) {
        String temp = p[0];
        p[0] = p[1];
        p[1] = temp; //swaps elements in the array
    }


    public static void placeToken(String[][] m, int[] e, String t) {
        m[e[0]][e[1]] = t; //fills whichever position with players move (nots or cross)
    }


    public static int[] getCell(String[][] m, String t) {

        Scanner input = new Scanner(System.in); //scanner for user input
        int[] cell = new int[2]; // Cell row and column

        // Prompt player to enter a not or cross
        do {
            System.out.print("Enter a row(0, 1, or 2) for player " + t + ": ");
            cell[0] = input.nextInt(); //player 1
            System.out.print("Enter a column(0, 1, or 2) for player " + t + ": ");
            cell[1] = input.nextInt(); //player2

        } while (!isValidCell(m, cell)); //while it is a valid cell
        return cell; //retrun the cell
    }


    public static boolean isValidCell(String[][] m, int[] cell) { //checks if position in array is able to be used
        for (int i = 0; i < cell.length; i++) { //for i < length of the cell array
            if (cell[i] < 0 || cell[i] >= 3) { //goes to if statment. if postion of i < 0 or >= 3, its invalid (not in 3x3 array)
                System.out.println("Invalid cell");
                return false;
            }
        }
        if (m[cell[0]][cell[1]] != "   ") {
            System.out.println(
                    "\nRow " + cell[0] + " column " + cell[1] + " is filled");
            return false;
        }
        return true;
    }


    public static String[][] getBoard() {
        String[][] m = new String[3][3]; // the 3x3 array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) { //this for loops keeps running until all spaces in board filled with blanks
                m[i][j] = "   ";
            }
        }
        return m;
    }


    public static void print(String[][] m) { //method to display board
        System.out.println("\n-------------"); //structure at top
        for (int i = 0; i < m.length; i++) { //for i < array lenth
            for (int j = 0; j < m[i].length; j++) {// same for J
                System.out.print("|" + m[i][j]);//print a | and then the array space, keep looping through until all printed
            }
            System.out.println("|\n-------------");
        }
    }
}