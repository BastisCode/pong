package de.game.pong.model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import processing.core.PApplet;

public class BallModel {

	private static final Logger LOGGER = LogManager.getLogger();

	private PApplet applet;
	private int posX;
	private int posY;
	private int dirX;
	private int dirY;
	private int radius;

	BallModel(PApplet applet, int initialPosX, int initialPosY, int initialDirX, int initialDirY, int radius) {
		this.applet = applet;
		this.posX = initialPosX;
		this.posY = initialPosY;
		this.dirX = initialDirX;
		this.dirY = initialDirY;
		this.radius = radius;
	}

	public BallModel(PApplet applet, int initialPosX, int initialPosY) {
		this(applet, initialPosX, initialPosY, 5, 0, applet.displayWidth / 100);
	}

	public void calcBall() {
		if (posX < radius || posX > applet.displayWidth - radius) {
			this.dirX = this.dirX * -1;
			LOGGER.debug("ball hits wall");
		}
		if (posY > applet.displayHeight - radius) {
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

	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getRadius() {
		return radius;
	}
}
