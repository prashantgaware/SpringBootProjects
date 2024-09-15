package com.nt.dbhardcoding;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DbCreate {
	
	@Value("localhost:mysql.cj")
	private String url;
	
	@Value("root")
	private String userName;
	
	@Value("manager")
	private String password;
	
	public DbCreate() {
		System.out.println("DB created");
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
