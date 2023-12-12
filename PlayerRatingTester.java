public class PlayerRatingTester {
    public static void main(String[] args) {
        // For two critics
        PlayerRating player1 = new PlayerRating();
        player1.playerPosition = 1;
        player1.playerName = "Beckham";
        player1.calculateAverageRating(9, 9.9);
        player1.displayDetails();

        // For three critics
        PlayerRating player2 = new PlayerRating();
        player2.playerPosition = 1;
        player2.playerName = "Oscar";
        player2.calculateAverageRating(1, 1, 1);
        player2.displayDetails();
    }
}

