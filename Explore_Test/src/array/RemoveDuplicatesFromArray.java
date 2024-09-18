package array;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int i = 0;
		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j];
			}
		}

		return i + 1;
	}

	public static void main(String[] args) {

		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int k = removeDuplicates(nums);
		System.out.println("Number of unique elements: " + k);
		// int[] uniqueElementsArray = Arrays.copyOf(nums, k);
		// System.out.println("Array with unique elements: " +
		// Arrays.toString(uniqueElementsArray));

		String[] result = new String[nums.length];
		for (int i = 0; i < k; i++) {
			result[i] = String.valueOf(nums[i]);
		}
		for (int i = k; i < nums.length; i++) {
			result[i] = "_";
		}

		System.out.println("Array with unique elements: " + Arrays.toString(result));
	}

}
