package a.sortingCollections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonAgeComparator implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {
		int p1Age = person1.getAge();
		int p2Age=person2.getAge();
		return p1Age>p2Age?-1:p1Age<p2Age?1:0;
	}

	public PersonAgeComparator() {
		super();
	}

	public static List<Person> sortFromYoungToOld(List<Person> listToSort) {
		minusAge(listToSort);
		PersonAgeComparatorPartB compareAge = new PersonAgeComparatorPartB();
		Collections.sort(listToSort, compareAge);
		minusAge(listToSort);
		return listToSort;
	}
	public static List<Person> minusAge(List<Person> listToReverse){
		for(int i=0; i<listToReverse.size();i++) {
			listToReverse.get(i).setAge(-listToReverse.get(i).getAge());
		}
		return listToReverse;
	}
}
