package render;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import gameWindow.GameWindow;
import mech.gameCalculate;

public class gameRender extends GameWindow{
	private static Graphics2D g;	
	private static BufferedImage image;
	public static void update() {	
		image  = new BufferedImage(1280, 720, BufferedImage.TYPE_INT_RGB);
		
		g = (Graphics2D) image.getGraphics();
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, 1280, 720);
		g.setColor(Color.GREEN);
		
	
		drawBoard.paint(g);
		//DRAW IMAGES OF STUFF HERE
		VRR.ping();
	}
	
	public static void draw() {
		Graphics g2  = drawBoard.getGraphics();
		g2.drawImage(image, 0, 0, null);
		switch(gameCalculate.status) {
		case MENU:
			g2.setColor(Color.RED);
			g2.drawString("EHLS", 50, 400);
			g2.drawString(VRR.listOfTimes.toString(), 50, 50);
			break;
		default:
		System.out.println("HAHA DISREGARD THAT I SUCK COCKS");
			break;
		}
		
	}
}

