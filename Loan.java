class Loan {
    int tenure;
    double principal;
    float interestRate;
    String accountNumber;

    public double calculateEMI() {
        if (tenure > 0) {
            double simpleInterest = (principal * interestRate * tenure) / 100;
            return (simpleInterest + principal) / tenure;
        } else {
            System.out.println("Error: Tenure should be greater than zero.");
            return 0.0; // or handle the error in an appropriate way
        }
    }
}

