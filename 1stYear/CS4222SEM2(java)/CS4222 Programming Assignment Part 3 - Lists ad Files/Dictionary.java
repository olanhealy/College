//Olan Healy
//21318204
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Dictionary {
    private final ArrayList<String> words; //private as words will never change, only the contents
    private final int shortest;
    private final int longest; //private makes them so ass there never updated as we only use this

    private Object String;

    public Dictionary(String filepath, int shortest, int longest) {
        // This method reads words from the specified file
        // and adds them to the ‘words’ list. See details below.

        this.words = new ArrayList<>(); //changes words to an array list
        this.shortest = shortest;
        this.longest = longest;

        try {
            File dataFile = new File(filepath);
            Scanner dataSource = new Scanner(dataFile);//checks how many lines
            //are in the file (week 7 lab we used this)

            while (dataSource.hasNextLine()) {
                String line = dataSource.nextLine();
                String[] lineSplit = line.split(","); //split the line at every comma

                for (String word : lineSplit) {
                    String wordTrim = word.trim(); //trims the spaces in between words
                    //incase there are spaces in between the words etc.

                    String wordUppercase = wordTrim.toUpperCase(); //converts words to uppercase

                    if (wordTrim.length() >= this.shortest && wordTrim.length() <= this.longest) { //it says INCLUSIVE in code so
                        //if trimmed word has to be >= shortest and >= longest and then it
                        if (!this.words.contains(wordUppercase)) { //will check if it's not already in the list
                            this.words.add(wordUppercase); //if not it will add it to the list
                        }
                    }
                }
            }

            Collections.sort(this.words); //this will sort it in natural order

        } catch (IOException e) {
            System.out.println("File does not exist"); //if there is an exception, print
        }
    }


    public boolean add(String word) {
        String wordTrim = word.trim(); //trim the spaces in the added word
        String wordUppercase = wordTrim.toUpperCase(); //convert to uppercase

        if (wordTrim.length() >= this.shortest && wordTrim.length() <= this.longest) { //remember INCLUSIVE
            if (!this.words.contains(wordUppercase)) { //if the word is not in the list
                this.words.add(wordUppercase); //adds it
                Collections.sort(this.words); //sort in natural alphabetical order
                int index = Collections.binarySearch(words, wordUppercase);

                return true; //this basically is the same as above just for the words
                //we add such as checking if in list and if not it adds it, converts to
                //uppercase and sorts it
            }
        }

        return false;
    }

    public String nextWord() {
        if (this.words.size() == 0) {
            return ""; //if theres not a word, return empty string
        }
        int randomWord = (int) (Math.random() * this.words.size());
        return this.words.get(randomWord); //if not, get a random word from the list
    }

    public boolean inDictionary(String word) {
        String wordTrim = word.trim(); //trims word
        String wordUppercase = wordTrim.toUpperCase(); //converts to uppercase

        return this.words.contains(wordUppercase); //if true, it doesn't add hence contains
    }


    public String toString() {
        return words.toString(); //added  a to string class to convert Arryalist to string to print out the list
    }
public int binarySearch( String word) { //added a binary search class to find the index binary position of a word
   int index = Collections.binarySearch(words, word ); //save it as index
   words.add(word); //add the word to list
   Collections.sort(words); //sort it again in natural order



   return index;
}

}
