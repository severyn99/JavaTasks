package shop;

public final class Cauldron extends Stuff {

    private double capacity;

    public Cauldron(final String name, final String producer, final int weight, final String material, final double price, final double capacity) {
        super(name, producer, weight, material, price, StuffType.CAULDRON);
        this.capacity = capacity;

    }

    public String toString() {
        return "Name = " + getName() + " producer = " + getProducer() + " weight = " + getWeight() + " material = " + getMaterial() + " price = " + getPrice() + " capacity = " + capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(final double capacity) {
        this.capacity = capacity;
    }

}
