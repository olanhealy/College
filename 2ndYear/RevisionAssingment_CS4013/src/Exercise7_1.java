import  java.util.Scanner;
public class Exercise7_1 {
    public static void main(String[] args) {
        double[][] matrix = matrix(); //double array named matrix created which = matrix class
        for (int col = 0; col < matrix[0].length; col++) {
            System.out.println("Sum of the elements at column " + col + " is " + sumColumn(matrix, col));

        }
    }
    public static double[][] matrix() {
        Scanner input = new Scanner(System.in);
        final int ROWS = 3;
        final int COLS = 4;
        double[][] mat = new double[ROWS][COLS]; // array has 3 rows, 4 columns



            System.out.println("Enter a " + ROWS + " by " + COLS + " matrix row by row:");
            // input should be as example:
            // 1 2 3 4
            // 2 3 4 5
            // 3 4 5 6
            // 4 5 6 7
        //this is a 3x4 matrix. enter whatever numbers you desire
            for (int row = 0; row < mat.length; row++) { // for the int row < length of array mat go to next for
                for (int col = 0; col < mat[row].length; col++) {  //for int col < length of array mat
                    mat[row][col] = input.nextDouble(); // the array will then be saved in the index as should
                }
            }
            return mat;
        }

        public static double sumColumn ( double[][] m, int columnIndex){
            double sumNum = 0;
            for (int row = 0; row < m.length; row++) { // for row < length of m
                sumNum += m[row][columnIndex]; //value of whichever row column m is in will be added to sumNum

            }
            return sumNum;

        }
    }



