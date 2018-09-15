package de.game.pong.controller;

import de.game.pong.model.PaddleModel;

public class PaddleController implements Controller {

	private PaddleModel paddleModel;

	public PaddleController(PaddleModel paddleModel) {
		this.paddleModel = paddleModel;
	}

	@Override
	public void handleEvent() {

	}

	@Override
	public void update() {

	}

	public void moveRight() {
		this.paddleModel.moveRight();
	}

	public void moveLeft() {
		this.paddleModel.moveLeft();
	}

}
