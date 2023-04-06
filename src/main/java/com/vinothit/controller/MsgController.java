package com.vinothit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMessage() {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg", "Hi, Welcome to Vinoth IT...");
		mav.setViewName("message");
		return mav;
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreetingMessage() {
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("greet", "Good Morning!! Vinoth!! ");
		mav.setViewName("message");
		return mav;

	}
}
