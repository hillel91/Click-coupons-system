package a.sortingCollections;

import java.util.Comparator;

public class PersonAgeComparatorPartB implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {
		int p1Age = person1.getAge();
		int p2Age=person2.getAge();
		return p1Age>p2Age?-1:p1Age<p2Age?1:0;
	}

	public PersonAgeComparatorPartB() {
		super();
	}

}
