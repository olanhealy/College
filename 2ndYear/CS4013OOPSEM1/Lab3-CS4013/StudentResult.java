
public class StudentResult  {
    private String studentID;
    TestResult result = new TestResult();

   //parameter for studentID
    public StudentResult(String studentID) {
     this.studentID = studentID;
    }
    //parameter for studentid + number of tests
    public StudentResult(String studentID, int numberOfTests) {
     this.studentID = studentID;
    }
    //get method for student id
    public String getStudentId() {
        return studentID;
    }
     //adds test result for a defined student
    public void addResult(int testId, double value) {
        result.setScore(testId, value);
    }
    //to string method for id, result and grade (total result)
    public  String toString() {
        return studentID + ", " + result.getTotal() + ", " + result.getGrade();
    }

}
