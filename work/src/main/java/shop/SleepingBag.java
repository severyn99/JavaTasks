package shop;

public final class SleepingBag extends Stuff {

    private String size;
    private String colour;
    private double volume;
    private int temperatureRating;

    public SleepingBag(final String name, final String producer, final int weight, final String material, final double price, final String size, final String colour, final double volume, final int temperatureRating) {
        super(name, producer, weight, material, price, StuffType.SLEEPINGBAG);
        this.size = size;
        this.colour = colour;
        this.volume = volume;
        this.temperatureRating = temperatureRating;



    }

    public String toString() {
        return "Name = " + getName() + " producer = " + getProducer() + " weight = " + getWeight()
                + " material = " + getMaterial() + " price = " + getPrice() + " size = " + size + " colour = "
                + colour + " volume = " + volume + " temperatureRating = " + temperatureRating;
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

    public double getVolume() {
        return volume;
    }

    public void setVolume(final double volume) {
        this.volume = volume;
    }

    public int getTemperatureRating() {
        return temperatureRating;
    }

    public void setTemperatureRating(final int temperatureRating) {
        this.temperatureRating = temperatureRating;
    }

}
