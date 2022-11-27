package src;

import java.util.Objects;
import java.util.StringTokenizer;

/**
   An appointment time.
*/
public class AppointmentTime {

    private int hours;
    private int minutes;

    /*
      Add additional code here
        */
    public AppointmentTime(String nextToken) {
        StringTokenizer tokenizer = new StringTokenizer(nextToken); //token setup
        hours = Integer.parseInt(tokenizer.nextToken(":")); // hours is next token
        minutes = Integer.parseInt(tokenizer.nextToken(":")); //minutes is next token ( as HRS:MINS)
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false; // if obj null return false
        AppointmentTime token = (AppointmentTime) obj; //appointment time token is now obj since exists
        return (hours == token.hours && minutes == token.minutes); //return this

    }

    public String toString() {
        String set = hours + ":"; //so will return (HR:)
        if (minutes < 10)   //if minutes < 10 I.e 09 mins
            set += "0" + minutes; //add 0 in before mins is printed
        return set;
    }
}

