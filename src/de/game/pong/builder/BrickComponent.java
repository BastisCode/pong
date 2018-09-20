package de.game.pong.builder;

import de.game.pong.controller.BrickController;
import de.game.pong.model.BrickModel;
import de.game.pong.view.AbstractView;
import de.game.pong.view.BrickView;
import processing.core.PApplet;

public class BrickComponent extends InteractiveComponent implements Collideable {

	BrickController brickController;
	BrickModel brickModel;

	@Override
	public int[] getStats() {
		int[] stats = { brickModel.getPosX(), brickModel.getPosY(), brickModel.getBrickWidth(),
				brickModel.getBrickHeight() };
		return stats;
	}

	@Override
	public void updateAndDraw() {
		this.brickController.update();
		this.draw();
	}

	@Override
	public void handleEvent() {

	}

	protected void buildModel() {
		this.brickModel = new BrickModel();
	}

	protected void buildView(PApplet applet, int posX, int posY) {
		this.views = new AbstractView[1];
		this.views[0] = new BrickView(applet, brickModel);
		brickModel.setPosX(posX);
		brickModel.setPosY(posY);
		brickModel.setBrickWidth(applet.displayWidth / 12);
		brickModel.setBrickHeight(applet.displayHeight / 20);
	}

	protected void buildController() {
		this.brickController = new BrickController(brickModel);
	}

}
