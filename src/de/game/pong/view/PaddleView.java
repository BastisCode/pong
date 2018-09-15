package de.game.pong.view;

import de.game.pong.model.PaddleModel;
import processing.core.PApplet;

public class PaddleView extends AbstractView {

	private PaddleModel paddleModel;

	public PaddleView(PApplet display, PaddleModel paddleModel) {
		super(display);
		this.paddleModel = paddleModel;
	}

	@Override
	public void draw() {
		display.rect(paddleModel.getPosX() - paddleModel.getPaddleWidth() / 2,
				paddleModel.getPosY() - paddleModel.getPaddleHeight() / 2, paddleModel.getPaddleWidth(),
				paddleModel.getPaddleHeight());
	}

}
