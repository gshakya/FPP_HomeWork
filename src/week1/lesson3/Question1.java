package week1.lesson3;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Television tv1 = new Television("Sony", 1000);
		System.out.println("1. Push Power Button");
		System.out.println("2. Set Channel");
		System.out.println("3. Increase Volume");
		System.out.println("4. Decrease Volume");
		System.out.println("5. Get Current Volume");
		System.out.println("6. Get Current Channel");
		System.out.println("7. Get Manufacture");
		System.out.println("8. Get Screen Size");
		System.out.println("9. Exit!!");
		int option = 0;
		Scanner in = new Scanner(System.in);
		do {
			System.out.printf("Enter Your Option:");
			option = in.nextInt();
			switch (option) {
			case 1:
				tv1.power();
				System.out.println("Powered "
						+ (tv1.getPowerOn() ? "on" : "off"));
				break;
			case 2:
				System.out.printf("Enter Channel:");
				int channel = in.nextInt();
				tv1.setChannel(channel);
				break;
			case 3:
				tv1.increaseVolume();
				break;
			case 4:
				tv1.decreaseVolume();
				break;
			case 5:
				System.out.println("Current Volume: " + tv1.getVolume());
				break;
			case 6:
				System.out.println("Current Channel: " + tv1.getChannel());
				break;
			case 7:
				System.out.println("Manufacturer: " + tv1.getMANUFACTURER());
				break;
			case 8:
				System.out.println("Screen Size: " + tv1.getSCREEN_SIZE());
				break;
			case 9:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Not a valid Option Please Press again");
				break;
			}

		} while (option != 9);
		in.close();
	}
}

class Television {
	private final String MANUFACTURER;
	private final int SCREEN_SIZE;
	private boolean powerOn;
	private int channel;
	private int volume;

	Television(String brand, int size) {
		this.MANUFACTURER = brand;
		this.SCREEN_SIZE = size;
	}

	public void power() {
		powerOn = !powerOn;
	}

	public void setChannel(int channel) {
		if (powerOn) {
			this.channel = channel;
			System.out.println("Channel set to: " + channel);
		} else {
			System.out
					.println("Channel cann't be set: Television is powered off");
		}
	}

	public void increaseVolume() {
		if (powerOn) {
			volume++;
			System.out.println("Volume is: " + volume);
		} else {
			System.out
					.println("volume cann't be increased: Television is powered off");
		}
	}

	public void decreaseVolume() {
		if (powerOn) {
			volume--;
			System.out.println("Volume is: " + volume);
		} else {
			System.out
					.println("volume cann't be decreased: Television is powered off");
		}
	}

	public String getMANUFACTURER() {
		return MANUFACTURER;
	}

	public int getSCREEN_SIZE() {
		return SCREEN_SIZE;
	}

	public boolean getPowerOn() {
		return powerOn;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}
}