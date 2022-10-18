public class TestMyToolBox {
public static void main(String[] args) {
//test the time of day
System.out.println("Posted at " + MyToolBox.timeOfDay());
//test if the numberline works with different widths so the -1 should display nothing, 4 should display 10, 47 should
// display 37 and 111 should display 80 as thats the limit we put
MyToolBox.tweetHeader( -1);
MyToolBox.tweetHeader( 4);
MyToolBox.tweetHeader( 37);
MyToolBox.tweetHeader( 72);
MyToolBox.tweetHeader( 111);        
//test the display tweet so it gets seperated into different segments
MyToolBox.displayTweet("Edsger Dijkstra", 4);
MyToolBox.displayTweet("How can I protect you in this crazzzzzzzyyyyy worldddddd, it's alrighttttt", 90);
MyToolBox.displayTweet("WOW. Lowe is such a fantastic player. What a glorious win", 56);
MyToolBox.displayTweet("this WILL LOOK long", 1);
//this part will test if the code displays -1 for no hashtag or @'s or if it counts them if present
String COpon = "#COP26 Unite behind the Science @ThePlanet";
System.out.println(MyToolBox.countOf(COpon, '#'));
System.out.println(MyToolBox.countOf(COpon, '#'));
System.out.println(MyToolBox.countOf(COpon, 'U'));
String westHam = "Westham are winning the @pl";
System.out.println(MyToolBox.countOf(westHam, '#'));
System.out.println(MyToolBox.countOf(westHam, '@'));
System.out.println(MyToolBox.countOf(westHam, 'e'));
String covid = "covid cases are at an #alarming rate, cleary " +
"vaccinations alone aren't enough";
System.out.println(MyToolBox.countOf(covid, '#'));
System.out.println(MyToolBox.countOf(covid, '@'));
System.out.println(MyToolBox.countOf(covid, 'e'));
//now this will test the analyse part of he code
String parnas = "We must not forget that the wheel is reinvented " +        
"so often because it is a very good idea; " +
"I've learned to worry more about the soundness " +
"of ideas that were invented only once.";
MyToolBox.analyse(parnas,35);
String lol = "#just doing my @CS4141 assingment. " +
"So satisying! #CS ";
MyToolBox.analyse(lol,55);
String LM121 = "I highly reccomend LM121 to any @6thyear student " +
"who is looking to do computer science next year";
MyToolBox.analyse(LM121,8);
String hello = "#HELLO!. Wow, this whole coding thing is such an awsome experience";
MyToolBox.analyse(hello, 34);
String xmas = "Got the assignment done early to enjoy UL xmas's day!";
MyToolBox.analyse(xmas, 99);
}
}
