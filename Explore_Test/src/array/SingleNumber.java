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

/*
 * Explanation:
 * 
 (1) a ⊕ a = 0
 (2) a ⊕ 0 = a
 (3) a ⊕ b ⊕ a = b ⊕ (a ⊕ a) = b ⊕ 0 = b
The variable unique is initialized to 0.
The for loop goes through each number in the array, XOR-ing it with unique.
After the loop, unique contains the number that appears only once.
The main method provides a sample input and demonstrates the usage of the singleNumber method
*/