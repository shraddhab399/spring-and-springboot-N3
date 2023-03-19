package org.tnsif.autowiredexample;

public class Pen {
	//DI in the form of object
	Ink i;
/*//DI using setters
	public void setI(Ink i) {
		this.i = i;
	}*/
	public void accept() {
		i.write();
	}
	public Pen(Ink i) {
		super();
		System.out.println("Autowire using constructor");
		this.i = i;
	}
	

}
