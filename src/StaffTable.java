public class StaffTable {
    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        employees[0] = new Employee("Karol", "Woźniak"
                , 5500.50);
        employees[1] = new Employee("Zbigniew"
                , "Gołąb", 5100.10);

        int employeeIndex = 1;

        System.out.println((employees[employeeIndex - 0].getFirstName() + " "
                + employees[employeeIndex - 0].getLastName() + ", wypłata: " +
                employees[employeeIndex - 0].getSalary() + "zł"));

        System.out.println((employees[employeeIndex - 1].getFirstName() + " "
                + employees[employeeIndex - 1].getLastName() + ", wypłata: " +
                employees[employeeIndex - 1].getSalary() + "zł"));

        double[] payment = {5500.50, 5100.10};
        double sum = payment[0] + payment[1];
        System.out.println("Suma pieniędzy na wypłatę dla pracowników to:"
                + sum + "zł");
    }
}