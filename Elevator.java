package com.techelevator;

public class Elevator {
	// Instance Variables
	private int currentFloor = 1;
	private int numberOfFloors;
	private boolean doorOpen;
	
	// Getters
	public int getCurrentFloor() {
		return currentFloor;
	}
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	public boolean getDoorOpen() {
		return doorOpen;
	}
	
	// Constructor
	public Elevator(int numberOfLevels) {
		this.numberOfFloors = numberOfLevels;
	}
	
	// Methods
	
	public boolean isDoorOpen() {
		return doorOpen;
	}
	public void openDoor() {
		this.doorOpen = true;
	}
	
	public void closeDoor() {
		this.doorOpen = false;
	}
	
	public void goUp(int desiredFloor) {
		if(doorOpen) {
			
		} else {
						
			if (desiredFloor > this.currentFloor && desiredFloor <= this.numberOfFloors){
				this.currentFloor = desiredFloor;
			}
		}
	}
	
	public void goDown(int desiredFloor) {
		if(doorOpen) {
			
		} else {
			if (desiredFloor < this.currentFloor && desiredFloor >= 1) {
				this.currentFloor = desiredFloor;
			}
		}
	}
	
}
