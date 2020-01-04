package com.udemy.dataStructures.doubleLinkedList;

public class Node<T extends Comparable<T>> {
	private T data;
	private Node<T> prevNode;
	private Node<T> nextNode;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getPrevNode() {
		return prevNode;
	}

	public void setPrevNode(Node<T> prevNode) {
		this.prevNode = prevNode;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	public Node(T data , Node<T> head,Node<T> tail) {
		super();
		this.data = data;
		this.nextNode = head;
		this.prevNode = tail;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Node [data=");
		builder.append(data);
		builder.append(", prevNode=");
		builder.append(prevNode);
		builder.append(", nextNode=");
		builder.append(nextNode);
		builder.append("]");
		return builder.toString();
	}

	

}
