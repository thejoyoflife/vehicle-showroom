package com.vehicleshowroom;

public class Main {

	public static void main(String[] args) {
		System.out.println("::::::::::::VEHICLE SHOWROOM::::::::::::");
		
		ShowRoom showRoom = new ShowRoom();
		
		showCurrentVisitorCount(showRoom);
		addANormalVehicle(showRoom);
		showCurrentVisitorCount(showRoom);
		
		addASportVehicle(showRoom);
		showCurrentVisitorCount(showRoom);
		
		String id = addAHeavyVehicle(showRoom);
		showCurrentVisitorCount(showRoom);
		
		listVehicles(showRoom);
		
		removeAVehicle(showRoom, id);
		listVehicles(showRoom);
		showCurrentVisitorCount(showRoom);
	}
	
	private static void showCurrentVisitorCount(ShowRoom showRoom) {
		System.out.println("Current Expected Visitor Count: " + showRoom.currentVisitorCount());
	}
	
	private static void addANormalVehicle(ShowRoom showRoom) {
		System.out.println("Adding a Normal Vehicle");
		Vehicle normalVehicle = VehicleFactory.getInstance().makeNormalVehicle("NORM-01", 10, "TZ-NORM");
		showRoom.addVehicle(normalVehicle);
		System.out.println("Added a Normal Vehicle with ID: " + normalVehicle.id());
	}
	
	private static void addASportVehicle(ShowRoom showRoom) {
		System.out.println("Adding a Sport Vehicle");
		Vehicle sportVehicle = VehicleFactory.getInstance().makeSportsVehicle("SPORTS-01", 20, "TZ-SPORTS");
		showRoom.addVehicle(sportVehicle);
		System.out.println("Added a Sport Vehicle with ID: " + sportVehicle.id());
	}
	
	private static String addAHeavyVehicle(ShowRoom showRoom) {
		System.out.println("Adding a Heavy Vehicle");
		Vehicle heavyVehicle = VehicleFactory.getInstance().makeHeavyVehicle("HEAVY-01", 20, "TZ-SPORTS", 1000.5d);
		showRoom.addVehicle(heavyVehicle);
		System.out.println("Added a Heavy Vehicle with ID: " + heavyVehicle.id());
		return heavyVehicle.id();
	}
	
	private static void removeAVehicle(ShowRoom showRoom, String id) {
		System.out.println("Removing a Vehicle with ID: " + id);
		Vehicle removedVehicle = showRoom.removeVehicle(id);
		if (removedVehicle != null) {
			System.out.println("Removed a Vehicle with ID: " + removedVehicle.id());
		} else {
			System.out.println("Vehicle with ID: \"" + id + "\" Not Found!");
		}
	}
	
	private static void listVehicles(ShowRoom showRoom) {
		System.out.print("List of Vehicles: ");
		System.out.println(showRoom.vehicles());
	}
}
