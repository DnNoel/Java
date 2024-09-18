package array;

import java.util.Arrays;

public class RotateArray {
	public static void rotate(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k <= 0) {
			return;
		}
		k = k % nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	private static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		rotate(nums, k);
//		System.out.print("TestCase 1 : ");
//		for (int num : nums) {
//			System.out.print(Arrays.toString(num) + " ");
//		}

		System.out.println("TestCase 1 : " + Arrays.toString(nums));

		int[] nums1 = { -1, -100, 3, 99 };
		int k1 = 2;
		rotate(nums1, k1);
		System.out.println("TestCase 2 : " + Arrays.toString(nums1));
	}
}