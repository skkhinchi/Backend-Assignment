package com.sumit.demo.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.sumit.demo.Services.UserService;
import com.sumit.demo.model.User;


@Controller
public class RestController 
{		@Autowired
		private  UserService userService; 


		
		
		@RequestMapping("/")		
		public String welcome(HttpServletRequest request)
		{	
			request.setAttribute("mode","MODE_HOME");
			return "welcomepage";
		}
		
		@GetMapping("/saveuser") 
		public String saveUser(@RequestParam String username,@RequestParam String firstname,@RequestParam String lastname, @RequestParam int age,@RequestParam String password)
		{	
			User user=new User(username,firstname,lastname,age,password);
			
			userService.saveMyUser(user); 
			return "User Saved";
		}
		
	
		
		
		
}
