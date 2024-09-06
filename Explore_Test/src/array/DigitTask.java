package array;

import java.util.ArrayList;
import java.util.List;

public class DigitTask {

	public static void main(String[] args) {
        int[] arr = {12,34,50,70,30};
        List<int[]> result = findPairsWithSameDigitSum(arr);
        
        if (!result.isEmpty()) {
            for (int[] pair : result) {
                System.out.println("Pair: [" + pair[0] + ", " + pair[1] + "]");
            }
        } else {
            System.out.println("No pairs found with the same digit sum.");
        }
    }

    public static List<int[]> findPairsWithSameDigitSum(int[] arr) {
        List<int[]> pairs = new ArrayList<>();
        
        // Iterate over all pairs
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (digitSum(arr[i]) + digitSum(arr[j]) == digitSum(arr[i] + arr[j])) {
                    pairs.add(new int[]{arr[i], arr[j]});
                }
            }
        }
        
        return pairs;
    }
    
    // Helper method to calculate the sum of digits of a number
    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
