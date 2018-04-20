package shop;

public final class Boat extends Stuff {

    private int boatCapacity;

    public Boat(final Integer id, final String name, final String producer, final int weight, final String material, final double price, final int boatCapacity) {
        super(id, name, producer, weight, material, price, StuffType.BOAT);
        this.boatCapacity = boatCapacity;

    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "boatCapacity";
    }

    @Override
    public String toSCV() {
        return super.toSCV() + boatCapacity;
    }


    public String toString() {
        return "Name = " + getName() + " producer = " + getProducer() + " weight = " + getWeight()
                + " material = " + getMaterial() + " price = " + getPrice() + " boatCapacity = " + boatCapacity;
    }


    public int getBoatCapacity() {
        return boatCapacity;
    }

    public void setBoatCapacity(final int boatCapacity) {
        this.boatCapacity = boatCapacity;
    }

}
