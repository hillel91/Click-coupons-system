package a.sortingCollections;

import java.util.Set;
import java.util.TreeSet;

public class Demo2SortedSet {

	public static void main(String[] args) {

		Set<Integer> set = new TreeSet<>();
		set.add(3);
		set.add(1);
		set.add(4);
		set.add(3); // Duplicate - will not be added
		set.add(2);
		System.out.println(set);
		
		
	}

}
