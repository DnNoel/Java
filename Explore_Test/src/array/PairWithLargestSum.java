package array;

import java.util.Arrays;

public class PairWithLargestSum {
	public static void main(String[] args) {
        int[] arr = {12,34,50,70,30};
        int[] result = findPairWithLargestSum(arr);
        
        if (result != null) {
            System.out.println("Pair with the largest sum: " + Arrays.toString(result));
        } else {
            System.out.println("Array needs at least two elements.");
        }
    }
	
	public static int[] findPairWithLargestSum(int[] arr) {
        if (arr == null || arr.length < 2) {
            return null; // Not enough elements for a pair
        }
        
        // Sort the array in ascending order
        Arrays.sort(arr);
        
        // The pair with the largest sum will be the last two elements
        int n = arr.length;
        return new int[]{arr[n - 1], arr[n - 2]};
    }

}
