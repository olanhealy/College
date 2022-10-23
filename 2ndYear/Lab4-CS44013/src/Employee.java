public class Employee extends Person {
    private String office;
    private double salary;

    /**
     * constrcutor
     * @param name
     * @param address
     * @param phoneNumber
     * @param emailAddress
     * @param office
     * @param salary
     */
    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
    }

    /**
     * @return  office
     *
     */
    public String getOffice() {
        return office;
    }

    /**
     * @return  salary
     *
     */
    public String getSalary() {
        return String.format("%.2f", salary);
    }

    /**
     *
     * set new office
     */
    public void setOffice(String office) {
        this.office = office;
    }

    /** Set new salary */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     *
     * @override
     */

    public String toString() {
        return super.toString() + "\nOffice: " + office +
                "\nSalary: $" + getSalary()  ;
    }
}
