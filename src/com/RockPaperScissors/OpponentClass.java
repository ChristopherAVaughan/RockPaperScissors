package com.RockPaperScissors;

public class OpponentClass extends PlayerClass {

	protected String selectOpponent = null;

	public OpponentClass(String playerName, String pickOfThree, String selectOpponent) {
		super(playerName, pickOfThree);
		this.selectOpponent = selectOpponent;
	}

	public OpponentClass() {
	}

	public String getSelectOpponent() {
		return selectOpponent;
	}

	public void setSelectOpponent(String selectOpponent) {
		this.selectOpponent = selectOpponent;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

}
