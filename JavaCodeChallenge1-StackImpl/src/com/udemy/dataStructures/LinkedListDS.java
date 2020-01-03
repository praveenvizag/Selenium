package com.udemy.dataStructures;


public class LinkedListDS {

	public static void main(String[] args) {
		/*
		 * List<Integer> list = new LinkedListImpl<Integer>(); list.insert(10);
		 * list.insert(20); list.insert(-40); list.insert(100); list.insert(200);
		 * list.insert(300); list.insert(400); list.traverseList(); list.remove(10);
		 */
		
		List<Person> list = new LinkedListImpl<Person>();
		list.insert(new Person(10, "KID"));
		list.insert(new Person(20, "TEEN"));
		list.insert(new Person(30, "ADULT"));
		list.insert(new Person(40, "RESPONSIBLE"));
		list.insert(new Person(50, "CARE"));
		list.insert(new Person(60, "OLD"));
		list.insert(new Person(70, "ABOUT TO EXPIRE"));
		list.traverseList();
		
	}

}
