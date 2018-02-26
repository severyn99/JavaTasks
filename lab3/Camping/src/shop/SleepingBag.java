package shop;

public class SleepingBag extends Stuff {
	
	private String size;
	private String colour;
	private double volume;
	private int temperatureRating;

	public SleepingBag(String name, String producer, int weight, String material, double price, String size, String colour, double volume, int temperatureRating) {
		super(name, producer, weight, material, price, StuffType.SLEEPINGBAG);
		this.size = size;
		this.colour = colour;
		this.volume = volume;
		this.temperatureRating = temperatureRating;
		
		

	}
	
	public String toString() {
		return "Name = " + name + " producer = " + producer + " weight = " + weight + " material = " + 	material + " price = " + price + " size = " + size + " colour = " + colour + " volume = " + volume + " temperatureRating = " + temperatureRating;
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

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public int getTemperatureRating() {
		return temperatureRating;
	}

	public void setTemperatureRating(int temperatureRating) {
		this.temperatureRating = temperatureRating;
	}

}
