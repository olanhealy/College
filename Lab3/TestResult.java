public class TestResult {

    // array list that holds the values of the scores
    private double[] scores ;
    // gets total score (in percentage)
    private double total;

    public TestResult(){
        scores = new double[4];
    }

    //two tables
    double[] scoresTable = {0, 1, 30, 35, 40, 48, 52, 56, 60, 64, 72, 80};
    String[] gradeTable = {"NG", "F", "D2", "D1", "C3", "C2", "C1", "B3", "B2", "B1", "A2", "A1"};

    //sets score in value table of value passed in param
    public void setScore(int i, double value){
        scores[i - 1] = value;
    }

    //getter for score
    public double getScore(int i){
        return scores[i - 1];
    }

    //getter for total
    public double getTotal(){
        total = 0;
        if (scores.length == 0){
            return 0;
        }
        for(double tempScore: scores){
            total += tempScore;
        }
        return total;
    }

    //get ,ethod for grade
    public String getGrade(){
        String grade = "";

        for(int i = 12; i > 0; i--){ //12 represents the amount of grades
            if(getTotal() >= scoresTable[i-1]){ //if total greater than or = to such position on score table
                grade = gradeTable[i-1]; //grade goes down one on table and 12 is decreased, keeps looping until score
                return grade;            //matches
            }
        }
        return grade;
    }
}