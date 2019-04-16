package a.sortingCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Demo1SortingList {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}

}
