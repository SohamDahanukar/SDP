public class MarksHandler {
    private int[] marksArray;

    // Constructor to initialize the array
    public MarksHandler() {
        marksArray = new int[5];
    }

    // Method to store marks in the array
    public void storeMarks(int[] marks) {
        // Check if the provided array has exactly 5 elements
        if (marks.length == 5) {
            for (int i = 0; i < 5; i++) {
                marksArray[i] = marks[i];
            }
            System.out.println("Marks stored successfully.");
        } else {
            System.out.println("Invalid number of marks provided. Please provide marks for all 5 subjects.");
        }
    }

    // Method to display data from the array using an enhanced for loop
    public void displayMarks() {
        System.out.println("Marks for 5 subjects:");
        for (int mark : marksArray) {
            System.out.println(mark);
        }
    }

    public static void main(String[] args) {
        MarksHandler marksHandler = new MarksHandler();

        // Example marks array
        int[] exampleMarks = {80, 75, 90, 85, 95};

        // Store and display marks
        marksHandler.storeMarks(exampleMarks);
        marksHandler.displayMarks();
    }
}

