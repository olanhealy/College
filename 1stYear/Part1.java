public class Part1 {
    public static void main(String[] args) {

       

        String tweet;


        tweet = "'Simplicity is a great virtue " +

                "but it requires hard work to achieve it " +

                "and education to appreciate it.'";


        //tweet = "'The question of whether #MachinesCanThink " +

        //        "is about as relevant as the question " +

        //        "of whether #SubmarinesCanSwim.'";
        
        //note: I changed this second tweet later but I left this part in
        
        
        
        final long MILISECONDS_IN_A_DAY = 24*60*60*1000;
        final long SECONDS_IN_AN_HOUR = 60*60;
        
        long milisSinceMidnight = 0, secondsSinceMidnight = 0;
        long hour = 0, minute= 0, seconds = 0;
        
        // we need to implement the times so as we can calculate how many 
        //milis since midnight on our pc, we get the MOD of this from 
        // MIlISECONDS_IN_A_DAY
        
        milisSinceMidnight = System.currentTimeMillis() % MILISECONDS_IN_A_DAY;
        
        // to get seconds since midnight, simply divide by our answer above by 
        // 1000 as theres 1000 milis in a second
        
        
        secondsSinceMidnight = milisSinceMidnight / 1000;
        
        //to get the hour, we can do secondssincemidnight / seconds 
        // in an hour (3600) as the it will always give us the hour value
         
        hour = secondsSinceMidnight / SECONDS_IN_AN_HOUR;
        
        // to get minute, we can get secondssincemidnight mod seconds in an hour
        //and divide it by 60 as for example if its 18000 seconds from midnight (
        // 5 hours) and you get mod from 3600, you wont have any minutes which is correct
        
        
        // but when you are off the exact hour in seconds getting the mod and dividing it by 
        // 60 enables you to get the exact minute
        
        minute = (secondsSinceMidnight % SECONDS_IN_AN_HOUR) / 60;
        
        //to get the second, we can simply get seconds since midnight mod 60
        // as example if its 387 seconds after midnight, this means theres 27
        // seconds gone in that minute and 387 mod 60 = 27 seconds
        
        seconds = secondsSinceMidnight % 60;
        
        // now we simply print hour minute and seconds after our first bit of text
        // we need to use if statements to print 0's when lets say its less than 10 seconds as if not it will just display 9 seconds with 
        // one 9 not as "09"
        
        System.out.println("******************************");
        System.out.println("Tweet Analysis");
        System.out.println("==============");
         
        System.out.print( "Posted at ");
        if(hour < 10) { System.out.print(0); }
        
        System.out.print( hour + ":" );
        if(minute < 10) { System.out.print(0); }
        System.out.print( minute + ":" );
        if(seconds < 10) { System.out.print(0); }
        System.out.print( seconds  );
        System.out.println("");
        
        
        
            
        
        
        //use the getpropety command to print the user of the device name
        
        System.out.println("Posted by "+ System.getProperty("user.name"));
        
        //now we just want to print the tweet
        
        System.out.println("Tweet text is " + tweet);
        
        // now we use the length command to count the amount of characters in the tweet
        // I used info from lec 7 slde 12 to help me do this I watched lecture 7 on sunday 17th of october
        
        System.out.println("Tweet length is " + tweet.length()  );
        
        //now we need to code something to see if the tweet contains hastag. I am going to use else if statements 
        // note used lec 4 slide to get greater than or equal too just whe I saw it I knew it was what to use
        
        if (tweet.indexOf ("#") >= 0)
        System.out.println("Tweet contains HashTag(S)");
        else 
        System.out.println("Tweet contains no HashTag(S)");
        System.out.println("******************************");
        
        
        // now we can use the same code except chaging it for tweet 2
        // I am going to change the secom=nd teet
        
        
        tweet = "'in the #NEPHET briefing today " +

               "they have given the green light for #nightclubs to open.... " +

                      "About time! #boogietime.'";
               
        //now we need to do the secoond tweet so we will copy and paste the 1st block of code 
        // I will also print a lot of spaces in between
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        
        System.out.println("******************************");
        System.out.println("Tweet Analysis");
        System.out.println("==============");
        System.out.print( "Posted at ");
        if(hour < 10) { System.out.print(0); }
        System.out.print( hour + ":" );
        if(minute < 10) { System.out.print(0); }
        System.out.print( minute + ":" );
        if(seconds < 10) { System.out.print(0); }
        System.out.print( seconds  );
        System.out.println("");
        System.out.println("Posted by "+ System.getProperty("user.name"));
        System.out.println("Tweet text is " + tweet);
        System.out.println("Tweet length is " + tweet.length()  );
        if (tweet.indexOf ("#") >= 0)
        System.out.println("Tweet contains HashTag(S)");
        else 
        System.out.println("Tweet contains no HashTag(S)");
        System.out.println("******************************");
        
    }
    
}