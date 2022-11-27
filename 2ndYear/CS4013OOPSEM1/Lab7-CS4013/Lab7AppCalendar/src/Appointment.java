package src;

import java.util.StringTokenizer;

/**
   An appointment.
*/
public class Appointment
{ 
   private String description;
   private AppointmentDate day;
   private AppointmentTime from;
   private AppointmentTime to;

   /*
      Add additional code here
   */
  // https://www.javatpoint.com/string-tokenizer-in-java looked at this for handling the tokens in the string instead of using split()
   public Appointment(String token) {
      StringTokenizer tokenizer = new StringTokenizer(token); //
      int descCount = tokenizer.countTokens() - 8; //can run 8 times before an exception
      description = tokenizer.nextToken(); //description is next token
      description += " ";
      for (int i = 0; i < descCount; i++) {
         description += tokenizer.nextToken();// description is next token if i < descCount(8) so can run 8 times
         if (i < descCount) {
            description += " ";
         }
      }

      day = new AppointmentDate(tokenizer.nextToken()); //day is next token
      from = new AppointmentTime(tokenizer.nextToken()); //from is next token
      to = new AppointmentTime(tokenizer.nextToken()); //to is next token
   }
   public boolean equals(Object obj)
   {
      if (obj == null) return false; //if it doesn't exist return false
      Appointment token = (Appointment) obj; //appointment token is  now obj since exists
      return (description.equals(token.description) && day.equals(token.day) && from.equals(token.from) && to.equals(token.to));
   }

   public boolean fallOnDate(AppointmentDate date)
   {
      return day.equals(day); //falls on an actual date
   }

   public Object getDay() {
        return day;
   } //get day method used for appoitnment calendar getAppointmentForDays method


   public String format() {
      return description + " " + day + " " + from + " " + to; //formatting the appointment so when you add appoitment this will appear (formatted more in Menu)
   }
}
