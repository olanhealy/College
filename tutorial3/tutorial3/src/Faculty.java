public class Faculty extends Employee {
    String rank;
    double officeHrs;
    public Faculty ( String n, String a, String p, String e, String o, double s, double oh, String r) {
        super(n, a, p, e, o, s );
        this.officeHrs =oh;
        this.rank = r;
    }
    public String toString() {
        return name + " Faculty";
    }

}
