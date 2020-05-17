package com.vehicleshowroom;

public class TireSize {
	private String name;
	public TireSize(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("Tire Size: %s", name);
	}
}
