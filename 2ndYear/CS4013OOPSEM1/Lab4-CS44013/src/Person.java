public class Person {
    private String name, address, phoneNumber, emailAddress;

    public Person(String name_, String address_, String phoneNumber_, String emailAddress_) {
        name = name_;
        address = address_;
        phoneNumber = phoneNumber_;
        emailAddress = emailAddress_;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @Return address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @return getPhone
     */
    public String getPhone() {
        return phoneNumber;
    }

    /** @
     *
     * Return email
     * */
    public String getEmail() {
        return emailAddress;
    }

    /**
     * setName
     * */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *Set new address
     *
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Set new phone number
     */
    public void setPhone(String phone) {
        this.phoneNumber = phone;
    }

    /**
     * Set new email
     */
    public void setEmail(String email) {
        this.emailAddress = email;
    }

    /**
     *
     * @overide
     */
    public String toString() {
        return "\nName: " + name + "\nAddress: " + address +
                "\nPhone number: " + phoneNumber + "\nEmail address: " + emailAddress;
    }
}









