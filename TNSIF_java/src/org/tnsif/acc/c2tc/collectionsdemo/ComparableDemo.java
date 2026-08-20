package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.ArrayList;
import java.util.Collections;

class Person6 implements Comparable<Person6>
{
	
	String name;
	int age;
	
	Person6(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	void display()
	{
		System.out.println("Name:" + name + " Age : " + age );
	}
	

	@Override
	public int compareTo(Person6 other) {
		// TODO Auto-generated method stub
		return this.name.compareTo(other.name);
	}
	
}

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Person6>people = new ArrayList<>();
		people.add(new Person6("A",54));
		people.add(new Person6("B",34));
		
		Collections.sort(people);
		
		for(Person6 person:people)
		{
			person.display();
		}
		
		
		// TODO Auto-generated method stub

	}

}
