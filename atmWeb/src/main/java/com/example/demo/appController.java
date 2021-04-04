package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class appController {
	
	@Autowired
	private userRepo repo;
	
	
	@GetMapping("/home")
	public String viewHome() {
			return "home";
		}
	
	@GetMapping("/register")
	public String registerForm(Model model) {
		model.addAttribute("user", new User());
			return "register";
		}
	
	@GetMapping("/news")
	public String newsForm() {
			return "news";
		}
	
	@GetMapping("/career")
	public String careerForm() {
			return "career";
		}
	
	@GetMapping("/contact")
	public String contactForm() {
			return "contact";
		}
	
	@PostMapping("/process_register")
	public String processRegistration(User user) {
		repo.save(user);
		
		return("registerSuccess");
	}
	
}
