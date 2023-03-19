package org.tnsif.autowiredexample;
//Program to demonstrate on autowire concept
//driver class
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	public static void main(String[] args) {
		ApplicationContext c= new ClassPathXmlApplicationContext("beans.xml");
	    Pen p=c.getBean("pen",Pen.class);
	    p.accept();
		

	}

}
