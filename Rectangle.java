public class Rectangle {
    private int length;
    private int breadth;

    // Setter method for length
    public void setLength(int length) {
        this.length = length;
    }

    // Setter method for breadth
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // Getter method for length
    public int getLength() {
        return length;
    }

    // Getter method for breadth
    public int getBreadth() {
        return breadth;
    }

    public static void main(String[] args) {
        // Create an instance of the Rectangle class
        Rectangle myRectangle = new Rectangle();

        // Set the length and breadth using setter methods
        myRectangle.setLength(5);
        myRectangle.setBreadth(3);

        // Display the values using getter methods
        System.out.println("Length: " + myRectangle.getLength());
        System.out.println("Breadth: " + myRectangle.getBreadth());
    }
}
