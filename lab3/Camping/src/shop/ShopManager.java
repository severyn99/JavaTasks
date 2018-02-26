package shop;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ShopManager {

	class StuffTypeComparator implements Comparator<Stuff> {

		@Override
		public int compare(Stuff stuff0, Stuff stuff1) {
			return stuff0.getProducer().compareTo(stuff1.getProducer());
		}
	}

	private List<Stuff> stuffList = new LinkedList<>();

	public void addStuffList(Stuff newStuff) {
		stuffList.add(newStuff);
	}

	public List<Stuff> getStuffList() {
		return stuffList;
	}

	public void sortByProducer() {

		Collections.sort(stuffList, new StuffTypeComparator());
		
	}
	

	public void SortByWeight(List<Stuff> stuffListToSort) {
		stuffListToSort.sort((sortStuff1, sortStuff2) -> sortStuff1.getWeight() - sortStuff2.getWeight());
		
	}
}
