public class Main {

    public static void main(String[] args) {

        String playerName = "Java";
        int position = calculateHighScorePosition(999);

        displayHighScorePosition(playerName, position);
    }

    // 1st Method
    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position: " + playerPosition + " on high score list");
    }

    // 2nd Method
    public static int calculateHighScorePosition(int score) {
        int res = 4;
        if (score >= 1000) {
            res = 1;
        }
        else if (score >= 500) {
            res = 2;
        }
        else if (score >= 100) {
            res = 3;
        }
        return res;
    }
}
