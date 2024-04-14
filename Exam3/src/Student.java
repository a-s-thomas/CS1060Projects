public class Student extends Person {
    //freshman, sophomore, junior, senior
    String status;

    Student(String name, String address, String phoneNum, String email, String status) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNum;
        this.EmailAddress = email;
        this.status = status;
    }

    public String toString() {
        return "Name: " + this.name + ", Address: " + this.address + ", Phone: " + this.phoneNumber
                + "\nEmail: " + this.EmailAddress + ", Status: " + this.status;
    }
}
