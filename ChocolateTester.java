
class Chocolate {
    private int barCode;
    private String name;
    private double weight;
    private double cost;

    // Default constructor to initialize the variables
    public Chocolate() {
        this.barCode = 101;
        this.name = "Cadbury";
        this.weight = 12;
        this.cost = 10;
    }

    // Getter methods
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

    // Setter methods
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
}

public class ChocolateTester {
    public static void main(String[] args) {
        // Create an object of chocolate using the default constructor
        Chocolate chocolate = new Chocolate();

        // Display the values using getter methods
        System.out.println("Initial Chocolate Details:");
        System.out.println("Bar Code: " + chocolate.getBarCode());
        System.out.println("Name: " + chocolate.getName());
        System.out.println("Weight: " + chocolate.getWeight());
        System.out.println("Cost: " + chocolate.getCost());

        // Modify the values using setter methods
        chocolate.setBarCode(102);
        chocolate.setName("Hershey's");
        chocolate.setWeight(24);
        chocolate.setCost(50);

        // Display the modified values using getter methods
        System.out.println("\nModified Chocolate Details:");
        System.out.println("Bar Code: " + chocolate.getBarCode());
        System.out.println("Name: " + chocolate.getName());
        System.out.println("Weight: " + chocolate.getWeight());
        System.out.println("Cost: " + chocolate.getCost());
    }
}

