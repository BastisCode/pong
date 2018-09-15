package de.game.pong.controller;

import de.game.pong.model.BallModel;

public class BallController implements Controller {

	BallModel ballModel;

	public BallController(BallModel ballModel) {
		this.ballModel = ballModel;
	}

	@Override
	public void handleEvent() {
	}

	@Override
	public void update() {
		this.ballModel.calcBall();
	}

	public void changeDirX() {
		this.ballModel.changeDirX();
	}

	public void changeDirY() {
		this.ballModel.changeDirY();
	}

}
