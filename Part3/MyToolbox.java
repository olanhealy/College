public class MyToolBox{
    public static void main(String[] args){
}

public static String timeOfDay() {
String timeOfDay ;
//copied nd pasted my code for the clock from previous code
final long MILLISECONDS_IN_A_DAY = 24*60*60*1000 ;
final long SECONDS_IN_AN_HOUR = 60*60 ;
long millisSinceMidnight = 0, secondsSinceMidnight = 0 ;
long hour = 0, minute = 0, second = 0 ;
millisSinceMidnight = System.currentTimeMillis() % MILLISECONDS_IN_A_DAY;
secondsSinceMidnight = millisSinceMidnight / 1000;
hour = secondsSinceMidnight / SECONDS_IN_AN_HOUR;
minute = (secondsSinceMidnight % SECONDS_IN_AN_HOUR) / 60;
second = secondsSinceMidnight % 60;
timeOfDay = String.format("%02d:%02d:%02d",hour,minute,second);
return timeOfDay;
}
public static void tweetHeader(int width){
String numberList, tweetHeader;
int list, count, i;
double endNumber;
//if statement for displaying different widths under certain circumstances
if (width <= 0) {
width = 0;
}else if(width > 80){
width = 80; 
}else if(width < 10){
width = 10;
}
//use while statement to print a number every 10 numbers and use the count to increase it each time its prnted so as it will 
//be 10,20 etc.
count = 1;
list = width;
while(list >= 10){
System.out.printf("%10d",count);
count ++;
list = list - 10;
}
System.out.println();
//numberline to the same length as width
numberList="1234567890";
i = width;
while(i>0){
if (i >= 10){
System.out.print(numberList);
i = i - 10;
}else{
System.out.print(numberList.substring(0, i));
i = 0;
}
}
System.out.println();        
//use for loop so the '=' will follow length of numbers
for(i = width; i > 0; i--){
System.out.print("=");
}
System.out.println();
}
public static void displayTweet(String tweetText, int width){
//use width from above
MyToolBox.tweetHeader(width);
String tweet = tweetText;
int list;
list = 0;
//uzed iff statement to split the tweet up i into the width as specified by the user of code
if(tweetText.length() == 0){
System.out.println();
}else{
while (list < tweetText.length()) {
System.out.printf("%-1s\n",tweetText.substring(list, Math.min(list + width, tweetText.length())));
list +=width;
}
}
}
public static int countOf(String tweetText, char symbol){
//I set up a simple counter for when you look for a '#' or '@'.
//I also set it up so if you look for a letter in the alphabet, it will return -1
int hashat, i ;
String alphabet = "abcdefghijklmnopqrstuvwxyz";
if (alphabet.indexOf(symbol) >= 0){
return -1;
}
if(tweetText.indexOf(symbol) == -1){
return -1;
}else{
hashat= 0;
for(i = 0; i < tweetText.length() ; i++) {
if(tweetText.charAt(i) == symbol) {
hashat++;
}
}
return hashat;
}
}
public static void analyse(String tweetText, int width){
//use the width and text that we used in the earlier parts of this code
MyToolBox.tweetHeader(width);
MyToolBox.displayTweet(tweetText, width);
//set it up so as it will display a 0 before the amount of hashtags and use or countOf from above
// to count the hashtags and ats or display -1 if if they dont show up
System.out.printf("%02d Hashtags \n", MyToolBox.countOf(tweetText,'#'));
System.out.printf("%02d Usernames\n" , MyToolBox.countOf(tweetText,'@'));
}
}
