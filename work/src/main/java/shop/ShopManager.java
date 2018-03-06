package shop;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public final class ShopManager {

    class StuffTypeComparator implements Comparator<Stuff> {

        @Override
        public int compare(final Stuff stuff0, final Stuff stuff1) {
            return stuff0.getProducer().compareTo(stuff1.getProducer());
        }
    }

    private List<Stuff> stuffList = new LinkedList<>();

    public void addStuffList(final Stuff newStuff) {
        stuffList.add(newStuff);
    }

    public List<Stuff> getStuffList() {
        return stuffList;
    }

    public void sortByProducer() {

        Collections.sort(stuffList, new StuffTypeComparator());

    }


    public void sortByWeight(final List<Stuff> stuffListToSort) {
        stuffListToSort.sort((sortStuff1, sortStuff2) -> sortStuff1.getWeight() - sortStuff2.getWeight());

    }
}
