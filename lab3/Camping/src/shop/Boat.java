package shop;

public class Boat extends Stuff {
	
	private int boatCapacity;

	public Boat(String name, String producer, int weight, String material, double price, int boatCapacity) {
		super(name, producer, weight, material, price, StuffType.BOAT);
		this.boatCapacity = boatCapacity;

	}
	
	public String toString() {
		return "Name = " + name + " producer = " + producer + " weight = " + weight + " material = " + 	material + " price = " + price + " boatCapacity = " + boatCapacity ;
	}

	public int getBoatCapacity() {
		return boatCapacity;
	}

	public void setBoatCapacity(int boatCapacity) {
		this.boatCapacity = boatCapacity;
	}

}
