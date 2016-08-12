package com.RockPaperScissors;

import java.util.Random;

public class Bryn extends OpponentClass {

	public Bryn(String playerName, String pickOfThree, String selectOpponent) {
		super("Bryn", pickOfThree, selectOpponent);
		// TODO Auto-generated constructor stub
	}

	public Bryn() {
		super("Bryn", randomPlay(), "bryn");
	}

	public static String randomPlay() {

		Random rand = new Random();
		int value = rand.nextInt(3) + 1;

		String opponentSelection = null;

		if (value == 1) {
			opponentSelection = "rock";
		} else if (value == 2) {
			opponentSelection = "paper";
		} else if (value == 3) {
			opponentSelection = "scissors";
		}
		return opponentSelection;
	}

}
