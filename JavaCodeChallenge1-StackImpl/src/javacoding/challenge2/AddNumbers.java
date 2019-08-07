package javacoding.challenge2;

import java.util.HashMap;
import java.util.Map;

public class AddNumbers {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4};
		int target = 7;
	int[] twoSums = getTwoSums(arr, target);
	System.out.println(twoSums[0] + " " + twoSums[1]);

	}
	
	public static int[] getTwoSums(int numbers[],int target ) {
		Map <Integer,Integer> visitedNumber = new HashMap<Integer, Integer>();
		for(int i=0;i< numbers.length;i++) {
			int delta = target - numbers[i];
			if(visitedNumber.containsKey(delta)) {
				return new int[] {i,visitedNumber.get(delta)};
			}
			visitedNumber.put(numbers[i], i);
		}
		return new int[] {-1, -1};
		
	}

}
