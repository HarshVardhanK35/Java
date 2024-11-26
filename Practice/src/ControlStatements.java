public class ControlStatements {
    public static void main (String[] args){

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if(gameOver == true) {                                          // we can use "if (gameOver) {...}"
            finalScore = (int) (finalScore + (levelCompleted * bonus));
            System.out.println(finalScore);
        }

        // Challenge-1
        // need to insert new values into the already existing variables...
        // problem without creating new variables or without re-declaring the variables.. we can do the following
        score = 10000;
        levelCompleted = 8;                     // re-assigning values to existing variables
        bonus = 200;

        finalScore = score;

        if(gameOver == true) {                                          // we can use "if (gameOver) {...}"
            finalScore = (int) (finalScore + (levelCompleted * bonus));
            System.out.println(finalScore);
        }

        // problem... is that every variable value has got updated.. so we cannot see the previous values
    }
}
