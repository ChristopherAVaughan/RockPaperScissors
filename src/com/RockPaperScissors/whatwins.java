package com.RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class whatwins {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String opponentName = null;
		String opponentSelection = null;
		String playerSelection = null;
		boolean playAgain = true;
		System.out.println("Welcome to the Roshambo simulator, try your luck!");

		while (playAgain) {
			OpponentClass opponent = null;

			while (opponent == null) {
				System.out.println("Please select an opponent by entering in their name: Bryn, Dr. Evil, "
						+ "or Rock (HINT, Rock plays the same way and Dr. Evil is known to cheat).");

				System.out.println("Please type in the name of your opponent:");
				opponentName = sc.nextLine();
	
			if (opponentName.equalsIgnoreCase("rock")) {
					opponent = new TheRock();

				} else if (opponentName.equalsIgnoreCase("bryn")) {
					opponent = new Bryn();

				} else if (opponentName.equalsIgnoreCase("dr. evil")) {
					opponent = new DrEvil();
				}
			}
			
			opponentSelection = opponent.getPickOfThree();

			do {
				System.out.println("Enter in your selection: paper, rock, or scissors on the line below.");
				playerSelection = sc.nextLine();
			}	while (!(playerSelection.equalsIgnoreCase("rock")) && !(playerSelection.equalsIgnoreCase("paper")) && !(playerSelection.equalsIgnoreCase("scissors")));

			// what wins and the result
			if (opponentSelection == null && playerSelection.equalsIgnoreCase("rock")) {
				System.out.println("You chose " + playerSelection + ", " + opponentName + " chose paper.  HAHAHAHA, you will never win!  MUAHAHAHAHAHAHAH!");
				
			} else if  (opponentSelection == null && playerSelection.equalsIgnoreCase("paper")) {
				System.out.println("You chose " + playerSelection + ", " + opponentName + " chose scissors.  HAHAHAHA, you will never win!  MUAHAHAHAHAHAHAH!");
			
			} else if (opponentSelection == null && playerSelection.equalsIgnoreCase("scissors")) {
				System.out.println("You chose " + playerSelection + ", " + opponentName + " chose rock.  HAHAHAHA, you will never win!  MUAHAHAHAHAHAHAH!");
			
			} else if (opponentSelection.equalsIgnoreCase("rock") && playerSelection.equalsIgnoreCase("paper")) {
				System.out.println("You chose " + playerSelection + ", " + opponentName + " chose " + opponentSelection + "." + " You win!");

			} else if (opponentSelection.equalsIgnoreCase("rock") && playerSelection.equalsIgnoreCase("scissors")) {
				System.out.println("You chose " + playerSelection + ", " + opponentName + " chose " + opponentSelection + "." + " You lose!");

			} else if (opponentSelection.equalsIgnoreCase("paper") && playerSelection.equalsIgnoreCase("rock")) {
				System.out.println("You chose " + playerSelection + ", " + opponentName + " chose " + opponentSelection + "." + " You lose!");

			} else if (opponentSelection.equalsIgnoreCase("paper") && playerSelection.equalsIgnoreCase("scissors")) {
				System.out.println("You chose " + playerSelection + ", " + opponentName + " chose " + opponentSelection + "." + " You win!");

			} else if (opponentSelection.equalsIgnoreCase("scissors") && playerSelection.equalsIgnoreCase("rock")) {
				System.out.println("You chose " + playerSelection + ", " + opponentName + " chose " + opponentSelection + "." + " You win!");

			} else if (opponentSelection.equalsIgnoreCase("scissors") && playerSelection.equalsIgnoreCase("paper")) {
				System.out.println("You chose " + playerSelection + ", " + opponentName + " chose " + opponentSelection + "." + " You lose!");
			
			} else {
				System.out.println("You chose " + playerSelection + ", " + opponentName + " chose " + opponentSelection + "." + " Don't draws just suck!");
			}
			System.out.println("Do you want to play again? (Yes to play again, Quit to exit)");
			String answerToRepeat = sc.nextLine();

			if (answerToRepeat.equalsIgnoreCase("quit")) {
				playAgain = false;
				System.out.println("Thank you for playing!");
			} else {
				playAgain = true;
			}
		}

	}

}
