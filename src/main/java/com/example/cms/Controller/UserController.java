package com.example.cms.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.cms.Service.UserService;

@Controller
@RequestMapping("/registration")
public class UserController {
	
	private UserService userService;
	
	
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	@GetMapping("/login")
		public String login() {
		return "login";
	}
	
	
	
	@GetMapping
	public String showRegistrationForm( Model model) {
		model.addAttribute("user",new UserRegistrationDto());
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
		
	}
}
