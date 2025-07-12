package com.nt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nt.service.IWishMessageService;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class WishMessageController {

	@Autowired
	private IWishMessageService wishService;

	@RequestMapping("/home")
	public String showWishMessage() {
		return "welcome";
	}

	
	@RequestMapping("/wish")
	public String fetchWishMessage(HttpServletResponse response) {
		
		String message = wishService.getWishMessage();
		try (PrintWriter writer = response.getWriter()) {
			writer.println("<h1 style='color:blue;text-align:center'>");
			writer.println(message);
			writer.println("</h1>");
			writer.println("<br><br>");
			writer.println("<h1 style='color:green;text-align:center'>");
			writer.println("Current Date and Time: " + new Date());
			writer.println("</h1>");
			writer.println("<h1 style='color:blue;text-align:center'>");
			writer.println("Welcome to Wish Message Generator App");
			writer.println("</h1>");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		
		return null;
	}
}
