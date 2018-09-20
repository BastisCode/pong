package de.game.pong.view;

import de.game.pong.model.BrickModel;
import processing.core.PApplet;

public class BrickView extends AbstractView {

	private BrickModel brickModel;

	public BrickView(PApplet display, BrickModel brickModel) {
		super(display);
		this.brickModel = brickModel;
	}

	@Override
	public void draw() {
		display.rect(brickModel.getPosX() - brickModel.getBrickWidth() / 2,
				brickModel.getPosY() - brickModel.getBrickHeight() / 2, brickModel.getBrickWidth(),
				brickModel.getBrickHeight());
	}

}
