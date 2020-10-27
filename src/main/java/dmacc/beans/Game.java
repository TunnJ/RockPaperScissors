package dmacc.beans;

import java.util.Random;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;
	
	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayerToRandom();
		this.determineWinner();
	}
	
	void setComputerPlayerToRandom() {
		Random rand = new Random();
		int randNum = rand.nextInt(4 - 1) + 1;
		
		switch(randNum) {
		case 1: computerPlayer = "rock";
		break;
		case 2: computerPlayer = "paper";
		break;
		case 3: computerPlayer = "scissors";
		}
	}
	
	void determineWinner() {
		if(player1.equalsIgnoreCase("rock")) {
			
			if(computerPlayer.equals("rock")) {
				winner = "It was a tie.";
			}else if(computerPlayer.equals("paper")) {
				winner = "The computer beat you.";
			}else {
				winner = "You beat the computer!";
			}
			
		}else if(player1.equalsIgnoreCase("paper")) {
			
			if(computerPlayer.equals("rock")) {
				winner = "You beat the computer!";
			}else if(computerPlayer.equals("paper")) {
				winner = "It was a tie.";
			}else {
				winner = "The computer beat you.";
			}
			
		}else {
			
			if(computerPlayer.equals("rock")) {
				winner = "The computer beat you.";
			}else if(computerPlayer.equals("paper")) {
				winner = "You beat the computer!";
			}else {
				winner = "It was a tie.";
			}
			
		}
	}
}
