package io.asbun;

public class Main {

    public static void main(String[] args) {
	// write your code here
        calculateScore("Rodrigo", 500);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points ");
        return score * 1000;
    }
}
