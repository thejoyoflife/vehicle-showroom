package com.vehicleshowroom;

public enum EngineType {
	OIL, GAS, DIESEL;
	
	@Override
	public String toString() {		
		return name().toLowerCase();
	}
}
