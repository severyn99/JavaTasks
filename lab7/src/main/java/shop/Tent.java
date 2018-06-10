package shop;

public final class Tent extends Stuff {

    private String size;
    private String colour;
    private int sleepingCapacity;
    private int numberOfDoors;

    public Tent(final String name, final String producer, final int weight, final String material, final double price, final String colour, final int sleepingCapacity, final int numberOfDoors) {
        super(name, producer, weight, material, price, StuffType.TENT);
        this.colour = colour;
        this.sleepingCapacity = sleepingCapacity;
        this.numberOfDoors = numberOfDoors;

    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "colour," + "sleepingCapacity," + "numberOfDoors";
    }

    @Override
    public String toSCV() {
        return super.toSCV() + colour + "," + sleepingCapacity + "," + numberOfDoors;
    }

    public String toString() {
        return "Name = " + getName() + " producer = " + getProducer() + " weight = " + getWeight() + " material = " + getMaterial()
                + " price = " + getPrice() + " colour = " + colour + " sleepingCapacity = " + sleepingCapacity
                + " numberOfDoors = " + numberOfDoors;
    }

    public String getSize() {
        return size;
    }

    public void setSize(final String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(final String colour) {
        this.colour = colour;
    }

    public int getSleepingCapacity() {
        return sleepingCapacity;
    }

    public void setSleepingCapacity(final int sleepingCapacity) {
        this.sleepingCapacity = sleepingCapacity;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(final int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

}
