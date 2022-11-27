import java.util.Random;
import java.util.Scanner;
public class Exercise3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pick a number which represents one of rock (0), paper(1), scissor's (2): ");
        int move = input.nextInt(); // int as can only be 0, 1 , 2
        String playerMove;
        if (move == 0) {
            playerMove = "rock";
        } else if (move == 1) {
            playerMove = "paper";
        } else {
            playerMove = "scissor's";
        }
        System.out.println("You have picked " + playerMove); //if statement to represents numbers to moves


        Random computer = new Random();
        int randomNumber = computer.nextInt(3); //computer picks random int (0-2)

        String computerMove;
        if (randomNumber == 0) {
            computerMove = "rock";
        } else if (randomNumber == 1) {
            computerMove = "paper";
        } else {
            computerMove = "scissor's";
        }
        System.out.println("The Computer has chosen " + computerMove); //gets computer move


        if (playerMove.equals(computerMove)) { // if moves are same its a draw
            System.out.println("The computer is " + computerMove + ". You are " + playerMove + ". It is a draw.");
        } else if (win(playerMove, computerMove)) { //uses win class to check win conditions
            System.out.println("The computer is " + computerMove + ". You are " + playerMove + ". You won");
        } else { //otherwise its a draw
            System.out.println("The computer is " + computerMove + ". You are " + playerMove + ". You lost");
        }
    }
        static boolean win (String playerMove, String computerMove) {
            if ( playerMove.equals("rock")) {
                return computerMove.equals("scissor's");
            } else if (playerMove.equals("paper")) {
                return computerMove.equals("rock");
            } else {
                return computerMove.equals("paper");
            }
        }

    }





