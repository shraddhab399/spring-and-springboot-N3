package org.tnsif.springmvc;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int empid;
	private String emname;
	//getters and seeters
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmname() {
		return emname;
	}
	public void setEmname(String emname) {
		this.emname = emname;
	}
	public void print() {
		System.out.println(" employee are belong top the computer department");
		System.out.println("Emp id:+empid+"+"Employee name:"+emname);
	}

	

}
