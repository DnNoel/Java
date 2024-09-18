package array;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		int unique = 0;

		for (int num : nums) {
			unique ^= num;
		}

		return unique;
	}

	public static void main(String[] args) {
		SingleNumber solution = new SingleNumber();
		int[] nums = { 2, 2, 1 };
		int[] nums1 = { 4, 1, 2, 1, 2 };
		int[] nums2 = { 1 };
		System.out.println(solution.singleNumber(nums)); // Output: 1
		System.out.println(solution.singleNumber(nums1)); // Output: 4
		System.out.println(solution.singleNumber(nums2)); // Output: 1
	}
}