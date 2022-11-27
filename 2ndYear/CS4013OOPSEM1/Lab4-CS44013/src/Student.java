public class Student extends Person {
    String programmeOfStudy;
    int yearOfStudy;

    public Student(String name, String address, String phoneNumber, String emailAddress, String programmeOfStudy, int yearOfStudy) {
        super(name, address, phoneNumber, emailAddress);
        this.programmeOfStudy = programmeOfStudy;
        this.yearOfStudy = yearOfStudy;

    }

    public String getProgrammeOfStudy(String programmeOfStudy) {
        return programmeOfStudy;
    }
    public void setProgrammeOfStudy(String programmeOfStudy) {
        this.programmeOfStudy = programmeOfStudy;
    }

    public int getYearOfStudy(int yearOfStudy) {
        return yearOfStudy;
    }
    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
    public String toString() {
        return super.toString() + "\nProgramme of Study: " + programmeOfStudy + "\nYear of Study: " + yearOfStudy;
    }
}
