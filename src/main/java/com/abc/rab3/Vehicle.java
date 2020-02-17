package com.abc.rab3;

public class Vehicle {
	private String make;
	private String model;
	private String color;

	public Vehicle() {

	}

	public Vehicle(String make, String model, String color) {
		super();
		this.make = make;
		this.model = model;
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", color=" + color + "]";
	}

}
