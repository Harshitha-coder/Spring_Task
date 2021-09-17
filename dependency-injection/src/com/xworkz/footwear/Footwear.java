package com.xworkz.footwear;

public class Footwear {

	private String brand;
	private String color;
	private double price;
	private Material material;

	public Footwear(String brand, String color, double price, Material material) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.material = material;
	}

	public void walk() {
		System.out.println("invoked walk()");
		material.protection();
	}

	public String getBrand() {
		return brand;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	public Material getMaterial() {
		return material;
	}
}
