package com.tb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({ "/", "/home" })
	private String home(Model model) {
		model.addAttribute("message", "Hello World !");
		return "index";
	}
	
	@GetMapping({ "user" })
	private String user(Model model) {
		model.addAttribute("message", "Hello User !");
		return "index";
	}
	
	@GetMapping({ "admin" })
	private String admin(Model model) {
		model.addAttribute("message", "Hello Admin !");
		return "index";
	}
}
