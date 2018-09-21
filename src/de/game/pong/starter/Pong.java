package de.game.pong.starter;

import java.util.ArrayList;
import java.util.List;

import de.game.pong.builder.BallComponent;
import de.game.pong.builder.BrickComponent;
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
	private ArrayList<BrickComponent> bricks;
	private List<BrickComponent> bricksToRemove;

	@Override
	public void settings() {
		fullScreen();
		smooth();
	}

	@Override
	public void setup() { // setup() runs once
		background(0);
		noStroke();
		frameRate(30);

		// Set initial values for the game elements
		paddleDistFromBottom = displayHeight / 20;

		// build all necessary components
		this.scoreCounter = (CounterComponent) InteractiveComponentBuilder.create(this,
				InteractiveComponentBuilder.COUNTER, displayWidth - 200, 40);
		this.ball = (BallComponent) InteractiveComponentBuilder.create(this, InteractiveComponentBuilder.BALL,
				displayWidth / 2, displayHeight / 2);
		this.paddle = (PaddleComponent) InteractiveComponentBuilder.create(this, InteractiveComponentBuilder.PADDLE,
				displayWidth / 2 - paddleWidth, displayHeight - paddleDistFromBottom);
		this.bricks = new ArrayList<>(10);
		for (int i = 0; i < 10; i++) {
			this.bricks.add((BrickComponent) InteractiveComponentBuilder.create(this, InteractiveComponentBuilder.BRICK,
					displayWidth / 10 * i + displayWidth / 10 / 2, displayHeight / 10));
		}
		this.bricksToRemove = new ArrayList<>();
	}

	@Override
	public void draw() { // draw() loops forever, until stopped
		background(40);
		if (Helper.checkCollision(this.ball, this.paddle) > 0) {
			this.ball.changeDirection(Helper.checkCollision(this.ball, this.paddle));
			this.scoreCounter.handleEvent();
		}
		this.scoreCounter.updateAndDraw();
		this.bricksToRemove.clear();
		for (BrickComponent brick : this.bricks) {
			if (Helper.checkCollision(this.ball, brick) > 0) {
				this.ball.changeDirection(Helper.checkCollision(this.ball, brick));
				this.scoreCounter.handleEvent();
				this.bricksToRemove.add(brick);
			}
		}
		this.bricks.removeAll(this.bricksToRemove);
		for (BrickComponent brick : this.bricks) {
			brick.updateAndDraw();
		}
		this.paddle.updateAndDraw();
		this.ball.updateAndDraw();
	}

	@Override
	public void mouseClicked() {
	}

	@Override
	public void keyPressed() {
		if (keyCode == 37) {
			this.paddle.moveLeft();
		}
		if (keyCode == 39) {
			this.paddle.moveRight();
		}
	}
}
