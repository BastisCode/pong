package de.game.pong.builder;

import processing.core.PApplet;

public class InteractiveComponentBuilder {

	public static final String COUNTER = "counter";
	public static final String BALL = "ball";
	public static final String PADDLE = "paddle";

	public static InteractiveComponent create(PApplet applet, String type, int posX, int posY) {
		Builder builder = null;
		if (type.equals(COUNTER)) {
			builder = new CounterComponentBuilder(posX, posY);
		} else if (type.equals(BALL)) {
			builder = new BallComponentBuilder(posX, posY);
		} else if (type.equals(PADDLE)) {
			builder = new PaddleComponentBuilder(posX, posY);
		}
		return buildComponent(builder, applet);
	}

	private static InteractiveComponent buildComponent(Builder builder, PApplet applet) {
		builder.buildComponent();
		builder.buildModel();
		builder.buildView(applet);
		builder.buildController();
		return builder.getComponent();
	}
}
