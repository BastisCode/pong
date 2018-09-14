package de.game.pong.builder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import processing.core.PApplet;

public class CounterComponentBuilder implements Builder {

	private static final Logger LOGGER = LogManager.getLogger();

	private CounterComponent counterComponent;
	private int posX;
	private int posY;

	public CounterComponentBuilder(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

	@Override
	public void buildComponent() {
		this.counterComponent = new CounterComponent();
	}

	@Override
	public void buildModel() {
		this.counterComponent.buildModel();
	}

	@Override
	public void buildView(PApplet applet) {
		this.counterComponent.buildView(applet, this.posX, this.posY);
	}

	@Override
	public void buildController() {
		this.counterComponent.buildController();
	}

	@Override
	public InteractiveComponent getComponent() {
		return this.counterComponent;
	}

}
