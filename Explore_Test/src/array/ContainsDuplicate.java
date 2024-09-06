package array;

import java.util.HashSet;

public class ContainsDuplicate {
	public static boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int num : nums) {
			if (!set.add(num)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3, 1 };
		int[] nums2 = { 1, 2, 3, 4 };
		int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

		System.out.println(containsDuplicate(nums1)); // true
		System.out.println(containsDuplicate(nums2)); // false
		System.out.println(containsDuplicate(nums3)); // true
	}
}
/*
 * Explanation:
 * 
 *
 * Imports and Class Declaration:
 * 
 * Import HashSet from the java.util package. Declare a public class
 * ContainsDuplicate.
 * 
 * containsDuplicate Method:
 * 
 * This method takes an integer array nums as input. Use a HashSet to track the
 * numbers we have seen. Iterate through each number in the array: If the number
 * cannot be added to the set (because it is already present), then return true.
 * If all numbers are added successfully (meaning no duplicates), return false.
 * 
 * main Method:
 * 
 * Test the containsDuplicate method with different arrays and print the
 * results.
 * 
 * This solution leverages the properties of a HashSet to check for duplicates
 * efficiently. The time complexity is O(n), where n is the number of elements
 * in the array, as adding an element to a HashSet and checking for its presence
 * both have an average time complexity of O(1).
 */