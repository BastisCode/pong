package de.game.pong.starter;

import processing.core.PApplet;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;

import org.apache.logging.log4j.LogManager;

public class Main {

	private static final Logger LOGGER = LogManager.getLogger();

	public static void main(String[] args) {
		PApplet.main(new String[] { Pong.class.getName() });
		LOGGER.debug(String.format("Applet started: %s", LocalDateTime.now()));
	}

}
