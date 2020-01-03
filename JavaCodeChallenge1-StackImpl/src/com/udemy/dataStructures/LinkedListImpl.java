package com.udemy.dataStructures;

public class LinkedListImpl<T extends Comparable<T>> implements List<T> {
	
	private Node<T> rootNode;
	private int sizeOflist;

	@Override
	public void insert(T data) {
		++this.sizeOflist;
		if(rootNode == null) {
			rootNode = new Node<T>(data);
		} else {
			insertDataAtBeginning(data);
		}
		
	}

	private void insertDataAtBeginning(T data) {
		Node<T> node = new Node<T>(data);
		node.setNextNode(rootNode);
		this.rootNode = node;
	}
	
	private void insertDataAtEnd(Node<T> node , T data) {
		if(node.getNextNode() != null) {
			insertDataAtEnd(node.getNextNode(), data);
		} else {
			Node<T> lastNode = new Node<T>(data);
			node.setNextNode(lastNode);
		}
	}

	@Override
	public void remove(T data) {
		if(this.rootNode == null) return;
		--this.sizeOflist;
		if(this.rootNode.data.compareTo(data) == 0) {
			this.rootNode = this.rootNode.getNextNode();
		} else {
			remove(data,this.rootNode,this.rootNode.getNextNode());
		}
		
	}

	private void remove(T data, Node<T> previousNode, Node<T> actualNode) {
		while(actualNode != null) {
			if(actualNode.getData().compareTo(data)==0) {
				previousNode.setNextNode(actualNode.getNextNode());
				actualNode = null;
				return;
			}
			previousNode = actualNode;
			actualNode=actualNode.getNextNode();
		}
		
	}

	@Override
	public void traverseList() {
		if(this.rootNode == null) return;
		Node<T> actualNode = this.rootNode;
		while(actualNode != null) {
			System.out.print("-> " + actualNode);
			actualNode = actualNode.getNextNode();
		}
	}

	@Override
	public int size() {
		return this.sizeOflist;
	}

}
