package a.sortingCollections;

import java.util.Comparator;
//comarator defines other order - outside the class
public class PersonNameComparator implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {
		//We can use the natural sort of the class String
		return person1.getName().compareTo(person2.getName());
	}

	public PersonNameComparator() {
		super();
	}
	
	

}
