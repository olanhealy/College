public class TestTweetClass {

    public static void main(String[] args) {
        //declare a tweet for test
        Tweet the_tweet = new Tweet("In the world of #code, you have your good days but also your bad days @UL.");

        
        System.out.println("Tweet:      "+ the_tweet.getTweetText()); //gets the tweet text
        System.out.println("Hashtags:   "+ the_tweet.getHashCount()); //gets hashtag count
        System.out.println("Users:      "+ the_tweet.getUserCount()); //gets usernamecount
        System.out.println("PostedBy:   "+ the_tweet.getPostedBy()); //gets who tweet posted by
        System.out.println("PostedAt:   "+ the_tweet.getPostedAt()); //gets posted at in seconds
        System.out.println();
        System.out.println("Default Width:      "+ the_tweet.getDEFAULT_DISPLAY_WIDTH()); //all the different width displays for tweet
        System.out.println("Min Width:          "+ the_tweet.getMINIMUM_DISPLAY_WIDTH());
        System.out.println("Max Width:          "+ the_tweet.getMAXIMUM_DISPLAY_WIDTH());
        System.out.println("Min Width (header): "+ the_tweet.getMINIMUM_HEADER_WIDTH());

        System.out.println();
        System.out.println("Posted at:          " + the_tweet.postedAtTime());

        System.out.println("Posted at (time in seconds):  " + the_tweet.timeInSeconds());

        System.out.println("Posted at (custom time in seconds): " + the_tweet.timeInSeconds(11, 5, 30));
        System.out.println("Posted in the:      " + the_tweet.activityIndicator());

        System.out.println();

        //Should return true
        System.out.println("Contains bad:  " + the_tweet.containsWord("bad"));
        //Should return false
        System.out.println("Contains DavidMoyes:   " + the_tweet.containsWord("DavidMoyes"));
        //should return false
        System.out.println("Contains Hello:       " + the_tweet.containsWord("Hello"));
        //should return true
        System.out.println("Contains days:        " + the_tweet.containsWord("days"));

        System.out.println();
        System.out.println();

        //the different tweet displays for true
        the_tweet.display(0, true);
        the_tweet.display(7, true);
        the_tweet.display(11, true);
        the_tweet.display(111, true);
        
        System.out.println();
        System.out.println();

        //tweet display for false
        the_tweet.display(11, false);

        System.out.println();
        System.out.println();
    }
}
