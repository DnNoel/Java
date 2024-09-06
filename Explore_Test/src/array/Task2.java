package array;

public class Task2 {
	public String solution(String message, int K) {				
		// If K is less than 3, return "..." because there's not enough space for any words
        if (K < 3) {
            return "...";
        }

        // If the entire message fits within K characters, return the message as is
        if (message.length() <= K) {
            return message;
        }

        // Split the message into words
        String[] words = message.split(" ");
        StringBuilder notification = new StringBuilder();

        // Iterate through each word
        for (String word : words) {
            // Check if adding the next word would exceed the limit (considering the ellipsis " ...")
            if (notification.length() + word.length() + 4 > K) {
                break;
            }
            // Add a space if the notification already has some content
            if (notification.length() > 0) {
                notification.append(" ");
            }
            // Append the word to the notification
            notification.append(word);
        }

        // If no words could be added, return "..."
        if (notification.length() == 0) {
            return "...";
        }

        // Check if the current length plus the ellipsis exceeds K
        if (notification.length() + 4 > K) {
            // If it does, trim words until the length fits within the limit
            while (notification.length() + 4 > K) {
                int lastSpaceIndex = notification.lastIndexOf(" ");
                // If no space is found, return "..." (shouldn't happen due to the previous checks)
                if (lastSpaceIndex == -1) {
                    return "...";
                }
                // Delete the last word
                notification.delete(lastSpaceIndex, notification.length());
            }
            // Append the ellipsis after trimming
            notification.append(" ...");
        } else {
            // If it fits, simply append the ellipsis
            notification.append(" ...");
        }

        // Return the final notification
        return notification.toString();
    }

	public static void main(String[] args) {
        Task2 solution = new Task2();

        System.out.println(solution.solution("And now here is my secret", 15)); //  return "And now ..."
        System.out.println(solution.solution("There is an animal with four legs", 15)); //  return "There is an ..."
        System.out.println(solution.solution("super dog", 4)); //  return "..."
        System.out.println(solution.solution("how are you", 20)); //  return "how are you"
    }
	
}
