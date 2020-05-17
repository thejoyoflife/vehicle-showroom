package com.vehicleshowroom;

public class VehicleFactory {
	private static final IdGenerator idGen = new SimpleIdGenerator();
	
	private static final VehicleFactory instance = new VehicleFactory();
	
	private VehicleFactory() {}
	
	public static VehicleFactory getInstance() {
		return instance;
	}
	
	
	public Vehicle makeNormalVehicle(String model, int enginePower, String tireSize) {
		Vehicle vehicle = Vehicle.builder(idGen)
							.model(model)
							.enginePower(enginePower)
							.tireSize(new TireSize(tireSize))
							.vehicleType(new VehicleTypes.Normal())
							.build();
		return vehicle;
	}
	
	public Vehicle makeSportsVehicle(String model, int enginePower, String tireSize) {
		Vehicle vehicle = Vehicle.builder(idGen)
							.model(model)
							.enginePower(enginePower)
							.tireSize(new TireSize(tireSize))
							.vehicleType(new VehicleTypes.Sports(true))
							.build();
		return vehicle;
	}
	
	public Vehicle makeHeavyVehicle(String model, int enginePower, String tireSize, double weight) {
		Vehicle vehicle = Vehicle.builder(idGen)
							.model(model)
							.enginePower(enginePower)
							.tireSize(new TireSize(tireSize))
							.vehicleType(new VehicleTypes.Heavy(weight))
							.build();
		return vehicle;
	}
}
