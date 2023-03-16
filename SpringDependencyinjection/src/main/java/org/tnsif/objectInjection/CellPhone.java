package org.tnsif.objectInjection;

public class CellPhone {
	//DI in the form of object
	Charger charger;
//setters
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	//injection the object of charger class
	public void accept() {
		charger.power();
	}
	

}
