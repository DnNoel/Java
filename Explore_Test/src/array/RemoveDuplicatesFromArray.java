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

/*
 * Explanation:
 * 
 * Method Definition:
 * 
 * removeDuplicates(int[] nums): Takes an unsorted array nums as input. Returns
 * the number of unique elements. Edge Case Handling:
 * 
 * If the array length is 0, return 0 since there are no elements to process.
 * Using HashSet to Track Unique Elements:
 * 
 * Create a HashSet called seen to keep track of elements that have already been
 * encountered. Initialize a pointer k to 0. This pointer will be used to place
 * unique elements in the array. Iterate Through the Array:
 * 
 * Use a for loop to iterate through each element in the array. If an element is
 * not in the seen set, add it to the set, place it at the k-th position in the
 * array, and increment k. Return Value:
 * 
 * After the loop completes, k gives the count of unique elements in the array.
 * Main Method:
 * 
 * Tests the removeDuplicates method with an example array. Prints the number of
 * unique elements. Prints the unique elements from the array. This approach
 * ensures that the array is modified in-place, and the relative order of the
 * elements is preserved. The HashSet helps in efficiently checking for
 * duplicates.
 * 
 */
