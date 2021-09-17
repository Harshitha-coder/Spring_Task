package com.xworkz.footwear;

public class Material {

	private String plastic;
	private String cloth;
	private String rubber;
	
	public Material(String plastic, String cloth, String rubber) {
		super();
		this.plastic = plastic;
		this.cloth = cloth;
		this.rubber = rubber;
	}

	public void protection()
	{
		System.out.println("invoked protection()");
	}

	public String getPlastic() {
		return plastic;
	}

	public String getCloth() {
		return cloth;
	}

	public String getRubber() {
		return rubber;
	}
}
