package array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task1 {
		public int calculateBalance(int[] A, String[] D) {
			int balance = 0;
	        int monthlyFee = 5;
	        
	        // Map to store the number of transactions and total spending per month
	        Map<String, int[]> monthlyCardData = new HashMap<>();
	        // Set to keep track of all months involved
	        Set<String> allMonths = new HashSet<>();

	        // Loop through each transaction
	        for (int i = 0; i < A.length; i++) {
	            // Extract the month and year from the date string
	            String monthYear = D[i].substring(0, 7);
	            int amount = A[i];

	            // Update balance with the transaction amount
	            balance += amount;

	            // If the transaction is a spending (negative amount)
	            if (amount < 0) {
	                // Update the map with the number of transactions and total spending for the month
	                monthlyCardData.compute(monthYear, (key, value) -> {
	                    if (value == null) {
	                        return new int[]{1, -amount}; // First transaction for the month
	                    } else {
	                        value[0]++; // Increment the number of transactions
	                        value[1] -= amount; // Add the spending amount
	                        return value;
	                    }
	                });
	            }

	            // Add the month to the set of all months
	            allMonths.add(monthYear);
	        }

	        // Add all months of the year 2020 to ensure we have all months from January to December
	        for (int month = 1; month <= 12; month++) {
	            allMonths.add(String.format("2020-%02d", month));
	        }

	        // Loop through all the months to check for monthly fees
	        for (String monthYear : allMonths) {
	            // Get the data for the month or default to zero transactions and zero spending
	            int[] data = monthlyCardData.getOrDefault(monthYear, new int[]{0, 0});
	            int numTransactions = data[0];
	            int totalSpending = data[1];

	            // If the spending is less than 100 or the number of transactions is less than 3, apply the monthly fee
	            if (totalSpending < 100 || numTransactions < 3) {
	                balance -= monthlyFee;
	            }
	        }

	        // Return the final balance
	        return balance;
	    }

	    public static void main(String[] args) {
	    	Task1 sol = new Task1();
	        
	        int[] A1 = {100, 100, 100, -10};
	        String[] D1 = {"2020-12-31", "2020-12-22", "2020-12-03", "2020-12-29"};
	        System.out.println(sol.calculateBalance(A1, D1)); // Expected output: 230

	        int[] A2 = {180, -50, -25, -25};
	        String[] D2 = {"2020-01-01", "2020-01-01", "2020-01-01", "2020-01-31"};
	        System.out.println(sol.calculateBalance(A2, D2)); // Expected output: 25

	        int[] A3 = {1, -1, 0, -105, 1};
	        String[] D3 = {"2020-12-31", "2020-04-04", "2020-04-04", "2020-04-14", "2020-07-12"};
	        System.out.println(sol.calculateBalance(A3, D3)); // Expected output: -164

	        int[] A4 = {100, 100, -10, -20, -30};
	        String[] D4 = {"2020-01-01", "2020-02-01", "2020-02-11", "2020-02-05", "2020-02-08"};
	        System.out.println(sol.calculateBalance(A4, D4)); // Expected output: 80

	        int[] A5 = {-60, 60, -40, -20};
	        String[] D5 = {"2020-10-01", "2020-02-02", "2020-10-10", "2020-10-30"};
	        System.out.println(sol.calculateBalance(A5, D5)); // Expected output: -115
	    }    

}
