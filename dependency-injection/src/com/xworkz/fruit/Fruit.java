package com.xworkz.fruit;

public class Fruit {

	private String name;
	private String color;
	private double price;
	private boolean taste;
	private Vitamin vitamin;

	public Fruit(String name, String color, double price, boolean taste, Vitamin vitamin) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.taste = taste;
		this.vitamin = vitamin;
	}

	public void energy() {
		System.out.println("invoked energy()");
		vitamin.development();
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	public boolean isTaste() {
		return taste;
	}

	public Vitamin getVitamin() {
		return vitamin;
	}

}
