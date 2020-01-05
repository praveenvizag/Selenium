package com.udemy.dataStructures.stack;

public class QueueImplWithStack {
	private java.util.Stack<Integer> enqueStack;
	private java.util.Stack<Integer> dequeStack;

	public QueueImplWithStack() {
		this.enqueStack = new java.util.Stack<Integer>();	
		this.dequeStack = new java.util.Stack<Integer>();
	}

	public void enque(Integer data) {
		this.enqueStack.push(data);
		
	}
	public int deque() {
		if(this.dequeStack.isEmpty() && this.enqueStack.isEmpty())  {
			throw new RuntimeException("Stacks are empty");
		}
		if(dequeStack.isEmpty()) {
			while(!enqueStack.isEmpty()) {
				this.dequeStack.push(this.enqueStack.pop());
			}
			
		}
		return this.dequeStack.pop();
	}
}
