package com.udemy.dataStructures;

public class Node<T extends Comparable<T>> {
	public T data;
	public Node<T> nextNode;
	public Node(T data) {
		this.data = data;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<T> node) {
		this.nextNode = node;
	}
	@Override
	public String toString() {
		
		return this.data.toString();
	}
	
	
	

}
