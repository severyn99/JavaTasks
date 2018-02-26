package shop;

public class Tent extends Stuff {

	private String size;
	private String colour;
	private int sleepingCapacity;
	private int numberOfDoors;
	
	public Tent(String name, String producer, int weight, String material, double price, String colour, int sleepingCapacity, int numberOfDoors) {
		super(name, producer, weight, material, price, StuffType.TENT);
		this.colour = colour;
		this.sleepingCapacity = sleepingCapacity;
		this.numberOfDoors = numberOfDoors;

	}
	
	public String toString() {
		return "Name = " + name + " producer = " + producer + " weight = " + weight + " material = " + 	material 
				+ " price = " + price + " colour = " + colour + " sleepingCapacity = " + sleepingCapacity 
				+ " numberOfDoors = " + numberOfDoors;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSleepingCapacity() {
		return sleepingCapacity;
	}

	public void setSleepingCapacity(int sleepingCapacity) {
		this.sleepingCapacity = sleepingCapacity;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

}
