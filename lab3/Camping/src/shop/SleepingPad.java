package shop;

public class SleepingPad extends Stuff{
	
	private String colour;
	private double thickness;

	public SleepingPad(String name, String producer, int weight, String material, double price, String colour, double thickness) {
		super(name, producer, weight, material, price, StuffType.SLEEPINGPAD);
		this.colour = colour;
		this.thickness = thickness;

	}
	
	public String toString() {
		return "Name = " + name + " producer = " + producer + " weight = " + weight + " material = " + 	material + " price = " + price + " colour = " + colour + " thickness = " + thickness;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getThickness() {
		return thickness;
	}

	public void setThickness(double thickness) {
		this.thickness = thickness;
	}

}
