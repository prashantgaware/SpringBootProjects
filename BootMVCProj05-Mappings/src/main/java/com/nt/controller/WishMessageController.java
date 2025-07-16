package com.nt.controller;

import java.util.Date;
import java.util.LinkedHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nt.service.IWishMessageService;

@RequestMapping("/wish")
@Controller
public class WishMessageController {

	@Autowired
	private IWishMessageService wishService;

	@RequestMapping("/home")
	public String showWishMessage() {
		return "welcome";
	}
	
	@GetMapping("/getAllData")
	public String getAllData() {
		LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
		linkedHashMap.put("wishMessage", wishService.getWishMessage());
		linkedHashMap.put("currentDateAndTime", new Date());
		linkedHashMap.put("welcomeMessage", "Welcome to Wish Message Generator App");
		linkedHashMap.put("status", "success");
		linkedHashMap.put("statusCode", 200);
		return linkedHashMap.toString();
	}
}
