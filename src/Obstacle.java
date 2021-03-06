//Connie Yu
//Ms.Strelkovska
//ICS4U1-01
//11/21/14
//Game Obstacles

import java.awt.*;
import javax.swing.*;

public class Obstacle extends Background{
	
	ImageIcon obstacle1;
	int sizeX, sizeY;
	
	public Obstacle(){
		obstacle1 = new ImageIcon("Obstacle1.gif");			
	}
	
	public void draw(Graphics g){
		if(dx==0){
			sizeX = (int)(Math.random()*100)+200;
			sizeY = (int)(Math.random()*100)+300;
		}
		g.drawImage(obstacle1.getImage(), 1200-150+dx, 300, sizeX,sizeY,null);
	}
	
	public Rectangle getRect(){
		 return new Rectangle(1200-150+dx, 300, 150, 400);
	}
	
}