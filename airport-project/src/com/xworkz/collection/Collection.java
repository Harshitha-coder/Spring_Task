package com.xworkz.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {

	private List<String> listValues;
	private Set<String> setValues;
	private Map<Integer,String> mapValues;
	
	public Collection() {
		System.out.println("collection bean created");
	}

	public void setListValues(List<String> listValues) {
		this.listValues = listValues;
		System.out.println(this.listValues);
	}

	public void setSetValues(Set<String> setValues) {
		this.setValues = setValues;
		System.out.println(this.setValues);
	}

	public void setMapValues(Map<Integer, String> mapValues) {
		this.mapValues = mapValues;
		System.out.println(this.mapValues);
	}
	
}
