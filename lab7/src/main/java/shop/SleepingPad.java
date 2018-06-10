package shop;

public final class SleepingPad extends Stuff {

    private String colour;
    private double thickness;

    public SleepingPad(final String name, final String producer, final int weight, final String material, final double price, final String colour, final double thickness) {
        super(name, producer, weight, material, price, StuffType.SLEEPINGPAD);
        this.colour = colour;
        this.thickness = thickness;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "colour," + "thickness";
    }

    @Override
    public String toSCV() {
        return super.toSCV() + colour + "," + thickness;
    }

     public String toString() {
        return "Name = " + getName() + " producer = " + getProducer() + " weight = " + getWeight()
                + " material = " + getMaterial() + " price = " + getPrice() + " colour = " + colour
                + " thickness = " + thickness;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(final String colour) {
        this.colour = colour;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(final double thickness) {
        this.thickness = thickness;
    }

}
