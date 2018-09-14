package de.game.pong.view;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.game.pong.model.CounterModel;
import processing.core.PApplet;
import processing.core.PFont;

public class CounterView extends AbstractView {

	private static final Logger LOGGER = LogManager.getLogger();

	private CounterModel counterModel;
	private int posX;
	private int posY;
	private PFont font;

	public CounterView(PApplet display, CounterModel counterModel, int posX, int posY) {
		super(display);
		this.counterModel = counterModel;
		this.posX = posX;
		this.posY = posY;

		// Setup to display counter
		this.font = display.createFont("Arial", 16, true);
		display.textFont(this.font, 32);
	}

	@Override
	public void draw() {
		display.text("Punkte: " + this.counterModel.getCount(), this.posX, this.posY);
		// LOGGER.debug(String.format("\n\t Position: \n\t x -> %s, \n\t y -> %s", this.posX, this.posY));
	}

}
