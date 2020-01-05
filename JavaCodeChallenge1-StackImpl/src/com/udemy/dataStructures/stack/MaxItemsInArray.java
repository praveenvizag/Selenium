package com.udemy.dataStructures.stack;

public class MaxItemsInArray {

	private int[] mainArray;
	private int[] maxArray;
	private int size;
	private int maxSize;

	public MaxItemsInArray() {
		this.mainArray = new int[10];
		this.maxArray = new int[1];
	}
	
	public void pushItems(int data) {
		
		if(this.size <= 10) {
			this.mainArray[this.size] = data;
			this.size++;
		}
		if(this.mainArray[1] == 0)  {
			this.maxArray[0] = data;
			++this.maxSize;
		} else {
			if(data > this.maxArray[0]) {
				this.maxArray[0] = data;
			}
		}
		
	}
	
	public int[] getMainArray() {
		return this.mainArray;
	}
	
	public int getMaxArray() {
		return this.maxArray[0];
	}

}
