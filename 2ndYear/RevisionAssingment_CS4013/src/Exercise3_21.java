import java.util.Scanner;
public class Exercise3_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //set up scanner
        System.out.println("Enter year (eg 2019): ");
        int year = input.nextInt(); //saved as int as year is an int
        System.out.println("Enter month (1-12): ");
        int month = input.nextInt(); //month is an int
        if (month == 1 || month == 2) { //if its month 1 or month 2, add 12 to month and -1 year
            month = month + 12;
            year = year - 1;
        }
        System.out.println("Enter day of the week (1-31): ");
        int day = input.nextInt(); //day is an int
        int date = ((day + ((26*(month + 1)/10)) + (year % 100) + (year/4) + ((year/100)/4) + (5 * (year/100) )) % 7);


        String dayOfWeek = "void";
        if (date == 0) {
            dayOfWeek = "Saturday";
        } else if (date == 1) {
            dayOfWeek = "Sunday";
        } else if (date == 2) {
            dayOfWeek = "Monday";
        } else if (date == 3) {
            dayOfWeek = "Tuesday";
        } else if (date == 4) {
            dayOfWeek = "Wednesday";
        } else if (date == 5) {
            dayOfWeek = "Thursday";
        } else {
            dayOfWeek = "Friday";
        }
        System.out.println("The day of the week is: " + dayOfWeek); //statement for number to represent day of week
    }
}

