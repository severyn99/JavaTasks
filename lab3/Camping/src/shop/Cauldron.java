package shop;

public class Cauldron extends Stuff {

	private double capacity;
	
	public Cauldron(String name, String producer, int weight, String material, double price, double capacity) {
		super(name, producer, weight, material, price, StuffType.CAULDRON);
		this.capacity = capacity;

	}
	
	public String toString() {
		return "Name = " + name + " producer = " + producer + " weight = " + weight + " material = " + 	material + " price = " + price + " capacity = " + capacity ;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

}
