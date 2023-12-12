public class ContractEmployee extends Employee {
    private double totalHours;
    private double wages;

    public ContractEmployee(String name, int employeeId, double totalHours, double wages) {
        super(name, employeeId);
        this.totalHours = totalHours;
        this.wages = wages;
    }

    public void calculateSalary() {
        setSalary(totalHours * wages);
    }
}

