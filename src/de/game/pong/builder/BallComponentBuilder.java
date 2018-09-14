package de.game.pong.builder;

import processing.core.PApplet;

public class BallComponentBuilder implements Builder {

	private BallComponent ballComponent;
	private int posX;
	private int posY;
	private PApplet applet;

	public BallComponentBuilder(int posX, int posY, PApplet applet) {
		this.posX = posX;
		this.posY = posY;
		this.applet = applet;
	}

	@Override
	public void buildComponent() {
		this.ballComponent = new BallComponent();
	}

	@Override
	public void buildModel() {
		this.ballComponent.buildModel(this.applet, posX, posY);
	}

	@Override
	public void buildView(PApplet applet) {
		this.ballComponent.buildView(applet);
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
