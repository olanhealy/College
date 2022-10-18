import java.util.ArrayList;

public class TestResult {
    private ArrayList<Double> scores = new ArrayList<>();
    private double total = getTotal();

    double[] scoresTable = {0, 1, 30, 35, 40, 48, 52, 56, 60, 64, 72, 80};
    String[] gradeTable = {"NG", "F", "D2", "D1", "C3", "C2", "C1", "B3", "B2", "B1", "A2", "A1"};

    /*
    public TestResult() {
        total = scores[0];
    }*/

    public void setScore(int i, double value){
        scores.set((i-1), value);
    }

    public double getScore(int i){
        return scores.get(i - 1);
    }

    public double getTotal(){
        double total = 0;
        for(double score: scores){
            total += score;
        }
        this.total = total;
        return total;
    }

    public String getGrade(){
        String grade = "";
        for(int i = 0; i < scoresTable.length; i++){
            if(total >= scores.get(i) && total < scores.get(i + 1)){
                grade = gradeTable[i];
            }
        }
        return grade;
    }
}