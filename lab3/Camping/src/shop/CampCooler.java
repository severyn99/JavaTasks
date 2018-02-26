package shop;

public class CampCooler extends Stuff {
	
	private double capacity;
	private String colour;
	private SidesType coolerType;

	public CampCooler(String name, String producer, int weight, String material, double price, double capacity, String colour, SidesType coolerType) {
		super(name, producer, weight, material, price, StuffType.CAMPCOOLER);
		this.capacity = capacity;
		this.colour = colour;

	}
	
	public String toString() {
		return "Name = " + name + " producer = " + producer + " weight = " + weight + " material = " + 	material + " price = " + price + " capacity = " + capacity + " colour = " + colour ;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public SidesType getCoolerType() {
		return coolerType;
	}

	public void setCoolerType(SidesType coolerType) {
		this.coolerType = coolerType;
	}

}
