package de.game.pong.builder;

import de.game.pong.view.AbstractView;

public abstract class InteractiveComponent {
	public abstract void update();
	protected AbstractView[] views; 
	
	public void draw() {
		for (AbstractView view : views) {
			view.draw(); 
		}
	}
}
