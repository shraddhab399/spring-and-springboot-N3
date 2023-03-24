package org.tnsif.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("code to demonstrate on simple"+"web application");
		return"home.jsp";
		
	}
	

}
