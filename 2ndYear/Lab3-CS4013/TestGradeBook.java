public class TestGradeBook {
    public static void main(String args[]) {
       System.out.println("GRADEBOOK TESTS");
        //declare students

        StudentResult studentA = new StudentResult("21318204");
        StudentResult studentB = new StudentResult("21318205");
        StudentResult studentC = new StudentResult("21318207");
        StudentResult studentD = new StudentResult("21318208");
        StudentResult studentE = new StudentResult("21318209");

        //declare gradebooks ( used my modules)
        GradeBook gradeBookA = new GradeBook("CS4013", 5);
        GradeBook gradeBookB = new GradeBook("CS4116", 3);
        GradeBook gradeBookC = new GradeBook("CS4004", 4);
        GradeBook gradeBookD = new GradeBook("CS4023", 3);
        GradeBook gradeBookE = new GradeBook("CS4178", 5);


        //add student results
        gradeBookA.addStudentResult("21344256", 1,10);
        gradeBookA.addStudentResult("21313725", 2, 75);
        gradeBookB.addStudentResult("21313725", 3, 85);
        gradeBookB.addStudentResult("21313726", 4, 79);
        gradeBookC.addStudentResult("21313776", 2, 39);
        gradeBookC.addStudentResult("21313754", 1, 25);
        gradeBookD.addStudentResult("21313457", 4, 77);
        gradeBookD.addStudentResult("21318906", 3, 67);
        gradeBookE.addStudentResult("21313888", 2, 100);
        gradeBookE.addStudentResult("21313700", 1, 0);

        //add the original student id results
        gradeBookA.addStudentResult(studentA.getStudentId(), 2,56);
        gradeBookB.addStudentResult(studentB.getStudentId(), 3,45);
        gradeBookC.addStudentResult(studentC.getStudentId(), 1,69);
        gradeBookD.addStudentResult(studentD.getStudentId(), 3,5);
        gradeBookE.addStudentResult(studentE.getStudentId(), 3,41);


         //get gradebook name and convert data with tostring method
        System.out.print(gradeBookA.getName() + " : " + "\n" + gradeBookA.toString());
        System.out.print(gradeBookB.getName() + " : " + "\n" + gradeBookB.toString());
        System.out.print(gradeBookC.getName() + " : " + "\n" + gradeBookC.toString());
        System.out.print(gradeBookD.getName() + " : " + "\n" + gradeBookD.toString());
        System.out.print(gradeBookE.getName() + " : " + "\n" + gradeBookE.toString());


   //use other methods to get random results/grade

        TestResult resultA = new TestResult();

        resultA.setScore(1,60);
        System.out.println(resultA.getScore(1));

        resultA.setScore(2,30);
        resultA.setScore(3,100);

        System.out.println("Result of 3 tests " + resultA.getTotal());

        System.out.println("Grade of these tests " + resultA.getGrade());



    }
}

