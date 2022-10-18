public class Student extends Person {
    String programmeOfStudy;
    int yearOfStudy;

    public Student(String n, String a, String p, String e, String pos, int y) {
        super(n, a, p, e);
        this.programmeOfStudy = pos;
        this.yearOfStudy = y;

    }
    public String toString() {
        return name + "Student";
    }
}
