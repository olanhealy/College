public class Employee extends Person {
    String office;
    double salary;

    public Employee(String n, String a, String p, String e,  String o, double s) {
        super(n, a, p, e);
        this.office = o;
        this.salary = s;
    }
    public String toString() {
        return name  + "Employee";
    }
}
