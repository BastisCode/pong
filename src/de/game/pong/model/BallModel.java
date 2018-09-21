package de.game.pong.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BallModel {

	private static final Logger LOGGER = LogManager.getLogger();

	private int displayWidth;
	private int posX;
	private int posY;
	private int dirX;
	private int dirY;
	private int radius;

	BallModel(int initialDirX, int initialDirY) {
		this.dirX = initialDirX;
		this.dirY = initialDirY;
	}

	public BallModel() {
		this(5, -2);
	}

	public void calcBall() {
		if (posX < radius || posX > displayWidth - radius) {
			this.dirX = this.dirX * -1;
			LOGGER.debug("ball hits wall");
		}
		if (posY < radius) {
			this.dirY = this.dirY * -1;
			LOGGER.debug("ball hits top");
		}
		this.posX = this.posX + this.dirX;
		this.posY = this.posY + this.dirY;
	}

	public int getDirX() {
		return dirX;
	}

	public void setDirX(int dirX) {
		this.dirX = dirX;
	}

	public int getDirY() {
		return dirY;
	}

	public void setDirY(int dirY) {
		this.dirY = dirY;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getRadius() {
		return radius;
	}

	public void setDisplayWidth(int displayWidth) {
		this.displayWidth = displayWidth;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void changeDirX() {
		this.dirX *= -1;
	}

	public void changeDirY() {
		this.dirY *= -1;
	}
}
