package com.nt.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.nt.SpringRestProj01FirstProviderAppApplication;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageRenderContoller {

	@GetMapping("/wish")
	public ResponseEntity<String> showMessage() {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		int hour = localDateTime.getHour();
		String message = null;
		if (hour < 12) {
			message = "Good morning";
		} else if (hour < 16) {
			message = "Good afternoon";
		} else if (hour < 20) {
			message = "Good evening";
		} else {
			message = "Good night";
		}
		
		return new ResponseEntity<String>(message, HttpStatus.OK);
	}
	
}
