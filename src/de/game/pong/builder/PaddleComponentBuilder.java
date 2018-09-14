package de.game.pong.builder;

import processing.core.PApplet;

public class PaddleComponentBuilder implements Builder {

	private PaddleComponent paddleComponent;
	private int posX;
	private int posY;

	public PaddleComponentBuilder(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

	@Override
	public void buildComponent() {
		this.paddleComponent = new PaddleComponent();
	}

	@Override
	public void buildModel() {
		this.paddleComponent.buildModel();
	}

	@Override
	public void buildView(PApplet applet) {
		this.paddleComponent.buildView(applet, posX, posY);
	}

	@Override
	public void buildController() {
		this.paddleComponent.buildController();
	}

	@Override
	public InteractiveComponent getComponent() {
		return paddleComponent;
	}

}
