package shop;

import java.util.*;

public class ShopManager {

    class StuffTypeComparator implements Comparator<Stuff> {

        @Override
        public int compare(final Stuff stuff0, final Stuff stuff1) {
            return stuff0.getProducer().compareTo(stuff1.getProducer());
        }
    }

    public ShopManager(){
    }

    public static Map<Integer, Stuff> getStuffMap() {
        return stuffMap;
    }

    public static void setStuffMap(Map<Integer, Stuff> stuffMap) {
        ShopManager.stuffMap = stuffMap;
    }

    private static Map<Integer, Stuff> stuffMap = new HashMap<>();

    public void addStuffList(final Stuff newStuff) {
        stuffMap.put(newStuff.getId(), newStuff);
    }


    public List<Stuff> sortByProducer(List<Stuff> stuffList) {

        Collections.sort(stuffList, new StuffTypeComparator());
        return stuffList;
    }

    public List<Stuff> sortByWeight(final List<Stuff> stuffListToSort) {
        stuffListToSort.sort((sortStuff1, sortStuff2) -> sortStuff1.getWeight() - sortStuff2.getWeight());
        return stuffListToSort;
    }
}
