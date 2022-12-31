package org.paumard;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public Person() {}
	
	public Person(String firstNane, String lastName, int age) {
		this.firstName = firstNane;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + '}';
	}
}
