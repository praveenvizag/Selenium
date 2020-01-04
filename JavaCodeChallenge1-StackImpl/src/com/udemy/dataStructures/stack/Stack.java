package com.udemy.dataStructures.stack;

public class Stack<T extends Comparable<T>> {
	
	private Node<T> rootNode;
	private int size;
	
	public void push(T data) {
		++this.size;
		if(this.rootNode == null) {
			this.rootNode = new Node<T>(data);
		} else {
			Node<T> newNode = new Node<T>(data);
			newNode.setNextNode(this.rootNode);
			this.rootNode = newNode;
		}
		
	}
	
	public T pop() {
		--this.size;
		T data = this.rootNode.getData();
		this.rootNode =  this.rootNode.getNextNode();
		return data;
	}
	
	public T peek() {
		T data = this.rootNode.getData();
		return data;
		
	}
	public int getSize() {
		return this.size;
	}

}
