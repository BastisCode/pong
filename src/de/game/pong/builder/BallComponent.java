package de.game.pong.builder;

import de.game.pong.controller.BallController;
import de.game.pong.model.BallModel;
import de.game.pong.view.AbstractView;
import de.game.pong.view.BallView;
import processing.core.PApplet;

public class BallComponent extends InteractiveComponent {

	BallController ballController;
	BallModel ballModel;

	@Override
	public void update() {
		this.ballController.handleEvent();
	}

	protected void buildModel(PApplet applet, int posX, int posY) {
		this.ballModel = new BallModel(applet, posX, posY);
	}

	protected void buildView(PApplet applet) {
		views = new AbstractView[1];
		this.views[0] = new BallView(applet, ballModel);
	}

	protected void buildController() {
		this.ballController = new BallController(ballModel);
	}

}
