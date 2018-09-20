package de.game.pong.builder;

import processing.core.PApplet;

public class BrickComponentBuilder implements Builder {

	BrickComponent brickComponent;
	private int posX;
	private int posY;

	public BrickComponentBuilder(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

	@Override
	public void buildComponent() {
		this.brickComponent = new BrickComponent();
	}

	@Override
	public void buildModel() {
		this.brickComponent.buildModel();
	}

	@Override
	public void buildView(PApplet applet) {
		this.brickComponent.buildView(applet, this.posX, this.posY);
	}

	@Override
	public void buildController() {
		this.brickComponent.buildController();
	}

	@Override
	public InteractiveComponent getComponent() {
		return brickComponent;
	}

}
