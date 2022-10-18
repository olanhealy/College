public class Staff extends Employee {
    String title;
    public Staff(String n, String a, String p, String e, String o, double s, String t) {
        super(n, a, p, e, o, s);
        this.title = t;
    }
}
