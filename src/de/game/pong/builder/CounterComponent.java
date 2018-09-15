package de.game.pong.builder;

import de.game.pong.controller.CounterController;
import de.game.pong.model.CounterModel;
import de.game.pong.view.AbstractView;
import de.game.pong.view.CounterView;
import processing.core.PApplet;

public class CounterComponent extends InteractiveComponent {

	CounterModel counterModel;
	CounterController counterController;

	@Override
	public void updateAndDraw() {
		this.counterController.update();
		this.draw();
	}

	@Override
	public void handleEvent() {
		this.counterController.handleEvent();
	}

	protected void buildModel() {
		this.counterModel = new CounterModel();
	}

	protected void buildView(PApplet applet, int posX, int posY) {
		views = new AbstractView[1];
		this.views[0] = new CounterView(applet, counterModel, posX, posY);
	}

	protected void buildController() {
		this.counterController = new CounterController(counterModel);
	}

}
