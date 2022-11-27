/**
 *
 * This is a lab exercise class. This is a class gotten from the slides and additions have been made
 *
 * @author Olan Healy
 * @version 16.0.2
 * @since 28-09-2022
 */
import java.util.Arrays;
public class Course {
    /**
     *  the coursename
     *  student array of size 4
     *  the number of students
     */
        private String courseName;
        private String[] students = new String[4];
        private int numberOfStudents;

    /**
     *
     * @param courseName
     * @return a new coursename
     */
        public Course(String courseName) {
            this.courseName = courseName;
        }

    /**
     *
     * @param student
     * @return add number of student to array. A new temp array is made for when students get full to
     * double the size of the array to hold more students
     */

        public void addStudent(String student) {
            if(students.length == numberOfStudents) {
                String[] temp = new String[students.length * 2 ];

                System.arraycopy(students, 0, temp, 0, students.length);
                students = temp;
            }

            students[numberOfStudents] = student;
            numberOfStudents++;

        }

    /**
     * getStudents array
     * @return the students
     */
    public String[] getStudents() {
            return students;
        }

    /**
     *  getNumberOfStudents
     * @return the number of students
     */

    public int getNumberOfStudents() {
            return numberOfStudents;
        }

    /**
     * getCourseName
     * @return the course name
     */

    public String getCourseName() {
            return courseName;
    }

    /**
     *
     * @param student
     * Drop student method. change array is made which takes one less than size of previous array. if this
     * equals t
     */
    public void dropStudent(String student) {
        int count = 0;
        String[] change = new String[--numberOfStudents];
        for (String temp : students) {
            if (temp.equals(student)) {
                continue; //lets it continue on if a student drops out
            }
            change[count] = temp;
            count++;
        }
        students = change; //lets the original array equal the new one without the dropout
    }

}
