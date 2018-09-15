package de.game.pong.builder;

import de.game.pong.controller.PaddleController;
import de.game.pong.model.PaddleModel;
import de.game.pong.view.AbstractView;
import de.game.pong.view.PaddleView;
import processing.core.PApplet;

public class PaddleComponent extends InteractiveComponent implements HorizontallyMovable, Collideable {

	PaddleModel paddleModel;
	PaddleController paddleController;

	@Override
	public void updateAndDraw() {
		this.paddleController.update();
		this.draw();
	}

	@Override
	public void handleEvent() {
	}

	@Override
	public int[] getStats() {
		int[] stats = { paddleModel.getPosX(), paddleModel.getPosY(), paddleModel.getPaddleWidth(),
				paddleModel.getPaddleHeight() };
		return stats;
	}

	protected void buildModel() {
		this.paddleModel = new PaddleModel();
	}

	protected void buildView(PApplet applet, int posX, int posY) {
		views = new AbstractView[1];
		this.views[0] = new PaddleView(applet, paddleModel);
		paddleModel.setDisplayWidth(applet.displayWidth);
		paddleModel.setDisplayHeight(applet.displayHeight);
		paddleModel.setPosX(posX);
		paddleModel.setPosY(posY);
		paddleModel.setPaddleHeight(applet.displayHeight / 20);
		paddleModel.setPaddleWidth(applet.displayWidth / 5);
	}

	protected void buildController() {
		this.paddleController = new PaddleController(paddleModel);
	}

	@Override
	public void moveLeft() {
		this.paddleController.moveLeft();
	}

	@Override
	public void moveRight() {
		this.paddleController.moveRight();
	}
}
