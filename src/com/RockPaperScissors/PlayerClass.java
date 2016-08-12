package com.RockPaperScissors;

public abstract class PlayerClass {

	protected String playerName = null;
	protected String pickOfThree = null;

	public PlayerClass(String playerName, String pickOfThree) {
		this.playerName = playerName;
		this.pickOfThree = pickOfThree;
	}

	public PlayerClass() {
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPickOfThree() {
		return pickOfThree;
	}

	public void setPickOfThree(String pickOfThree) {
		this.pickOfThree = pickOfThree;
	}

	public abstract void move();
}
