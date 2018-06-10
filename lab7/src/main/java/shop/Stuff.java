package shop;

public abstract class Stuff {

    private String name;

    private StuffType type;

    private String producer;

    private Integer weight;

    private String material;

    private double price;


    public Stuff(final String name, final String producer, final int weight, final String material, final double price, final StuffType stuffType) {
        super();
        this.name = name;
        type = stuffType;
        this.material = material;
        this.producer = producer;
        this.weight = weight;
        this.price = price;
    }

    public final StuffType getType() {
        return type;
    }

    public final String getProducer() {
        return producer;
    }

    public final void setProducer(final String producer) {
        this.producer = producer;
    }

    public final Integer getWeight() {
        return weight;
    }

/*    public final void set(final Integer weight) {
        this.weight = weight;
    }*/

    public final String getName() {
        return name;
    }

    public final void setName(final String name) {
        this.name = name;
    }

    public final String getMaterial() {
        return material;
    }

    public final void setMaterial(final String material) {
        this.material = material;
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(final double price) {
        this.price = price;
    }

    public String getHeaders(){
        return "name," + "type," + "producer," + "weight," + "material," + "price, ";
    }

    public String toSCV(){
        return name + "," + type + "," + producer + "," + weight + "," + material + "," + price + ",";
    }

    public String toString() {
        return type + " " + producer + " " + name + " " + weight + " " + material + " " + price;
    }

}

