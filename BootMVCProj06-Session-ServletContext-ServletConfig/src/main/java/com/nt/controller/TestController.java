package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpSession;

@RequestMapping("/test")
@Controller
public class TestController {
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private ServletConfig config;
	
	@Autowired
	private ServletContext context;
	
	@GetMapping("/home")
	public String getSessionData() {
		return "home";
	}
	
	@GetMapping("/showResult")
	public String showResult(Model model) {
		String sessionId = session.getId();
		String servletName = config.getServletName();
		String contextPath = context.getContextPath();
		
		System.out.println("Session ID: " + sessionId);
		System.out.println("Servlet Name: " + servletName);
		System.out.println("Context Path: " + contextPath);
		
		model.addAttribute("sessionId", sessionId);
		model.addAttribute("servletName", servletName);
		model.addAttribute("contextPath", contextPath);
		
		return "show_result";
	}
}
