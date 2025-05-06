/*

You have a variable n that contains user input.

n always contains an odd number.

Write code that returns the sum of all odd numbers up to n (inclusive) and stores the result in the variable result.

For example:

If n = 3, then 1 + 3 = 4
If n = 5, then 1 + 3 + 5 = 9
If n = 7, then 1 + 3 + 5 + 7 = 16
And so on.

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = readInput();
        int result = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { 
                result += i;
            }    
        }
        System.out.println(result);
    }

    public static int readInput() {
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            n = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return n;
    }
}
