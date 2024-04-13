package com.chainsys.day5;

public class HighScore {
    public static void displayHighScorePosition(String playerName, int position) {
        if (position < 1 || position > 4) {
            System.out.println("Invalid position!");
        } else {
            System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
        }
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {
        int[] scores = {1500, 900, 400, 50};
        for (int score : scores) {
            int position = calculateHighScorePosition(score);
            displayHighScorePosition("Player", position);
        }
    }
}