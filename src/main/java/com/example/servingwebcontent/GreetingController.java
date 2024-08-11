package com.example.servingwebcontent;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.servingwebcontent.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController{
	private final UserService userService;

	public GreetingController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/")
	public String greeting(Model model){
		model.addAttribute("users", userService.listUsers());
		return "greeting";
	}
	@PostMapping("/user/create")
	public String createUser(User user){
		userService.saveUser(user);
		return "redirect:/";
	}



}
