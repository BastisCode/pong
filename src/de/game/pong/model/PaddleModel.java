package de.game.pong.model;

public class PaddleModel {

	private int posX;
	private int posY;
	private int changeX;
	private int paddleWidth;
	private int paddleHeight;
	private int displayWidth;
	private int displayHeight;

	public void setPaddleWidth(int paddleWidth) {
		this.paddleWidth = paddleWidth;
	}

	public void setPaddleHeight(int paddleHeight) {
		this.paddleHeight = paddleHeight;
	}

	public void setDisplayWidth(int displayWidth) {
		this.displayWidth = displayWidth;
	}

	public void setDisplayHeight(int displayHeight) {
		this.displayHeight = displayHeight;
	}

	public PaddleModel(int initialChangeX) {
		this.changeX = initialChangeX;
	}

	public PaddleModel() {
		this(20);
	}

	public void moveRight() {
		if (posX + paddleWidth / 2 < displayWidth) {
			posX += changeX;
		}
	}

	public void moveLeft() {
		if (posX > paddleWidth / 2) {
			posX -= changeX;
		}
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

	public int getPaddleWidth() {
		return paddleWidth;
	}

	public int getPaddleHeight() {
		return paddleHeight;
	}
}
