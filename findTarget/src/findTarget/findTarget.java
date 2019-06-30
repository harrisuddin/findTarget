package findTarget;

import java.util.HashMap;

public class findTarget {
		
	/**
	 * 
	 * First time naive solution
	 * 
	 * @param numbers
	 * @param target
	 * @return
	 */
	public static boolean findTargetFromSum(int[] numbers, int target) {
		if (numbers == null || numbers.length == 0 ) {
			return false;
		} 
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				int num = numbers[i];
				if (i != j) {
					if (num + numbers[j] == target) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	/**
	 * 
	 * Improved solution with lower time-complexity of O(n)
	 * 
	 * @param numbers
	 * @param target
	 * @return
	 */
	public static boolean findTargetWithMap(int[] numbers, int target) {
		if (numbers == null || numbers.length == 0 ) {
			return false;
		}
		
		HashMap<Integer, Integer> numbersMap = new HashMap<>();

	    for (int i = 0; i < numbers.length; i++) {
	         int num = numbers[i];
	         /* 
	          * if the map contains the key (target - num) then return true
	          * if not then add the num to the map
	          * this allows you to search for the second number to add to num to find the target 
	          * without using a second for loop
	         */ 
	         if (numbersMap.containsKey(target - num))
	        	 return true;
	         numbersMap.put(num, i);
	    }
		return false; 
	}



	public static void main(String[] args) {
		
		int[] nums = {8, 5, 0, 1};
		int target = 6;
		if (findTargetWithMap(nums, target)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		

	}
}
