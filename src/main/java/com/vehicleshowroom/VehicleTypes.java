package com.vehicleshowroom;

public class VehicleTypes {
	
	public interface Type {
		public String type();
		public String details();
	}
	
	public static class Normal implements Type {
		private EngineType engineType;
		
		public Normal() {
			this.engineType = EngineType.GAS;
		}
		
		public String type() {
			return "Normal";
		}
		
		public String details() {
			return String.format("Type: %s, Engine Type: %s", type(), engineType);
		}
	}
	
	public static class Sports implements Type {
		private boolean turbo;
		private EngineType engineType;
		
		public Sports(boolean turbo) {
			this.turbo = turbo;
			this.engineType = EngineType.OIL;
		}
		
		public String type() {
			return "Sports";
		}
		
		public String details() {
			return String.format("Type: %s, Turbo: %b, Engine Type: %s", type(), turbo, engineType);
		}
	}
	
	public static class Heavy implements Type {
		private double weight;
		private EngineType engineType;
		
		public Heavy(double weight) {
			this.weight = weight;
			this.engineType = EngineType.DIESEL;
		}
		
		public String type() {
			return "Heavy";
		}
		
		public String details() {
			return String.format("Type: %s, Weight: %f, Engine Type: %s", type(), weight, engineType);
		}
	}
}
