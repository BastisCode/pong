package de.game.pong.builder;

import processing.core.PApplet;

public class BallComponentBuilder implements Builder {

	private BallComponent ballComponent;
	private int posX;
	private int posY;

	public BallComponentBuilder(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

	@Override
	public void buildComponent() {
		this.ballComponent = new BallComponent();
	}

	@Override
	public void buildModel() {
		this.ballComponent.buildModel();
	}

	@Override
	public void buildView(PApplet applet) {
		this.ballComponent.buildView(applet, posX, posY);
	}

	@Override
	public void buildController() {
		this.ballComponent.buildController();
	}

	@Override
	public InteractiveComponent getComponent() {
		return ballComponent;
	}

}
