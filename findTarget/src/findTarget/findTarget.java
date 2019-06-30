package findTarget;

public class findTarget {
	
	
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



	public static void main(String[] args) {
		
		int[] nums = {0, 5, 0, 4};
		int target = 6;
		if (findTargetFromSum(nums, target)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		

	}
}
