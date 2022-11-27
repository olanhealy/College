//Olan Healy
//21318204
import java.util.Collections;
public class DictionaryDriver {
    public static void main(String[] args) { //coded on intelleji so i added the link to CSV file here
        if (args.length < 3) { // if the argument is less than 3 do this
            if (args.length < 1) {
                System.out.println("ERROR: Filepath missing ");
            }
            if (args.length < 2) {
                System.out.println("ERROR: Shortest missing");
            }
            System.out.println("ERROR: Longest missing");
            return;
        } //NOTE========================================
        System.out.println(args[0]); //may need to take this out when testing
        String filepath = args[0];
        int shortest = Integer.parseInt(args[1]);
        int longest = Integer.parseInt(args[2]);
        // NOTE: my Laptop is named Olan Healy
        //so in my link to use the csv file it looked like this for example
        //"C:\Users\Olan Healy\OlanJavaUl\src\com\Cs4222\src\Sample.CSV" 0 15
        //And the space was messing up how I accsessed the CSV file, so I had to use print out
        // the argument [0] for it to work
        // NOTE=================================================
        Dictionary words = new Dictionary(args[0], shortest, longest );
        //prints out the list of words(I used sample.csv to test)
        System.out.println("List of words in csv file: " + words);

        String test = "ELTON"; //can set any word, in or out of list

        if (!words.inDictionary(test)) { //if word is not in dictionary do this
            System.out.printf("%s not in Dictionary\n", test);

            if (words.add(test)) { //add word
                System.out.printf("%s added to Dictionary\n", test);
            } else {
                System.out.printf("%s not added to Dictionary\n", test);
            }
        } else {
            System.out.printf("%s is in Dictionary\n", test); //otherwise it's already in dictionary
        }

        // check again, for our inDictionary class we cretaed
        if (!words.inDictionary(test)) {
            System.out.printf("%s not in Dictionary\n", test);
        } else {
            System.out.printf("%s is in Dictionary\n", test);
        }

        // check binary search
        if(!words.inDictionary(test) ) {
            System.out.printf("%s is not in Dictionary\n", test) ;
        } else {
            System.out.println("The binary position of the word " + test + " in the list is......" +  words.binarySearch(test) + "!!!!"  );
        }

        // prints random word
        System.out.println("Random word from list: " + words.nextWord());

    }
}