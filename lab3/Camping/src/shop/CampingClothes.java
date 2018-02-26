package shop;

public class CampingClothes extends Stuff {
	
	private ClothesType clothestype;
	private String size;
	private String colour;

	public CampingClothes(String name, String producer, int weight, String material, double price, String size, String colour, ClothesType clothestype) {
		super(name, producer, weight, material, price, StuffType.CAMPINGCLOTHES);
		this.size = size;
		this.colour = colour;

	}

	public String toString() {
		return "Name = " + name + " producer = " + producer + " weight = " + weight + " material = " + 	material + " price = " + price + " size = " + size + " colour = " + colour ;
	}
	
	public ClothesType getClothestype() {
		return clothestype;
	}

	public void setClothestype(ClothesType clothestype) {
		this.clothestype = clothestype;
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

}
