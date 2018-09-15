package de.game.pong.starter;

import de.game.pong.builder.BallComponent;
import de.game.pong.builder.CounterComponent;
import de.game.pong.builder.InteractiveComponentBuilder;
import de.game.pong.builder.PaddleComponent;
import de.game.pong.helper.Helper;
import processing.core.PApplet;

public class Pong extends PApplet {

	private int paddleWidth;
	private int paddleDistFromBottom;

	private CounterComponent scoreCounter;
	private BallComponent ball;
	private PaddleComponent paddle;
	private PaddleComponent paddle2;

	@Override
	public void settings() {
		fullScreen();
		smooth();
	}

	@Override
	public void setup() { // setup() runs once
		background(0);
		noStroke();
		frameRate(60);

		// Set initial values for the game elements
		paddleDistFromBottom = displayHeight / 20;

		// build all necessary components
		// counter for counting the score
		this.scoreCounter = (CounterComponent) InteractiveComponentBuilder.create(this,
				InteractiveComponentBuilder.COUNTER, displayWidth - 200, 40);
		this.ball = (BallComponent) InteractiveComponentBuilder.create(this, InteractiveComponentBuilder.BALL,
				displayWidth / 2, displayHeight / 2);
		this.paddle = (PaddleComponent) InteractiveComponentBuilder.create(this, InteractiveComponentBuilder.PADDLE,
				displayWidth / 2 - paddleWidth, displayHeight - paddleDistFromBottom);
		this.paddle2 = (PaddleComponent) InteractiveComponentBuilder.create(this, InteractiveComponentBuilder.PADDLE,
				displayWidth / 2 - paddleWidth, paddleDistFromBottom);
	}

	@Override
	public void draw() { // draw() loops forever, until stopped
		background(40);
		if (Helper.checkCollision(this.ball, this.paddle) > 0) {
			this.ball.changeDirection(Helper.checkCollision(this.ball, this.paddle));
			this.scoreCounter.handleEvent();
		}
		if (Helper.checkCollision(this.ball, this.paddle2) > 0) {
			this.ball.changeDirection(Helper.checkCollision(this.ball, this.paddle2));
			this.scoreCounter.handleEvent();
		}
		this.ball.updateAndDraw();
		this.scoreCounter.updateAndDraw();
		this.paddle.updateAndDraw();
		this.paddle2.updateAndDraw();
	}

	@Override
	public void mouseClicked() {
	}

	@Override
	public void keyPressed() {
		if (keyCode == 37) {
			this.paddle.moveLeft();
			this.paddle2.moveLeft();
		}
		if (keyCode == 39) {
			this.paddle.moveRight();
			this.paddle2.moveRight();
		}
	}
}
