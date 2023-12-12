public class Chocolate {
    // Member variables
    private int barCode;
    private String name;
    private double weight;
    private double cost;

    // Default constructor
    public Chocolate() {
        // Initializing with default values
        this(101, "Cadbury", 12, 10);
    }

    // Parameterized constructor using "this" keyword
    public Chocolate(int barCode, String name, double weight, double cost) {
        this.barCode = barCode;
        this.name = name;
        this.weight = weight;
        this.cost = cost;
    }

    // Setter methods to modify values
    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    // Getter methods (if needed)
    public int getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    public static void main(String[] args) {
        // Creating an instance using default constructor
        Chocolate defaultChocolate = new Chocolate();
        System.out.println("Default Chocolate: " + defaultChocolate.getBarCode() + ", "
                + defaultChocolate.getName() + ", " + defaultChocolate.getWeight() + "g, $" + defaultChocolate.getCost());

        // Creating an instance using parameterized constructor
        Chocolate modifiedChocolate = new Chocolate(102, "Hershey's", 24, 50);
        System.out.println("Modified Chocolate: " + modifiedChocolate.getBarCode() + ", "
                + modifiedChocolate.getName() + ", " + modifiedChocolate.getWeight() + "g, $" + modifiedChocolate.getCost());
    }
}
