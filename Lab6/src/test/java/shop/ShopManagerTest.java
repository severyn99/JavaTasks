package shop;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopManagerTest{
    static Tent tent;
    private static ShopManager manager = new ShopManager();
    private List<Stuff> testList = new LinkedList<>();
    private static Stuff stuff = new Tent("Name", "Producer", 3, "Materia",4.5, "Coor", 4, 3 );
    private static Stuff stuff1 = new Boat("Name", "e", 45, "gun", 4,3);
    private static Stuff stuff2 = new Cauldron("dd", "f", 47, "tt", 5, 4);
    private static Stuff stuff3 = new SleepingBag("rr", "q", 50, "dd", 4, "M", "red", 3, 4);
    private static Stuff stuff4 = new CampStove("e", "r", 70, "e", 5,  3, 10, TypeOfFuel.WOOD);
    private static Stuff stuff5 = new SleepingPad("w", "v", 71, "s", 3, "red", 2);
    private static Stuff stuff6 = new CampCooler("y", "w", 72, "w", 2,3, "deep", SidesType.HARDSIDED);
    private static Stuff stuff7 = new CampingClothes("y", "z", 73, "r", 3, "M", "dead", ClothesType.JACKETS);

    @BeforeAll
    static void addStuffsForTest() {
        manager.addStuffList(stuff);
        manager.addStuffList(stuff1);
        manager.addStuffList(stuff2);
        manager.addStuffList(stuff3);
        manager.addStuffList(stuff4);
        manager.addStuffList(stuff5);
        manager.addStuffList(stuff6);
        manager.addStuffList(stuff7);
    }

    @Test
    public void testAddStuffList() {
        ShopManager testManager = new ShopManager();
        testManager.addStuffList(tent);
        assertEquals(tent, testManager.getStuffList().get(0));
    }

    @Test
    public void testSortByProducer() {
        testList = manager.sortByProducer(manager.getStuffList());
        assertEquals(8, testList.size());
        assertEquals(stuff.getProducer(), testList.get(0).getProducer());
        assertEquals(stuff1.getProducer(), testList.get(1).getProducer());
        assertEquals(stuff2.getProducer(), testList.get(2).getProducer());
        assertEquals(stuff3.getProducer(), testList.get(3).getProducer());
        assertEquals(stuff4.getProducer(), testList.get(4).getProducer());
        assertEquals(stuff5.getProducer(), testList.get(5).getProducer());
        assertEquals(stuff6.getProducer(), testList.get(6).getProducer());
        assertEquals(stuff7.getProducer(), testList.get(7).getProducer());

    }

    @Test
    public void testSortByWeight() {
        testList = manager.sortByWeight(manager.getStuffList());
        assertEquals(8, testList.size());
        assertEquals(stuff.getWeight(), testList.get(0).getWeight());
        assertEquals(stuff1.getWeight(), testList.get(1).getWeight());
        assertEquals(stuff2.getWeight(), testList.get(2).getWeight());
        assertEquals(stuff3.getWeight(), testList.get(3).getWeight());
        assertEquals(stuff4.getWeight(), testList.get(4).getWeight());
        assertEquals(stuff5.getWeight(), testList.get(5).getWeight());
        assertEquals(stuff6.getWeight(), testList.get(6).getWeight());
        assertEquals(stuff7.getWeight(), testList.get(7).getWeight());

    }
}