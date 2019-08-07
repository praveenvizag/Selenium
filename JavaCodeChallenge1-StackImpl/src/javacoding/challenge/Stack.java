package javacoding.challenge;

public class Stack {
	
	private int capacity ;
	private int elements[];
	private int top;
	
	public Stack(int capacity) {
		super();
		this.capacity = capacity;
		this.elements = new int[this.capacity];
		this.top = -1;
	}
	
	public void push(int item){
		elements[++top] = item;
	}
	
	public int pop() {
		return elements[top--];
	}
   public int peek() {
	return elements[top];
   }

   public int[] getElements() {
	return elements;
   }
 
 
}
