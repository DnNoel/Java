package array;

public class PairDigitSumEqual {
	public static void main(String[] args) {
		int[] arr = {12, 34, 50, 70, 30};
        int largest1 = 0;
        int largest2 = 0;
        
        // Iterate over the array to find pairs with equal digit sums
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (digitSum(arr[i]) == digitSum(arr[j])) {
                    // Check if this pair is larger than the currently tracked largest pair
                    if (arr[i] + arr[j] > largest1 + largest2) {
                        largest1 = arr[i];
                        largest2 = arr[j];
                    }
                }
            }
        }
        
        if (largest1 != 0 && largest2 != 0) {
            System.out.println(largest1 + " and " + largest2 + " have the largest equal digit sums.");
        } else {
            System.out.println("No pairs found with equal digit sums.");
        }
    }

    // Function to calculate the sum of digits of a number
    public static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // Get the last digit
            num /= 10;       // Remove the last digit
        }
        return sum;
    }

}
