public class Employee {
    private String firstName;
    private String lastName;
    private double payment;

    public Employee(String firstName, String lastName, double payment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.payment = payment;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return payment;
    }

    public void setSalary(double salary) {
        this.payment = salary;
    }
}

