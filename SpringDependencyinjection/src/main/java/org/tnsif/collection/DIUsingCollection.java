package org.tnsif.collection;
//program to demonstrate on DI in the form of collection.
//Driver class
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingCollection {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("collect.xml");
		CollectionDemo d=c.getBean("collection",CollectionDemo.class);
		d.display();

	}

}
