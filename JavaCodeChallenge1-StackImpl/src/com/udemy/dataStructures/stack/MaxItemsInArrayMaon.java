package com.udemy.dataStructures.stack;

public class MaxItemsInArrayMaon {

	public static void main(String[] args) {

		MaxItemsInArray max = new MaxItemsInArray();
		max.pushItems(10);
		max.pushItems(50);
		max.pushItems(1);

		for (Integer i : max.getMainArray()) {
			if (i != 0)
				System.out.println(i);
		}
		System.out.println("max Array " + max.getMaxArray());

	}

}
