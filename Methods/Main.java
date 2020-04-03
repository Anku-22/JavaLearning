package Udemy_Course;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //String playerName = "Anku";
        //int playerScore = 500;

        int positionInTable = calculateHighScorePosition(1001);
        displayHighScorePosition("Anku", positionInTable);

        positionInTable = calculateHighScorePosition(750);
        displayHighScorePosition("Viku", positionInTable);

        positionInTable = calculateHighScorePosition(250);
        displayHighScorePosition("Bitu", positionInTable);

        positionInTable = calculateHighScorePosition(50);
        displayHighScorePosition("Raju", positionInTable);


    }

    public static void displayHighScorePosition(String playerName, int positionInTable){
        System.out.println("Player '" + playerName + "' managed to get into position '" + positionInTable + "' on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore){

        int position = 4;

        if (playerScore >= 1000)
            position = 1;
        //else if (playerScore >= 500 && playerScore < 1000) "playerScore < 1000" this condition is already been satisfied at the first condition
        else if (playerScore >= 500)
            position = 2;
        else if (playerScore >=100)
            position = 3;

        return position;
    }
}
