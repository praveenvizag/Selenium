package com.udemy.dataStructures.stack;

public class MaxtemsInStack {
	private java.util.Stack<Integer> mainStack;
	private java.util.Stack<Integer> maxStack;

	public MaxtemsInStack() {
		this.mainStack = new java.util.Stack<Integer>();
		this.maxStack = new java.util.Stack<Integer>();
	}
	
	public void push(int item) {
		mainStack.push(item);
		if(mainStack.size() == 1) {
			mainStack.push(item);
			return;
		}
		if(item>maxStack.peek()) {
			this.maxStack.push(item);
			
		} else {
			this.maxStack.push(maxStack.peek());
		}
		
	}
	
	public void pop() {
		mainStack.pop();
		maxStack.pop();
	}
	
	public int getMax() {
		return maxStack.peek();
	}

}
