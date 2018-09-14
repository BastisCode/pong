package de.game.pong.starter;

import de.game.pong.builder.CounterComponentBuilder;
import de.game.pong.builder.BallComponent;
import de.game.pong.builder.CounterComponent;
import de.game.pong.builder.InteractiveComponentBuilder;
import processing.core.PApplet;

public class Pong extends PApplet {

	private int ballRadius;
	private int paddleWidth;
	private int paddleHeight;
	private int paddleDistFromBottom;

	private CounterComponent scoreCounter;
	private BallComponent ball;

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
		paddleHeight = displayHeight / 20;
		paddleWidth = displayWidth / 10;
		paddleDistFromBottom = displayHeight / 20;

		// build all necessary components
		// counter for counting the score
		this.scoreCounter = (CounterComponent) InteractiveComponentBuilder.create(this,
				InteractiveComponentBuilder.COUNTER, displayWidth - 200, 40);
		this.ball = (BallComponent) InteractiveComponentBuilder.create(this, InteractiveComponentBuilder.BALL,
				displayWidth / 2, displayHeight / 2);
	}

	@Override
	public void draw() { // draw() loops forever, until stopped
		background(70);
		this.ball.update();
		this.ball.draw();
		this.scoreCounter.draw();
	}

	@Override
	public void mouseClicked() {
		this.scoreCounter.update();
	}

}
