package com.xworkz.perfume;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alchohol {

	@Value("Kingfisher Strong")
	private String name;
	@Value("Kingfisher")
	private String brand;
	@Value("130")
	private double price;
	@Value("Beer")
	private String type;
	
	public Alchohol() {
		System.out.println("alchohol bean created");
	}

	public Alchohol(String name, String brand, double price, String type) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Alchohol [name=" + name + ", brand=" + brand + ", price=" + price + ", type=" + type + "]";
	}
	
}
