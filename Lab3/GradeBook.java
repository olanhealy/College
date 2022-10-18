import java.util.ArrayList;

public class GradeBook {
    private String gradeBookName;
    private int numberOfTests;
    ArrayList<String> studentIds = new ArrayList<>(); //arraylist fr ids
    ArrayList<StudentResult> gBook = new ArrayList<>(); //arraylist for gradebooks
    //constructor which sets tests and gradebookname to be used
    public GradeBook(String name, int numberOfTests) {
        this.numberOfTests = numberOfTests;
        this.gradeBookName = name;
    }
    //get method for name of gradebook
    public String getName() {
        return gradeBookName;
    }
    //get method for number of tests
    public int getNoOfTests() {
        return numberOfTests;
    }
     //adds student result to gradebook unless id has been already used (then its added onto that id)
    void addStudentResult(String id, int testId, double value)  {
       int i = 0; //initalize
       if (studentIds.contains(id)) { //if it contains the id already,
        i = studentIds.indexOf(id);
            (gBook.get(i)).addResult(testId, value); //result is added back on
        }else{
        studentIds.add(id); //add the id to new one
        StudentResult newGradeBook = new StudentResult(id);
        newGradeBook.addResult(testId, value); //add result
        gBook.add((studentIds.indexOf(id)),newGradeBook); //add its position in array
        }
        }

    public String toString() {
        String tempresults = ""; //temp string
        String results = "";
        int i = 0;
        for (int j = studentIds.size(); j>0; j-- ){ //if the student id size > 0,

            tempresults = "Student : " + gBook.get(i).toString() + "\n" ; //gets position in array to compare grade
            results = results + tempresults ; //added to result
            i++;
        }

        return results;
    }


}
