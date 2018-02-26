package shop;

import java.util.List;

public class main {
	

		
	public static void main(String[] args) {
		ShopManager bob = new ShopManager();
		bob.addStuffList(new Boat("Expeditor", "INTEX", 5000, "rubber", 500.54, 8));
		bob.addStuffList(new CampCooler("Frost", "Alaska", 1500, "plastik", 200.0, 2.5, "black", SidesType.HARDSIDED));
		bob.addStuffList(new CampingClothes("Jacket", "4F", 500, "leather", 300.0, "M", "white", ClothesType.JACKETS));
		bob.addStuffList(new CampStove("Heater", "Warior", 2500, "metal", 120.30, 3.3, 2.2));
		bob.addStuffList(new Cauldron("Wiccan", "MealWorkers", 2000, "iron", 80.50, 3.2));
		bob.addStuffList(new SleepingBag("Dreamer", "Bergson", 1500, "wool", 100.0, "M", "white", 2.4, 10));
		bob.addStuffList(new SleepingPad("Helper", "SoftDreams", 300, "rubber", 50.0, "pink", 1.2));
		bob.addStuffList(new Tent("Camper", "4F", 6500, "nylon", 240.55, "black", 6, 2));
		bob.sortByProducer();
		bob.SortByWeight(bob.getStuffList());
		bob.getStuffList().forEach((Stuff stuff)->System.out.println(stuff.toString()));

	}

}
