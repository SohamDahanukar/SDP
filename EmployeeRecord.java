public class EmployeeRecord {
    public static void main(String[] args) {
        // Salaries array
        double salaries[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};

        // Calculate the average salary
        double totalSalary = 0;
        for (double salary : salaries) {
            totalSalary += salary;
        }
        double averageSalary = totalSalary / salaries.length;

        // Find the number of employees with salary greater than the average
        int aboveAverageCount = 0;
        for (double salary : salaries) {
            if (salary > averageSalary) {
                aboveAverageCount++;
            }
        }

        // Find the number of employees with salary lesser than the average
        int belowAverageCount = 0;
        for (double salary : salaries) {
            if (salary < averageSalary) {
                belowAverageCount++;
            }
        }

        // Display results
        System.out.println("Salaries:");
        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Employee " + (i + 1) + ": " + salaries[i]);
        }

        System.out.println("\nAverage Salary: " + averageSalary);
        System.out.println("Number of employees with salary greater than the average: " + aboveAverageCount);
        System.out.println("Number of employees with salary lesser than the average: " + belowAverageCount);
    }
}

