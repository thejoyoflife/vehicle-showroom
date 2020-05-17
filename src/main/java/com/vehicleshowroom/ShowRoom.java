package com.vehicleshowroom;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class ShowRoom {
	private Map<String, Vehicle> vehicles;
	private AtomicInteger currentVisitors;
	
	public ShowRoom() {
		this.vehicles = new HashMap<String, Vehicle>();
		this.currentVisitors = new AtomicInteger(30);
	}
	
	public String addVehicle(Vehicle vehicle) {
		vehicles.put(vehicle.id(), vehicle);
		if (vehicle.type() instanceof VehicleTypes.Sports) {
			currentVisitors.addAndGet(20);
		}
		return vehicle.id();
	}
	
	public Vehicle removeVehicle(String id) {
		return vehicles.remove(id);
	}
	
	public Collection<Vehicle> vehicles() {
		return vehicles.values();
	}
	
	public int currentVisitorCount() {
		return currentVisitors.get();
	}
}
