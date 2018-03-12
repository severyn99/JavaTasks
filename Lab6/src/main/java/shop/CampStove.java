package shop;

public final class CampStove extends Stuff {

    private double volumeOfGasBalone;
    private TypeOfFuel fuelType;
    private double heatOutput;

    public CampStove(final String name, final String producer, final int weight, final String material, final double price, final double volumeOfGasBalone, final double heatOutput, final TypeOfFuel fuelType) {
        super(name, producer, weight, material, price, StuffType.CAMPSTOVE);
        this.volumeOfGasBalone = volumeOfGasBalone;
        this.heatOutput = heatOutput;
    }

    /*public String toString() {
        return "Name = " + getName() + " producer = " + getProducer() + " weight = " + getWeight()
                + " material = " + getMaterial() + " price = " + getPrice() + " volumeOfGasBalone = "
                + volumeOfGasBalone + " heatOutput = " + heatOutput;
    }*/

    /*public double getVolumeOfGasBalone() {
        return volumeOfGasBalone;
    }

    public void setVolumeOfGasBalone(final double volumeOfGasBalone) {
        this.volumeOfGasBalone = volumeOfGasBalone;
    }

    public TypeOfFuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(final TypeOfFuel fuelType) {
        this.fuelType = fuelType;
    }

    public double getHeatOutput() {
        return heatOutput;
    }

    public void setHeatOutput(final double heatOutput) {
        this.heatOutput = heatOutput;
    }*/

}
