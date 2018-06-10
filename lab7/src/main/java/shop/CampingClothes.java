package shop;

public final class CampingClothes extends Stuff {

    private ClothesType clothestype;
    private String size;
    private String colour;

    public CampingClothes(final String name, final String producer, final int weight, final String material, final double price, final String size, final String colour, final ClothesType clothestype) {
        super(name, producer, weight, material, price, StuffType.CAMPINGCLOTHES);
        this.size = size;
        this.colour = colour;

    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "size," + "colour";
    }

    @Override
    public String toSCV() {
        return super.toSCV() + size + "," + colour;
    }

    public String toString() {
        return "Name = " + getName() + " producer = " + getProducer() + " weight = " + getWeight()
                + " material = " + getMaterial() + " price = " + getPrice() + " size = " + size + " colour = "
                + colour;
    }

    public ClothesType getClothestype() {
        return clothestype;
    }

    public void setClothestype(final ClothesType clothestype) {
        this.clothestype = clothestype;
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

}

