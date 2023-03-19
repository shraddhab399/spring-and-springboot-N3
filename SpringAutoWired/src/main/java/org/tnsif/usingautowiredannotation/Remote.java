package org.tnsif.usingautowiredannotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Remote {
	
	//DI in the form of objects
	private Cell cell;

	//DI using setters
	/*To acheive autowiring using setters , usw @Autowired annotation*/
	@Autowired
	/*When you have created multiple bean then if you want to access 
	 * particular one then use @Qualifier annotation*/
	@Qualifier("c2")
	public void setCell(Cell cell) {
		this.cell = cell;
	}

	//default constructor
	public Remote() 
	{
		System.out.println("Default constructor for Remote");
	}
	
	//injecting the object of Cell class
	public void remote() {
		cell.power();
	}
	

}