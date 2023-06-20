package com.freshapples.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@GetMapping("/test1")
	@ResponseBody
	public String printHello(){
		return "Hello World!";
	}
	
	@GetMapping("/test2")
	public String showHelloPage(Model model){
		// model.addAttribute("message", "Have a great day!");
		return "helloPage";
	}
	
	@GetMapping("/test3")
	public ModelAndView printHelloAgain(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Have a super day!");
		mv.setViewName("helloPage");
		return mv;
	}
	@GetMapping("/home")
	public String showHomePage(Model model){
		return "helloPage";
		}
	}