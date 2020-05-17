package com.vehicleshowroom;

public class Vehicle {
	private String id;
	private String model;
	private int enginePower;
	private TireSize tireSize;
	private VehicleTypes.Type vehicleType;

	private Vehicle() {
	}

	public static Builder builder(IdGenerator idGenerator) {
		return new Builder(idGenerator);
	}

	public String id() {
		return id;
	}

	public String model() {
		return model;
	}

	public int enginePower() {
		return enginePower;
	}

	public TireSize tireSize() {
		return tireSize;
	}

	public VehicleTypes.Type type() {
		return vehicleType;
	}

	public String details() {
		return String.format("Id: %s, Model: %s, Engine Power: %d, Tire Size: %s, Vehicle Type: %s", id, model,
				enginePower, tireSize, vehicleType);
	}

	@Override
	public String toString() {
		return String.format("Id: %s", id);
	}

	public static class Builder {
		private String model;
		private int enginePower;
		private TireSize tireSize;
		private VehicleTypes.Type vehicleType;
		private IdGenerator idGenerator;

		public Builder(IdGenerator idGenerator) {
			this.idGenerator = idGenerator;
		}

		public Builder model(String model) {
			this.model = model;
			return this;
		}

		public Builder enginePower(int enginePower) {
			this.enginePower = enginePower;
			return this;
		}

		public Builder tireSize(TireSize tireSize) {
			this.tireSize = tireSize;
			return this;
		}

		public Builder vehicleType(VehicleTypes.Type vehicleType) {
			this.vehicleType = vehicleType;
			return this;
		}

		public Vehicle build() {
			Vehicle vehicle = new Vehicle();
			vehicle.id = idGenerator.nextId();
			vehicle.model = model;
			vehicle.enginePower = enginePower;
			vehicle.tireSize = tireSize;
			vehicle.vehicleType = vehicleType;
			return vehicle;
		}
	}
}
