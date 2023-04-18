package enit.pfa.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import enit.pfa.entities.User;
import enit.pfa.entities.loginrequest;
import enit.pfa.service.userservice;
import jakarta.servlet.http.HttpSession;
@RestController
@RequestMapping("/login")
@CrossOrigin("*")
public class usercontroller {
	 @Autowired
	    private userservice userService;

	   /* @GetMapping("/login")
	    public String showLoginForm() {
	        return "login";
	    }*/

	  
	    @PostMapping("")
	
	    public String processLogin(@RequestBody Map<String, String> credentials, HttpSession session) {
	        String username = credentials.get("username");
	        String password = credentials.get("password");

	        if (userService.authenticate(username, password)) {
	            User user = userService.findByUsername(username);
	            session.setAttribute("user", user);

	            if ("admin".equals(user.getRole())) {
	                return "redirect:/bug-list";
	            } else if ("staff".equals(user.getRole())) {
	                return "redirect:/get-staff";
	            }
	        }

	        return "login_error";
	    }


	}

