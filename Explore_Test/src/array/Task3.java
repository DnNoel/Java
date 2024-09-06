package array;

public class Task3 {
	public int solution(String S) {
		
		// Initialize the number of operations to zero
        int operations = 0;

        // Use a StringBuilder for efficient string manipulation
        StringBuilder sb = new StringBuilder(S);

        // Continue until the string is empty or contains no '1's
        while (sb.length() > 0 && sb.indexOf("1") != -1) {
            // If the last character is '0', remove it
            if (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            } else {
                // If the last character is '1', change it to '0'
                sb.setCharAt(sb.length() - 1, '0');
            }
            // Increment the operation count
            operations++;
        }

        // Return the total number of operations performed
        return operations;
    }
	
	public static void main(String[] args) {
        Task3 sol = new Task3();

        System.out.println(sol.solution("011100")); // return 7
        System.out.println(sol.solution("111"));    // should return 5
        System.out.println(sol.solution("1111010101111")); // should return 22


    }
}
