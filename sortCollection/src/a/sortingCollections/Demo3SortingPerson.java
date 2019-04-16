package a.sortingCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Demo3SortingPerson {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		list.add(new Person(101, "Avraham", 2));
		list.add(new Person(104, "Moshe", 30));
		list.add(new Person(102, "Shlomo", 5));
		list.add(new Person(103, "Baruch", 7));
		System.out.println(list);

		// The sort method accept comparable types only
		Collections.sort(list); // sort by natural order (id)
		System.out.println(list);

		// Sort according the name
		PersonNameComparator nameComparator = new PersonNameComparator();
		Collections.sort(list, nameComparator);
		System.out.println(list);

		// Sort according the age
		PersonAgeComparator ageComparator = new PersonAgeComparator();
		Collections.sort(list, ageComparator); // This sorts from the old to the young
		System.out.println(list);
		// Sorting from the young to the old:	
		PersonAgeComparator.sortFromYoungToOld(list);
		System.out.println(list);
	}

}
