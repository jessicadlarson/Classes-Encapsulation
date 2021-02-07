package com.techelevator;

public class Television {
	// Instance variables
	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;

	// Getters
	public boolean isOn() {
		return isOn;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}
	
	// Methods
	public void turnOff() {
		this.isOn = false;
	}
	
	public void turnOn() {
		this.isOn = true;
		this.currentChannel = 3;
		this.currentVolume = 2;
	}
	
	public void changeChannel(int newChannel) {
		if(isOn) {
			if (newChannel >= 3 && newChannel <= 18) {
				this.currentChannel = newChannel;
			}
		}
	}
	
	public void channelUp() {
		if(isOn) {
			if(this.currentChannel == 18) {
				this.currentChannel = 3;
			} else {
				this.currentChannel++;
			}
		}
	}
	
	public void channelDown() {
		if(isOn) {
			if(this.currentChannel == 3) {
				this.currentChannel = 18;
			} else {
				this.currentChannel--;
			}
		}
	}
	
	public void raiseVolume() {
		if(isOn) {
			if(this.currentVolume == 10) {

			} else {
				this.currentVolume++;
			}
		}
	}
	
	public void lowerVolume() {
		if(isOn) {
			if(this.currentVolume == 0) {

			} else {
				this.currentVolume--;
			}
		}
	}
}
