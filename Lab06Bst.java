// Lab06Bst.java
// This is the student, starting version of Lab06B which is divided into 8 cells.
// The first cell -- "Draw Random Points" -- is provided as an example.
// Students need to complete the other 7 cells on their own.


import java.awt.*;
import java.applet.*;


public class Lab06Bst extends Applet
{
	public void paint(Graphics g)
	{
		// Draw Grid
		Expo.drawLine(g,250,0,250,650);
		Expo.drawLine(g,500,0,500,650);
		Expo.drawLine(g,750,0,750,650);
		Expo.drawLine(g,0,325,1000,325);

		// Draw 10,000 Random Points
		for (int count = 1; count <= 10000; count++)
		{
			Expo.setRandomColor(g);
			int x = Expo.random(5,245);
			int y = Expo.random(5,320);
			Expo.drawPoint(g,x,y);
		}


		// Draw 1000 Random Lines
		for ( int count = 1; count <=1000; count++)
		{
		  Expo.setRandomColor(g);
		  int x1 =  Expo.random(250,500);
		  int y1 = Expo.random(5,325);
		  int x2 = Expo.random(250,500);
		  int y2 = Expo.random(5,325);
		  Expo.drawLine(g,x1,y1,x2,y2);
		    
		    
		    
		  }

		// Draw 1000 Random Rectangles
		for ( int count = 1; count <= 1000; count++)
		{
		    Expo.setRandomColor(g);
		    int x1 = Expo.random(500,750);
		    int y1 = Expo.random(5,325);
		    int x2 = Expo.random(500,750);
		    int y2 = Expo.random(5,325);
		    Expo.fillRectangle(g,x1,y1,x2,y2);
		    
		  }   

		// Draw 500 Random Triangles
		for (int count = 1; count <= 500; count++)
		{
		    Expo.setRandomColor(g);
		    int x1 = Expo.random(750,1000);
		    int y1 = Expo.random(5,325);
		    int x2 = Expo.random(750,1000);
		    int y2 = Expo.random(5,325);
		    int x3 = Expo.random(750,1000);
		    int y3 = Expo.random(5,325);
		    Expo.fillPolygon(g,x1,y1,x2,y2,x3,y3);
		 }

		// Draw 100 Random Initials
		//for (int count = 1; count <= 100; count++)
		
		    //Expo.setRandomlColor(g);//
		    
		    
		 
		// Draw 500 Random Stars with a constant radius of 30 and a random # of points
		for (int count = 1; count <= 500; count++)
		{
		    Expo.setRandomColor(g);
		    int x1 = Expo.random(270,480);
		    int y1 = Expo.random(335,630);
		    int radius = Expo.random(1,20);
		    int points =Expo.random(5,8);
		    Expo.fillStar(g,x1,y1,radius,points); 
		 }   
		// Draw 1000 Random Circles with random radii
		for (int count = 1; count <= 1000; count++)
		{
		    Expo.setRandomColor(g);
		    int x1 = Expo.random(535,725);
		    int y1 = Expo.random(375,625);
		    int radius = Expo.random(1,35);
		    Expo.fillCircle(g,x1,y1,radius);
		}
		// Draw 250 Random Arcs with 2 random radii, random start and random finish






	}

}




