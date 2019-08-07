package javacoding.challenge;

public class StackImplChallenge {

	public static void main(String[] args) {
		Stack s = new Stack(7);
		for(int i = 0;i<7;i++) {
			s.push(i);
		}
 System.out.println("elements" + s.peek());
 System.out.println("elements" + s.pop());
	}

}
