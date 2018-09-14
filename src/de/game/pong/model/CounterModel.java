package de.game.pong.model;

public class CounterModel {
	private int count;

	CounterModel(int intitialCount) {
		this.count = intitialCount;
	}

	public CounterModel() {
		this(0);
	}

	public void updateCount(int value) {
		this.count += value;
	}

	public int getCount() {
		return this.count;
	}
}
