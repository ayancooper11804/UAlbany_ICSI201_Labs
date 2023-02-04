// The purpose of this class is to model a television
// Ayan Cooper | October 19th, 2022

import java.util.Scanner;  // Needed for the Scanner class

public class Television {
	// Constant fields
	static String manufacturer;	// Brand of the TV
	static int screenSize;		// Size of the screen in inches
	// Other fields
	static boolean powerOn;	// Determines whether the TV is on or off
	static int channel;	// What station the TV is showing
	static int volume;		// Loudness of the TV
	
	/**
	 * The method tvBasics sets the default settings for a TV.
	 * @param brand: The brand of the TV.
	 * @param size: The size of the TV screen in inches.
	 */
	public Television (String brand, int size) {
		manufacturer = brand;
		screenSize = size;
		powerOn = false;
		channel = 2;
		volume = 20;
	}

	// Accessor methods
	
	/**
	 * The accessor method getManufacturer gets the brand name of the TV.
	 * @return Returns the TV brand name.
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	
	/**
	 * The accessor method getScreenSize gets the size of the TV screen.
	 * @return Returns the TV screen size.
	 */
	public int getScreenSize() {
		return screenSize;
	}
	
	/**
	 * The accessor method getChannel gets the channel the TV is turned to.
	 * @return Returns the TV channel.
	 */
	public int getChannel() {
		return channel;
	}
	
	/**
	 * The accessor method getVolume gets the volume of the TV.
	 * @return Returns the volume of the TV.
	 */
	public int getVolume() {
		return volume;
	}
	
	// Mutator methods
	
	/**
	 * The mutator method newChannel accepts a value to be stored in the channel field.
	 * @param newChannel: The channel of the TV
	 */
	public void setChannel(int newChannel) {
		Television.channel = newChannel;
	}
	
	/**
	 * The mutator method power changes the state of the TV (whether it is on or off).
	 */
	public void power() {
		if (powerOn == true) {
			powerOn = !powerOn;
		}
	}
	
	/**
	 * The mutator method increaseVolume increases the volume of the TV by one notch.
	 */
	public void increaseVolume() {
		volume = volume +1;
	}
	
	/**
	 * The mutator method decreaseVolume decreases the volume of the TV by one notch.
	 */
	public void decreaseVolume() {
		volume = volume -1;
	}
	
}
