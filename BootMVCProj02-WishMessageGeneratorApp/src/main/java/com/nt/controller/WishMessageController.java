package com.nt.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.service.IWishMessageService;

@Controller
public class WishMessageController {
	
	@Autowired
	private IWishMessageService wishService;
	
	@RequestMapping("/home")
	public String showWishMessage() {
		return "welcome";
	}
	
	@RequestMapping("/wish")
	public ModelAndView fetchWishNessage() {
		ModelAndView mav = new ModelAndView();
		String message = wishService.getWishMessage();
		mav.addObject("wishMsg", message);
		mav.addObject("sysDate", new Date());
		mav.setViewName("show_wish");
		return mav;
	}

}
