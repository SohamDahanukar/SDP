class PlayerRating {
    int playerPosition;
    String playerName;
    double averageRating;

    // Method Overloading for 2 critics
    public void calculateAverageRating(int criticOneRating, double criticTwoRating) {
        averageRating = (criticOneRating + criticTwoRating) / 2;
        determineCategory();
    }

    // Method Overloading for 3 critics
    public void calculateAverageRating(int criticOneRating, int criticTwoRating, int criticThreeRating) {
        averageRating = (criticOneRating + criticTwoRating + criticThreeRating) / 3;
        determineCategory();
    }

    private void determineCategory() {
        if (averageRating >= 8.0) {
            System.out.println("the category is A");
        } else if (averageRating >= 5.0) {
            System.out.println("the category is B");
        } else {
            System.out.println("the category is C");
        }
    }

    public void displayDetails() {
        System.out.println("the player name is " + playerName);
        System.out.println("the player position is " + playerPosition);
        System.out.println("the average rating is " + averageRating);
    }
}

