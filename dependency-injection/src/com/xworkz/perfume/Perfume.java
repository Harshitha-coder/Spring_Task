package com.xworkz.perfume;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Perfume {

	@Value("Engage")
	private String name;
	@Value("Pink")
	private String color;
	@Value("Engage")
	private String brand;
	@Value("120")
	private double price;
	@Autowired
	private Alchohol alchohol;
	
	public Perfume() {
		System.out.println("perfume bean created");
	}

	public Perfume(String name, String color, String brand, double price, Alchohol alchohol) {
		super();
		this.name = name;
		this.color = color;
		this.brand = brand;
		this.price = price;
		this.alchohol = alchohol;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	public Alchohol getAlchohol() {
		return alchohol;
	}

	@Override
	public String toString() {
		return "Perfume [name=" + name + ", color=" + color + ", brand=" + brand + ", price=" + price + ", alchohol="
				+ alchohol+"]";
	}

	
	
}
