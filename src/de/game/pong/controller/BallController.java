package de.game.pong.controller;

import de.game.pong.model.BallModel;

public class BallController implements Controller {

	BallModel ballModel;

	public BallController(BallModel ballModel) {
		this.ballModel = ballModel;
	}

	@Override
	public void handleEvent() {
		this.ballModel.calcBall();
	}

}
