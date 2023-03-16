package org.tnsif.literals;

public class SwiftEngine implements IEngine {
	 private String company;
	 private double cost;
	public double cost() {
	return cost;
	
	}
	public String display() {
		return "japan";
		
	}
//	//setters and getters
//	public String getCompany() {
//		return company;
//	}
	public void setCompany(String company) {
		this.company = company;
	}
//	public double getCost() {
//		return cost;
//	}
	public void setCost(double cost) {	
		this.cost = cost;
	}
	@Override
	public String toString() {
		return  " origin of companhy:"+company+fuel;
	}
	
	
	

}
