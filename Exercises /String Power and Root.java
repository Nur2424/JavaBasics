/*
You have two variables: "message" and "k" which contain user input.
	•	message is a string consisting of lowercase English letters.
	•	k is an integer with a value from -100000 to 100000.

Write code that will perform the following actions depending on the value of k:
	•	If k is positive, the solution should create a string that is the k-th power of the string message.
That is, the result will be a string where message is repeated k times.
	•	If k is negative, the solution should try to find the k-th root of the string message.
For this, the length of the string message must be divisible by |k|.
	•	If the string message has a structure such that the root can be found, the solution should create a string which is the k-th root.
Otherwise, the solution should create a string "NO SOLUTION".
	•	If k is zero, the function should return an empty string. 

The result should be stored as a new string in the variable result.
*/


import java.util.*;

public class Main {
    public static void main(String[] args) {
        var pair = readInput();
        String message = pair.getFirst();
        int k = pair.getSecond();
        String result = "";

        if (k > 0) {
            // If k is positive, repeat the message k times
            for (int i = 0; i < k; i++) {
                result += message;
            }
        } else if (k < 0) {
            // If k is negative, try to find the root of the string
            int absK = -k; // Get absolute value of k
            int len = message.length();

            // Check if message length can be divided evenly into absK parts
            if (len % absK != 0) {
                result = "NO SOLUTION";
            } else {
                int partLen = len / absK;
                String part = message.substring(0, partLen);

                // Rebuild message from the part and compare
                String rebuilt = "";
                for (int i = 0; i < absK; i++) {
                    rebuilt += part;
                }

                if (rebuilt.equals(message)) {
                    result = part;
                } else {
                    result = "NO SOLUTION";
                }
            }
        } else {
            // If k == 0, return empty string
            result = "";
        }

        System.out.println(result);
    }

    public static Pair<String, Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().trim().split(" \\| ");
        String message = input[0];
        int k = Integer.parseInt(input[1]);
        return new Pair<>(message, k);
    }
}

class Pair<F, S> {
    private final F first;
    private final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
