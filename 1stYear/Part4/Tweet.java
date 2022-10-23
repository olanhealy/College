import java.util.Objects; // I use objects later for one part
public class Tweet {
  //declare private variables so we can manipulate them later

    private String postedBy;

    private String tweetText;

    private int hashtagCount;

    private int usernameCount;

    private long postedAt;

    private final int DEFAULT_DISPLAY_WIDTH = 30;
    private final int MINIMUM_DISPLAY_WIDTH = 1;
    private final int MAXIMUM_DISPLAY_WIDTH= 80;
    private final int MINIMUM_HEADER_WIDTH = 10;
    public Tweet(String text) {
        this.tweetText = text; //gets text 
        this.postedBy = System.getProperty("user.name"); //gets username of user of pc running the code
        this.hashtagCount = this.count('#'); //gets # count
        this.usernameCount = this.count('@'); //gets username count
        this.postedAt = System.currentTimeMillis(); //returns time was posted at in miliseconds since 1st jan 1970

    }
//declare or get methods for getting the info we need
    public String getTweetText (){ return this.tweetText;}

    public int getHashCount (){ return this.hashtagCount;}

    public int getUserCount (){ return this.usernameCount;}

    public String getPostedBy(){ return this.postedBy;}

    public long getPostedAt (){return this.postedAt;}

    public int getDEFAULT_DISPLAY_WIDTH (){return this.DEFAULT_DISPLAY_WIDTH; }

    public int getMINIMUM_DISPLAY_WIDTH (){return this.MINIMUM_DISPLAY_WIDTH; }

    public int getMAXIMUM_DISPLAY_WIDTH (){return this.MAXIMUM_DISPLAY_WIDTH; }

    public int getMINIMUM_HEADER_WIDTH (){return this.MINIMUM_HEADER_WIDTH; }

    private int count(char symbol) {
          int count, i ;
       //count methi=od from part 3 which we use symbol to find the amount of hashtags and usernames 
        if(tweetText.indexOf(symbol) == -1){
            return 0;
        }else{
            count= 0;

            for(i = 0; i < tweetText.length() ; i++) {
                if(tweetText.charAt(i) == symbol) {
                    count++;
                }
            }
            return count;
        }
    }
    

    public String postedAtTime() {

        //copied nd pasted my code for the clock from previous part
        final long MILLISECONDS_IN_A_DAY = 24*60*60*1000 ;
        final long SECONDS_IN_AN_HOUR = 60*60 ;
        long millisSinceMidnight = 0, secondsSinceMidnight = 0 ;
        long hour = 0, minute = 0, second = 0 ;
        millisSinceMidnight = this.postedAt % MILLISECONDS_IN_A_DAY;
        secondsSinceMidnight = millisSinceMidnight / 1000;
        hour = secondsSinceMidnight / SECONDS_IN_AN_HOUR;
        minute = (secondsSinceMidnight % SECONDS_IN_AN_HOUR) / 60;
        second = (int) secondsSinceMidnight % 60;
        return String.format("%02d:%02d:%02d",hour,minute,second);

    }

    public int timeInSeconds(){ return (int) (this.postedAt/1000); //divides time by 1000 to give you value in seconds

    }

    public int timeInSeconds(int hour, int minute, int second){ //get time in hour mins and seconds 
        if (hour >23 || hour <0 ){return -1;}
        if (minute < 0 || minute >59 ){return -1;}
        if (second < 0 || second >59 ){return -1;}
        return (hour*3600)+(minute*60)+second;
    }

    public char activityIndicator() {
        final long MILLISECONDS_IN_A_DAY = 24*60*60*1000 ; //part of clock code for hour 
        final long SECONDS_IN_AN_HOUR = 60*60 ;
        long millisSinceMidnight = this.postedAt % MILLISECONDS_IN_A_DAY;
        long secondsSinceMidnight = millisSinceMidnight / 1000;
        long hour = secondsSinceMidnight / SECONDS_IN_AN_HOUR;
        if (hour >= 22) { //if statements for if the clock is bigger or less then it prints our desired letter
            return 'N';
        } 
        if (hour >= 17) {
            return 'E';
        }
        if (hour >= 12) {
            return 'A';
        }
        if (hour >= 6) {
            return 'M';
        }
        return 'N';
    }

    public boolean containsWord(String aWord){
     String[] words = this.tweetText.split(" ");
        for(int i=0; i< words.length; i++){
            if (words[i] == aWord){
            if (words[i].equals(aWord)) {
            if(Objects.equals(words[i], aWord)){ //if the word we look for is in the tweet, it will display true
                return true;
         }
    } 
}
}
return false; //if not it will display false
}



    
    public void display(int width, boolean includeHeader) {
        if (includeHeader) {
            tweetheader(width);
        }
        tweet_split(width);
    }

    
    private void tweet_split (int Width){
        
        if (Width < this.MINIMUM_DISPLAY_WIDTH){ Width = this.MINIMUM_DISPLAY_WIDTH;}
        if (Width > this.MAXIMUM_DISPLAY_WIDTH){Width = this.MAXIMUM_DISPLAY_WIDTH;} //from the doccumentatiom

        
        int estimatedL  = this.tweetText.length() + this.tweetText.length()%Width + 1;

        StringBuilder result = new StringBuilder(estimatedL);

        // turn the tweet into a charArray then deal with each char
        char[] char_array = this.tweetText.toCharArray();
        for(int i=0;i<char_array.length;i++){
            //gets minimum
            if (i > 0 && i%Width == 0){
                result.append('\n');
            }

            
            result.append(char_array[i]);
        }

        
        System.out.println(result);
    }


    private void tweetheader(int width){ 
        if (width < this.MINIMUM_HEADER_WIDTH){width = MINIMUM_HEADER_WIDTH; }
        if (width > this.MAXIMUM_DISPLAY_WIDTH){width = this.MAXIMUM_DISPLAY_WIDTH; }
        StringBuilder tens = new StringBuilder(width);
        StringBuilder units = new StringBuilder(width);
        StringBuilder underLine = new StringBuilder(width);  
        for(int i=1; i<(width+1);i++){
            final int mod10 = i % 10;
            if(mod10 == 0){
                tens.append(i/10);
            } else {
                tens.append("");
            }
            units.append(mod10);
            underLine.append("="); //prints all the equals with the numberline
        }
        System.out.println(tens);
        System.out.println(units);
        System.out.println(underLine);
    }

}
