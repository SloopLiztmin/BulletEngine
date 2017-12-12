package gameWindow.Entities;

import java.awt.Color;

class targetedBullet extends Bullet{
	
	/**
	 * @param xLocation
	 * Starting XLocation of the targeted bullet.
	 * @param yLocation
	 * Starting YLocation of the targeted bullet.
	 * @param angle
	 * Angle that the bullet is fired at.
	 * @param speed
	 * Speed that the bullet moves in pixels
	 * @param size
	 * Size of bullet in pixels
	 * @param hostile
	 * Whether or not the bullet can hurt players
	 * @param color
	 * The color that the bullet is drawn with
	 */
	public targetedBullet(double xLocation, double yLocation, double angle, double speed, int size,
			boolean hostile, Color color) {
		super(xLocation, yLocation, 0, 0, speed, size, hostile, color);
		this.angle = angle;
	}
	 
	/**
	 * Moves the bullet based on the angle that it needs to take to get to target location at the instant that it was fired.
	 */
	@Override
	public void update() {
		double rad = Math.toRadians(this.angle);
		this.xLocation -= .5 * Math.cos(rad) * this.getSpeed();
		this.yLocation -= .5 * Math.sin(rad)  * this.getSpeed();
	}
}