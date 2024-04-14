public class Staff extends Employee {
    String title;

    Staff(String name, String address, String phone, String email, String department, String salary,
          String hired, String title) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phone;
        this.EmailAddress = email;
        this.department = department;
        this.monthlySalary = salary;
        this.dateHired = hired;
        this.title = title;
    }

    public String toString() {
        return "Name: " + this.name + ", Address: " + this.address + ", Phone: " + this.phoneNumber
                + "\nEmail: " + this.EmailAddress + ", Department: " + this.department +
                ", Monthly Salary: " + this.monthlySalary + "\nDate Hired: " + this.dateHired + ", Title: "
                + this.title;
    }
}
