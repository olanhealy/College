public class Faculty extends Employee {
    String rank;
    String officeHours;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, double salary, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    /**
     *
     * @return office hours
     */

    public String getOfficeHours() {
        return officeHours;
    }

    /**
     * Set new office hours
     */
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    /**
     * @return rank
     *
     */
    public String getRank() {
        return rank;
    }

    /**
     * Set new rank
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * @override
     */
    public String toString() {
        return super.toString() + "\nOffice hours: " + officeHours +
                "\nRank: " + rank;
    }
}
