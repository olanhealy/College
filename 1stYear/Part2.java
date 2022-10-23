public class Assignment2021Part2 {
public static void main(String[] args) {
final long MILLISECONDS_IN_A_DAY = 24*60*60*1000 ;
final long SECONDS_IN_AN_HOUR = 60*60 ;
long millisSinceMidnight = 0, secondsSinceMidnight = 0 ;
long hour = 0, minute = 0, second = 0 ;
millisSinceMidnight = System.currentTimeMillis() % MILLISECONDS_IN_A_DAY;
secondsSinceMidnight = millisSinceMidnight / 1000;
hour = secondsSinceMidnight / SECONDS_IN_AN_HOUR;
minute = (secondsSinceMidnight % SECONDS_IN_AN_HOUR) / 60;
 second = secondsSinceMidnight % 60;
String tweet = "";


// used your code for the random selection and printing the tweet as mine was a bit
//long winded last time. I understand it all as in given each tweet a number and randomly
//printing one of the tweets

int randomSelection = (int) (Math.random() * 8);
if(randomSelection == 0) {
tweet = "Simplicity is a great virtue but it requires hard work to achieve it" +
" and education to appreciate it.";
} else if(randomSelection == 1) {
tweet = "The question of whether #MachinesCanThink is" +
" is about as relevant as the question of whether #SubmarinesCanSwim.";
} else if(randomSelection == 2) {
tweet = "Since David Moyes took over West Ham, he has" +
"taken West Ham from 17th two seasons ago" +
" to a record Prem points total in two years," +
" made them top of their Europa league group" +
" and has the highest win % rate of any West Ham manager." +
" THE MOSEYIAH! #COYI.";
} else if(randomSelection == 3) {  
tweet = "@CMOireland we know #covid is very serious but you really need to " +
"start caring for the younger generation with these restrions" +
"they are being left in the #dark!";
} else if(randomSelection == 4) {
tweet = "On September first 1939, the nazis pushed the allies boundaries by invading Poland," +
" it was one of the darkest days in European history which brought" +
" undisputable unrest across the continent for years to come";
} else if(randomSelection == 5) {
tweet = "#JustDownloadedTwitter #SoCool #Legend #Tweet" +
" #CS4141IsFullOfLegends #ButterBean #LOL" +
" #ULOnlyBuzzAmen" ; 
} else if(randomSelection == 6) {           
tweet = "Thomand Village in UL is full of absolute legends." +
" Best village in @UL" ;            
} else if(randomSelection == 7) {   
tweet = "A picture may be worth a thousand words, but a formula is worth a thousand pictures.";
}


System.out.println("******************************");
System.out.println("Tweet Analysis");
System.out.println("==============");
System.out.printf("Posted at %02d:%02d:%02d\n",hour,minute,second);
System.out.println("Posted by @" + System.getProperty("user.name") );
System.out.printf("Tweet Text (unformatted) : '%s'\n",tweet);
System.out.println("");
System.out.println("Tweet text ast a series of up to 30 character segments " );
System.out.println();
//need to split the tweet into 30 character segments
//we can use a while loop the split the tweet up into a substring that 
//splits the tweet up so it produces 30 characters on a line
int segment =0; 
while (segment <tweet.length() -30) {
System.out.println(tweet.substring(segment, segment + 30));
segment +=30;}
System.out.println(tweet.substring(segment, tweet.length()));
//now we need to count the hashtags and usernames, so we can use 
//a for loop
// to count the amount of times  a '#' and '@' symbols appear in
//the specified tweet  
int counter_Hashtag = 0;
for (int i =0; i < tweet.length(); i++) {
char c = tweet.charAt(i);
if (c == '#') {
counter_Hashtag ++;
}
}
System.out.println();
              

// need to add the 0 before the number of hashtags as outlined in the solution
System.out.printf("%02d",counter_Hashtag);
System.out.print(" Hashtags");
System.out.println();
// now, we need to do the same for the usernames(@ symbols)
int counter_Username =0; 
for (int i =0; i < tweet.length(); i++) {
char c = tweet.charAt(i);
if (c == '@') {
counter_Username ++;
}
}
System.out.printf("%02d",counter_Username);
System.out.print(" Usernames");
System.out.println();
System.out.println("******************************"); 
            
        }
}