package gameWindow.Entities;

import java.awt.Graphics;

import gameWindow.GameWindow;

public class Bullet extends Entity{

	public Bullet(double xLocation, double yLocation, double yDelta, double xDelta, double speed, double angle, int size, boolean hostile) {
		super(xLocation, yLocation, 1, yDelta, xDelta);

		this.acceleration = speed;
		
		if(hostile) {
			this.entityType = eTYPE.HOSTILE;
		}else {
			this.entityType = eTYPE.HARMLESS;
		}
	
		this.angle = angle;
		this.size = size;
		GameWindow.objList.add(this);
			
	}
	
	public void draw(Graphics g) {
		g.fillOval((int)xLocation, (int)yLocation, this.size, this.size);
	}
	
	public void update() {
		this.xLocation += toXVelocity(this.angle, this.acceleration);
		this.yLocation += toYVelocity(this.angle, this.acceleration);
		
		sudoku();
	}

}
