public class EmployeeRecords {
    public static void main(String[] args) {
        // Input for PermanentEmployee
        PermanentEmployee permanentEmployee = new PermanentEmployee("John", 101, 5000, 1500);
        permanentEmployee.calculateSalary();
        permanentEmployee.displayDetails();

        // Input for ContractEmployee
        ContractEmployee contractEmployee = new ContractEmployee("Jane", 102, 40, 20);
        contractEmployee.calculateSalary();
        contractEmployee.displayDetails();

        // Accessing the salary using getter method
        System.out.println("John's Salary: $" + permanentEmployee.getSalary());
        System.out.println("Jane's Salary: $" + contractEmployee.getSalary());
    }
}
