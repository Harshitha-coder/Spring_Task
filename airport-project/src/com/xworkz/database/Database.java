package com.xworkz.database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Database {

	private String url;
	private String userName;
	private String password;

	public Database() {
		System.out.println("database bean created");
	}

	public void setUrl(String url) {
		this.url = url;
		System.out.println(this.url);
	}

	public void setUserName(String userName) {
		this.userName = userName;
		System.out.println(this.userName);
	}

	public void setPassword(String password) {
		this.password = password;
		System.out.println(this.password);
	}

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		Database database = container.getBean(Database.class);
	}
}
