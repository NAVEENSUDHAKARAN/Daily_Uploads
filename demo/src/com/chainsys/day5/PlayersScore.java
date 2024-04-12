package com.chainsys.day5;

public class PlayersScore {

	public static void main(String[] args)
	{
				
		boolean gameOver;
		int score;
		int levelCompleted;
		int bouns;
		
		PlayersScore display = new PlayersScore();
		
		
	}
	
	public void DisplayHighScorePosition(String playerName, int Position)
	{
		
	}
	
	public void CalculateHighScorePosition(int score)
	{
		if(score >= 1000)
		{
			System.out.println("First Position");
		}
		else  if(score >= 500 && score < 1000)
		{
			System.out.println("Second Position");
		}
		else if(score >= 100 && score <= 500)
		{
			System.out.println("Third Position");
		}
		else
		{
			System.out.println("Fourth Position");
		}
	}
}
