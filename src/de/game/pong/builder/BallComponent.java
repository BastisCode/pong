package de.game.pong.builder;

import de.game.pong.controller.BallController;
import de.game.pong.model.BallModel;
import de.game.pong.view.AbstractView;
import de.game.pong.view.BallView;
import processing.core.PApplet;

public class BallComponent extends InteractiveComponent implements Collideable {

	BallController ballController;
	BallModel ballModel;

	@Override
	public void updateAndDraw() {
		this.ballController.update();
		this.draw();
	}

	@Override
	public void handleEvent() {
	}

	@Override
	public int[] getStats() {
		int[] stats = { ballModel.getPosX(), ballModel.getPosY(), ballModel.getRadius() };
		return stats;
	}

	public void changeDirection(int collisionIndicator) {
		if (collisionIndicator == 1) {
			this.ballController.changeDirY();
		} else if (collisionIndicator == 2) {
			this.ballController.changeDirX();
		}
	}

	protected void buildModel() {
		this.ballModel = new BallModel();
	}

	protected void buildView(PApplet applet, int posX, int posY) {
		views = new AbstractView[1];
		this.views[0] = new BallView(applet, ballModel);
		ballModel.setDisplayWidth(applet.displayWidth);
		ballModel.setDisplayHeight(applet.displayHeight);
		ballModel.setRadius(applet.displayWidth / 100);
		ballModel.setPosX(posX);
		ballModel.setPosY(posY);
	}

	protected void buildController() {
		this.ballController = new BallController(ballModel);
	}
}
