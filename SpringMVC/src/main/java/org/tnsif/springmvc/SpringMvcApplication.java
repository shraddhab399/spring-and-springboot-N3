package org.tnsif.springmvc;
//@configuration:-
//instead of using multipkle beans files we ause autoconfigiration
//@EnableAutoconfiguration:- for enable it we use 
//@Component:-it used to denote that the class is  component.
//@ComponentScan:- Sacn the project for spring component annoted with @Service, @repository.


import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringMvcApplication.class, args);
		Scanner sc=new Scanner(System.in);
//		Employee e=context.getBean(Employee.class);
//		e.setEmpid(123445);
//		e.setEmname("Siddhika Ghule");
//		e.print();
		HomeController h=context.getBean(HomeController.class);
		h.home();
	}

}