import java.util.Arrays;
/**
 *
 * This is a lab exercise class. This class is used to test Course.java
 *
 * @author Olan Healy
 * @version 16.0.2
 * @since 28-09-2022
 */
 public class TestCourse {
        public static void main(String args[]){
            Course one = new Course("Computer Systems");
            one.addStudent("Niamh");
            one.addStudent("Brian");
            one.addStudent("Caragh");
            one.addStudent("Aoife");
            one.addStudent("Katie");
            one.addStudent("Oisin");
            one.addStudent("Ellie");
            one.addStudent("Daragh");
            one.addStudent("Ben");
            one.addStudent("Adam");
            one.addStudent("Ryan");
            one.addStudent("Shaun");
            one.addStudent("Molly");
            one.addStudent("Aine");
            one.addStudent("Micheal");
            one.addStudent("Roan");
            one.addStudent("Glenn");
            one.addStudent("Patrick");
            one.addStudent("Deirdre");
            one.addStudent("Garry");
            one.addStudent("Benny");
            one.addStudent("Ruth");
            System.out.println("Course name: " + one.getCourseName());
            System.out.println("Number of students: " + one.getNumberOfStudents());
            one.dropStudent("Caragh");
            one.dropStudent("Aine");
            System.out.println("Number of students since dropouts: " + one.getNumberOfStudents());
            System.out.println("List of students in Computer Systems " + Arrays.toString(one.getStudents()));
            System.out.println("==============================");



            Course two = new Course("Business Studies");
            System.out.println("Course name: " + two.getCourseName());
            two.addStudent("Kevin");
            two.addStudent("Micheal");
            two.addStudent("Evan");
            two.addStudent("Luke");
            two.addStudent("Callum");
            two.addStudent("Kayla");
            two.addStudent("Robyn");
            two.addStudent("Allie");
            two.addStudent("Lauren");
            two.addStudent("Orla");
            two.addStudent("Rossa");
            two.addStudent("Aldo");
            two.addStudent("Spyro");
            System.out.println("Number of students: " + two.getNumberOfStudents());
            two.dropStudent("Aldo");
            two.dropStudent("Orla");
            System.out.println("Number of students since dropouts: " + two.getNumberOfStudents());
            System.out.println("List of Students in Business Studies" + Arrays.toString(two.getStudents()));
        }
    }
