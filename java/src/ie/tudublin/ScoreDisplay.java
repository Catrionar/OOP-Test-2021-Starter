package ie.tudublin;

import java.util.ArrayList;

import javax.lang.model.util.ElementScanner14;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	//String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

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
		colorMode(RGB);
		loadScore();
		printScores();
	}

	public void draw()
	{
		background(255);
		stroke(0);
		fill(0);
		strokeWeight(3);
		drawStave();
		drawNotes();
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
		for(int i = 0; i < notes.size(); i++)
		{
			System.out.print(notes.get(i) + "\n");
		}
	}

	void drawStave()
	{
		float border = 0.1f * width;

		for(int i = 0; i < 5; i++)
		{
			float y = map(i, 0, 5, border, height - (border * 2));
			line(border, y, width - border, y);
		}

		for(int i = 0; i < notes.size(); i++)
		{
			float x = map(i, 0, notes.size(), border, width - border);
			text(notes.get(i).getNote(), x, border / 2);
		}
		
	}

	float prev = 0.1f * width + 30;

	void drawNotes()
	{
		float border = 0.1f * width;
		int size = 30;
		float w = size / (float) 2;
		float ll = 85 + w;
		int num = 0;
		

		for(int i = 0; i < notes.size(); i++)
		{	
			if(notes.get(i).getNote() == 'D')
			{
				float nx = num;
				float ny = 9;

				float x = map(nx, 0, notes.size(), border, width - border);
				float y = map(ny, 0, 10, border, height - (border * 2));
				
				if(mouseX < x + size && mouseX > prev + size )
				{
					stroke(255, 0, 0);
					fill(255, 0, 0);
				}
				else if(mouseX < x + size && num == 0)
				{
					stroke(255, 0, 0);
					fill(255, 0, 0);
				}
				else
				{
					stroke(0);
					fill(0);
				}

				prev = x;

				circle(x, y , size);
				line(x + w, y, x + w, y - ll);

	
				if(notes.get(i).getType() == "Quaver")
				{
					line(x + w, y - ll, x + (w*2), y  - ll + w);
				}

				
			}
			
			if(notes.get(i).getNote() == 'E')
			{
				float nx = num;
				float ny = 8;

				float x = map(nx, 0, notes.size(), border, width - border);
				float y = map(ny, 0, 10, border, height - (border * 2));

				if(mouseX < x + size && mouseX > prev + size )
				{
					stroke(255, 0, 0);
					fill(255, 0, 0);
				}
				else
				{
					stroke(0);
					fill(0);
				}
				prev = x;

				circle(x, y , size);
				line(x + w, y, x + w, y - ll);

				if(notes.get(i).getType() == "Quaver")
				{
					line(x + w, y - ll, x + (w*2), y  - ll + w);
				}
			}
			
			if(notes.get(i).getNote() == 'F')
			{
				float nx = num;
				float ny = 7;

				float x = map(nx, 0, notes.size(), border, width - border);
				float y = map(ny, 0, 10, border, height - (border * 2));

				if(mouseX < x + size && mouseX > prev + size )
				{
					stroke(255, 0, 0);
					fill(255, 0, 0);
				}
				else
				{
					stroke(0);
					fill(0);
				}
				prev = x;

				circle(x, y , size);
				line(x + w, y, x + w, y - ll);

				if(notes.get(i).getType() == "Quaver")
				{
					line(x + w, y - ll, x + (w*2), y  - ll + w);
				}

			}
			
			if(notes.get(i).getNote() == 'G')
			{
				float nx = num;
				float ny = 6;

				float x = map(nx, 0, notes.size(), border, width - border);
				float y = map(ny, 0, 10, border, height - (border * 2));

				if(mouseX < x + size && mouseX > prev + size )
				{
					stroke(255, 0, 0);
					fill(255, 0, 0);
				}
				else
				{
					stroke(0);
					fill(0);
				}
				prev = x;

				circle(x, y , size);
				line(x + w, y, x + w, y - ll);

				if(notes.get(i).getType() == "Quaver")
				{
					line(x + w, y - ll, x + (w*2), y  - ll + w);
				}
			}
			
			if(notes.get(i).getNote() == 'A')
			{
				float nx = num;
				float ny = 5;

				float x = map(nx, 0, notes.size(), border, width - border);
				float y = map(ny, 0, 10, border, height - (border * 2));

				if(mouseX < x + size && mouseX > prev + size )
				{
					stroke(255, 0, 0);
					fill(255, 0, 0);
				}
				else
				{
					stroke(0);
					fill(0);
				}
				prev = x;

				circle(x, y , size);
				line(x + w, y, x + w, y - ll);

				if(notes.get(i).getType() == "Quaver")
				{
					line(x + w, y - ll, x + (w*2), y  - ll + w);
				}
			}
			
			if(notes.get(i).getNote() == 'B')
			{
				float nx = num;
				float ny = 4;

				float x = map(nx, 0, notes.size(), border, width - border);
				float y = map(ny, 0, 10, border, height - (border * 2));

				if(mouseX < x + size && mouseX > prev + size )
				{
					stroke(255, 0, 0);
					fill(255, 0, 0);
				}
				else
				{
					stroke(0);
					fill(0);
				}
				prev = x;

				circle(x, y , size);
				line(x + w, y, x + w, y - ll);

				if(notes.get(i).getType() == "Quaver")
				{
					line(x + w, y - ll, x + (w*2), y  - ll + w);
				}
			}
			
			if(notes.get(i).getNote() == 'c')
			{
				float nx = num;
				float ny = 3;

				float x = map(nx, 0, notes.size(), border, width - border);
				float y = map(ny, 0, 10, border, height - (border * 2));

				if(mouseX < x + size && mouseX > prev + size )
				{
					stroke(255, 0, 0);
					fill(255, 0, 0);
				}
				else
				{
					stroke(0);
					fill(0);
				}
				prev = x;

				circle(x, y , size);
				line(x + w, y, x + w, y - ll);

				if(notes.get(i).getType() == "Quaver")
				{
					line(x + w, y - ll, x + (w*2), y  - ll + w);
				}
			}
			
			if(notes.get(i).getNote() == 'd')
			{
				float nx = num;
				float ny = 2;

				float x = map(nx, 0, notes.size(), border, width - border);
				float y = map(ny, 0, 10, border, height - (border * 2));

				if(mouseX < x + size && mouseX > prev + size )
				{
					stroke(255, 0, 0);
					fill(255, 0, 0);
				}
				else
				{
					stroke(0);
					fill(0);
				}
				prev = x;

				circle(x, y , size);
				line(x + w, y, x + w, y - ll);

				if(notes.get(i).getType() == "Quaver")
				{
					line(x + w, y - ll, x + (w*2), y  - ll + w);
				}
			}
			num += 1;
		}
		
	}
}
