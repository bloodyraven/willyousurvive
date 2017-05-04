package models;

import java.util.Observable;

public class HungryModel extends Observable {
	
	private int hungry;

	public HungryModel() {
		setHungry(100);
	}

	public int getHungry() {
		return hungry;
	}

	public void setHungry(int hungry) {
		this.hungry = hungry;
		setChanged();
		notifyObservers();
	}
}
