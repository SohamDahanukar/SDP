public class PermanentEmployee extends Employee {
    private double basicPay;
    private double hra;
    private double variableComponent;

    public PermanentEmployee(String name, int employeeId, double basicPay, double hra) {
        super(name, employeeId);
        this.basicPay = basicPay;
        this.hra = hra;
    }

    public void calculateSalary() {
        variableComponent = 0.1 * basicPay; // 10% of basicPay as variable component
        setSalary(variableComponent + basicPay + hra);
    }
}
