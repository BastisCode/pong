package de.game.pong.builder;

import de.game.pong.controller.PaddleController;
import de.game.pong.model.PaddleModel;
import de.game.pong.view.AbstractView;
import de.game.pong.view.PaddleView;
import processing.core.PApplet;

public class PaddleComponent extends InteractiveComponent {

	PaddleModel paddleModel;
	PaddleController paddleController;

	@Override
	public void update() {
		this.paddleController.handleEvent();
	}

	protected void buildModel() {
		this.paddleModel = new PaddleModel();
	}

	protected void buildView(PApplet applet, int posX, int posY) {
		views = new AbstractView[1];
		this.views[0] = new PaddleView(applet, paddleModel, posX, posY);
	}

	protected void buildController() {
		this.paddleController = new PaddleController(paddleModel);
	}

}
