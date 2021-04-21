package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	//String score = "DEFGABcd";
	String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	ArrayList<Note> notes = new ArrayList<Note>();
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		//char c = '7'; // c holds the character 7 (55)
		//int i = c - '0'; // i holds the number 7 (55 - 48) 
		//println(i);
	}

	public void setup() 
	{
		loadScore();
		printScores();
	}

	public void draw()
	{
		background(255);
		
	}

	void loadScore()
	{
		for(int i = 1; i < score.length(); i++)
		{
			char c = score.charAt(i-1);
			int t = c - '0';
			int d;
			if(Character.isDigit(score.charAt(i)) == false)
			{
				d = 1;
			}
			else
			{
				d = 2;
				i++;
			}
			Note n = new Note(c, d);
			notes.add(n);
		}
	}

	void printScores()
	{
		for(int i =0; i < notes.size(); i++)
		{
			System.out.print(notes.get(i) + "\n");
		}
	}


	void drawNotes()
	{
	}
}
