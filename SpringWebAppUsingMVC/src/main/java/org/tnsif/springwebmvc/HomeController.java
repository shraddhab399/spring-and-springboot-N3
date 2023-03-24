package org.tnsif.springwebmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//to connect the tomcat server to web application
@Controller
public class HomeController {

	@RequestMapping("/home")//requesting
	public String home() {
		System.out.println("code to demonstrate the eb application using MVC");
		return"home.jsp";
		
	}

}
