package shop;

public final class CampCooler extends Stuff {

    private double capacity;
    private String colour;
    private SidesType coolerType;

    public CampCooler(final String name, final String producer, final int weight, final String material, final double price, final double capacity, final String colour, final SidesType coolerType) {
        super(name, producer, weight, material, price, StuffType.CAMPCOOLER);
        this.capacity = capacity;
        this.colour = colour;

    }

    /*public String toString() {
        return "Name = " + getName() + " producer = " + getProducer() + " weight = " + getWeight()
                + " material = " + getMaterial() + " price = " + getPrice() + " capacity = " + capacity
                + " colour = " + colour;
    }*/

    /*public double getCapacity() {
        return capacity;
    }

    public void setCapacity(final double capacity) {
        this.capacity = capacity;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(final String colour) {
        this.colour = colour;
    }

    public SidesType getCoolerType() {
        return coolerType;
    }

    public void setCoolerType(final SidesType coolerType) {
        this.coolerType = coolerType;
    }*/

}
