package org.paumard;

import java.util.function.Function;

public class MainComparator {

	public static void main(String[] args) {
		
		IComparator<Person> cmpAge = (p1, p2) -> p2.getAge() - p1.getAge();
		IComparator<Person> cmpFirstName = (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName());
		IComparator<Person> cmpLastName = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
		
		Function<Person, Integer> f1 = p-> p.getAge();
		Function<Person, String> f2 = p-> p.getLastName();
		Function<Person, String> f3 = p-> p.getFirstName();
		
		//Comparator<Person> cmpPerson = IComparator.comparing(p-> p.getAge());
		IComparator<Person> cmpPersonAge = IComparator.comparing(Person::getAge);
		IComparator<Person> cmpPersonLastName = IComparator.comparing(Person::getLastName);
		
		//Comparator<Person> cmp = cmpPersonAge.theComparing(cmpPersonLastName);
		
		IComparator<Person> cmp = IComparator.comparing(Person::getLastName)
				.thenComparing(Person::getFirstName)
				.thenComparing(Person::getAge);
	}

}
