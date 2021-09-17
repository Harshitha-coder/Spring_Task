package com.xworkz.fruit;

public class Vitamin {

	private String type;
	private boolean waterSoluble;
	private boolean fatSoluble;

	public Vitamin(String type, boolean waterSoluble, boolean fatSoluble) {
		super();
		this.type = type;
		this.waterSoluble = waterSoluble;
		this.fatSoluble = fatSoluble;
	}
	
	public void development()
	{
		System.out.println("invoked development()");
	}

	public String getType() {
		return type;
	}

	public boolean isWaterSoluble() {
		return waterSoluble;
	}

	public boolean isFatSoluble() {
		return fatSoluble;
	}

}
