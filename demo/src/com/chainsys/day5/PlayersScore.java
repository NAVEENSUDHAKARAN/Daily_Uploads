package com.chainsys.day5;

import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.PaletteBorder;

public class PlayersScore {

	public static void main(String[] args)
	{
				
		boolean gameOver;
		int score;
		int levelCompleted;
		int bouns;
		
		PlayersScore display = new PlayersScore();
		Scanner PlayersScore = new Scanner(System.in);
		System.out.println("Enter the Number of Scores : ");
		int numberOfScores = PlayersScore.nextInt();
		int[] numArr = new int[numberOfScores];
		
		for(int i=0; i<numArr.length; i+=1)
		{
			System.out.print("Enter the Player Name : ");
			String name = PlayersScore.next();
			System.out.print("Enter the Score : ");
			numArr[i] = PlayersScore.nextInt();
			DisplayHighScorePosition(name, numArr[i]);
			CalculateHighScorePosition(numArr[i]);
		}
		
	}
	//1500, 900, 400 and 50
	public static void DisplayHighScorePosition(String playerName, int position)
	{
		System.out.println("Player Name is : " + playerName + "\nManaged to Get The : " );
	}
	
	public static void CalculateHighScorePosition(int score)
	{
		if(score >= 1000)
		{
			System.out.print("First Position\n");
		}
		else  if(score >= 500 && score < 1000)
		{
			System.out.print("Second Position\n");
		}
		else if(score >= 100 && score <= 500)
		{
			System.out.print("Third Position\n");
		}
		else
		{
			System.out.print("Fourth Position\n");
		}
	}
}
