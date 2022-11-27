package src;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
   An appointment calendar.
*/
public class AppointmentCalendar {



   private ArrayList<Appointment> appointments;

   public AppointmentCalendar() {
      appointments = new ArrayList<Appointment>();
   }
    /*
      Add additional code here.
   */


   public void add(Appointment a) {
      appointments.add(a); //adds appontments to an arrylist of appoitments
   }

   public void cancel(Appointment a) {
      for (int i = 0; i < appointments.size(); i++) { //to cancel if i < arraylist size and i = position of appointment, then remove it
         if (appointments.get(i).equals(a)) {
            appointments.remove(i);
         }
         return;
      }
   }

   public ArrayList<Appointment> getAppointmentsForDay(AppointmentDate day) {
      ArrayList<Appointment> result = new ArrayList<Appointment>(); //arraylist of appointments for a day
      for (Appointment a : appointments) { // for an appointment being in the appointments arraylist
         if (a.getDay().equals(day)) {  // and if day of appointment equals day
            result.add(a); //add appointment to result arraylist
         }
      }
      return result; //return result arraylist
   }

}


