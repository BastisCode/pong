package de.game.pong.view;

import de.game.pong.model.BallModel;
import processing.core.PApplet;

public class BallView extends AbstractView {

	BallModel ballModel;

	public BallView(PApplet display, BallModel ballModel) {
		super(display);
		this.ballModel = ballModel;
	}

	@Override
	public void draw() {
		display.ellipse(ballModel.getPosX(), ballModel.getPosY(), ballModel.getRadius() * 2, ballModel.getRadius() * 2);
	}

}
