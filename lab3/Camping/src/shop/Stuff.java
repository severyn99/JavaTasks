package shop;

public abstract class Stuff {

	String name;

	StuffType type;

	String producer;

	Integer weight;
	
	String material;
	
	double price;

	
	public Stuff(String name, String producer, int weight, String material, double price, StuffType stuffType) {
		super();
		this.name = name;
		type = stuffType;
		this.material=material;
		this.producer = producer;
		this.weight = weight;
		this.price = price;
	}

	public StuffType getType() {
		return type;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public Integer getWeight() {
		return weight;
	}

	public void set(Integer weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return type + " " + producer + " " + name + " " + weight + " " + material + " " + price;
	}

}
