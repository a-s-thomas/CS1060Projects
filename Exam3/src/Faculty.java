public class Faculty extends Employee {
    String officeHours;

    //junior, senior
    String rank;

    Faculty(String name, String address, String phone, String email, String department, String salary,
            String hired, String officeHours, String rank) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phone;
        this.EmailAddress = email;
        this.department = department;
        this.monthlySalary = salary;
        this.dateHired = hired;
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String toString() {
        return "Name: " + this.name + ", Address: " + this.address + ", Phone: " + this.phoneNumber
                + "\nEmail: " + this.EmailAddress + ", Department: " + this.department +
                ", Monthly Salary: " + this.monthlySalary + "\nDate Hired: " + this.dateHired + ", Office Hours: "
                + this.officeHours + ", Rank: " + this.rank;
    }
}
