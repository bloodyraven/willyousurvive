package models;

import java.util.Observable;

public class LifeModel extends Observable {
	
	private int vie;
	
	public LifeModel() {
		vie=100;
	}
	
	public void setVie(int vie) {
		this.vie=vie;
		setChanged();
		notifyObservers();
	}

	public int getVie() {
		return vie;
	}
	
}
