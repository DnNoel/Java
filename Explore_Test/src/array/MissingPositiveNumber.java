package array;

import java.util.HashSet;

public class MissingPositiveNumber {
	public int solution(int[] A) {
        // Step 1: Create a set to hold all positive numbers in the array
		HashSet<Integer> positiveNumbers = new HashSet<>();
        
        // Step 2: Populate the set with positive numbers from the array
        for (int number : A) {
            if (number > 0) {
                positiveNumbers.add(number);
            }
        }
        
        // Step 3: Find the smallest positive integer missing from the set
        int smallestMissingPositive = 1;
        while (positiveNumbers.contains(smallestMissingPositive)) {
            smallestMissingPositive++;
        }
        
        // Step 4: Return the result
        return smallestMissingPositive;
    }

}
