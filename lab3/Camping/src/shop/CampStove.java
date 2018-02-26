package shop;

public class CampStove extends Stuff {
	
	private double volumeOfGasBalone;
	private TypeOfFuel fuelType;
	private double heatOutput;

	public CampStove(String name, String producer, int weight, String material, double price, double volumeOfGasBalone, double heatOutput) {
		super(name, producer, weight, material, price, StuffType.CAMPSTOVE);
		this.volumeOfGasBalone = volumeOfGasBalone;
		this.heatOutput = heatOutput;

	}
	
	public String toString() {
		return "Name = " + name + " producer = " + producer + " weight = " + weight + " material = " + 	material + " price = " + price + " volumeOfGasBalone = " + volumeOfGasBalone + " heatOutput = " + heatOutput ;
	}

	public double getVolumeOfGasBalone() {
		return volumeOfGasBalone;
	}

	public void setVolumeOfGasBalone(double volumeOfGasBalone) {
		this.volumeOfGasBalone = volumeOfGasBalone;
	}

	public TypeOfFuel getFuelType() {
		return fuelType;
	}

	public void setFuelType(TypeOfFuel fuelType) {
		this.fuelType = fuelType;
	}

	public double getHeatOutput() {
		return heatOutput;
	}

	public void setHeatOutput(double heatOutput) {
		this.heatOutput = heatOutput;
	}

}
