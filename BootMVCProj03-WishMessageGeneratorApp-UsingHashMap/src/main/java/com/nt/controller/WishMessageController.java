package com.nt.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nt.service.IWishMessageService;

@Controller
public class WishMessageController {

	@Autowired
	private IWishMessageService wishService;

	@RequestMapping("/home")
	public String showWishMessage() {
		return "welcome";
	}

	
//	@RequestMapping("/wish")
//	public ModelAndView fetchWishNessage() {
//		ModelAndView mav = new ModelAndView();
//		String message = wishService.getWishMessage();
//		mav.addObject("wishMsg", message);
//		mav.addObject("sysDate", new Date());
//		mav.setViewName("show_wish");
//		return mav;
//	}
	 

//	@RequestMapping("/wish")
//	public String fetchWishMessage(HashMap<String, Object> map) {
//		// This method is not used in the current context, but can be implemented if needed.
//		String message = wishService.getWishMessage();
//		map.put("wishMsg", message);
//		map.put("sysDate", new Date());
//		return "show_wish";
//	}

	/**
	 * This method handles the "/wish" request and returns a view name
	 * @param map is a Map that will be used to pass data to the view.
	 * @return returns the view name to be rendered This method uses a Map to pass
	 *         data to the view. It is an alternative to using ModelAndView. Best
	 *         suited for simple data passing scenarios.
	 */
	@RequestMapping("/wish")
	public String fetchhWishMessage(Map<String, Object> map) {
		// This method is not used in the current context, but can be implemented if needed.
		System.out.println("Shared memoryobject class name: " + map.getClass().getName());
		String message = wishService.getWishMessage();
		map.put("wishMsg", message);
		map.put("sysDate", new Date());
		return "show_wish";
	}
	
	
	@RequestMapping("/wish2")
	public Model fetchWishMessage() {
		// This method is not used in the current context, but can be implemented if needed.
		System.out.println("Shared memoryobject class name: " + map.getClass().getName());
		String message = wishService.getWishMessage();
		
		Model map = new BindingAwareModelMap();
		map.addAttribute("wishMsg", message);
		map.addAttribute("sysDate", new Date());
		return map; 
	}
	
	@RequestMapping("/wish3")
	public ModelMap fetchWishMessage2() {
		// This method is not used in the current context, but can be implemented if needed.
//		System.out.println("Shared memoryobject class name: " + map.getClass().getName());
		String message = wishService.getWishMessage();
		
		ModelMap map = new ModelMap();
		map.addAttribute("wishMsg", message);
		map.addAttribute("sysDate", new Date());
		return map; 
	}
}
