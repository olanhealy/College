package src;

import java.util.StringTokenizer;

/**
   An appointment date.
*/
public class AppointmentDate
{  
   private int year;
   private int month;
   private int day;

   public AppointmentDate(String nextToken) { //used tokens again
      StringTokenizer tokenizer = new StringTokenizer(nextToken); //setup
      day = Integer.parseInt(tokenizer.nextToken( "/")); //day is next token
      month = Integer.parseInt(tokenizer.nextToken( "/")); //month is next token
      year = Integer.parseInt(tokenizer.nextToken( "/"));//year is next token (order important for running of system)
   }

   @Override
   public boolean equals(Object obj) {
      if (obj == null) return false;
      AppointmentDate token = (AppointmentDate) obj; //appointment date token is now obj since exists
      return (day == token.day && month == token.month && year == token.year); //return this
   }

   public String toString() {
      return String.format("%02d/%02d/%04d", day, month, year); //string format for day month and year
   }

   /*
      Add additional code here
   */
}

   /*
   Add additional code here
   */
