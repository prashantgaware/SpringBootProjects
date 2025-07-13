package com.nt.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service("wishService")
public class WishMessageService implements IWishMessageService {

	@Override
	public String getWishMessage() {
		LocalDateTime current = LocalDateTime.now();
		int hour = current.getHour();
		if (hour < 12) {
			return String.format("Good Morning, %s", System.getProperty("user.name"));
		} else if (hour < 17) {
			return String.format("Good Afternoon, %s", System.getProperty("user.name"));
		} else if (hour < 20) {
			return String.format("Good Evening, %s", System.getProperty("user.name"));
		}
		
		return String.format("Good Night, %s", System.getProperty("user.name"));
	}

}
