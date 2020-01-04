package com.udemy.dataStructures.stack;

public class Node<T extends Comparable<T>> {

	private T data;
	private Node<T> nextNode;

	public Node(T data) {
		super();
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

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Node [data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}

}
