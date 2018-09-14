package de.game.pong.controller;

import de.game.pong.model.CounterModel;

public class CounterController implements Controller{
	
	CounterModel counterModel;
	
	public CounterController(CounterModel counterModel) {
		this.counterModel = counterModel;
	}
	
	@Override
	public void handleEvent() {
		this.counterModel.updateCount(1);
	}

}
