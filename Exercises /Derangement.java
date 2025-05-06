/* You have a variable n that contains user input.

n is a positive integer.

You have a positive integer n, representing the number of hats and the number of people. 
You need to determine the total number of ways to return the n hats to the n people such that 
no hat is returned to its original owner (i.e., no person receives their own hat). 

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = readInput();
        long result = countDerangements(n);
        System.out.println(result);
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of people/hats: ");
        return scanner.nextInt();
    }

    public static long countDerangements(int n) {
        if (n == 0) return 1;
        if (n == 1) return 0;

        long[] der = new long[n + 1];
        der[0] = 1;
        der[1] = 0;

        for (int i = 2; i <= n; i++) {
            der[i] = (i - 1) * (der[i - 1] + der[i - 2]);
        }

        return der[n];
    }
}

// -----------------------------------------NOTES-----------------------------------------------------

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = readInput();
        long result = countDerangements(n); // 	countDerangements(n) computes how many derangements are possible.
        System.out.println(result);
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of people/hats: ");
        return scanner.nextInt();
    }

    public static long countDerangements(int n) {                                                                        derangements using dynamic programming.
        /* 
        	•	This method calculates the number of derangements using dynamic programming.
	        •	It returns a long (instead of int) to support larger results.

        */
	                                                          
        if (n == 0) return 1;
        if (n == 1) return 0;

        long[] der = new long[n + 1];
        der[0] = 1;
        der[1] = 0;
       /* 
       	•	der[i] will store the number of derangements for i people.
	    •	Start by filling the first two known values.
        •   If you want to use index from 0 to n, then the array must have n + 1 places.

       */

        for (int i = 2; i <= n; i++) {
            der[i] = (i - 1) * (der[i - 1] + der[i - 2]);
        }
        /* 
        	•	This loop calculates derangements for i = 2 to n.
	        •	Formula:
                        !n = (n - 1) \cdot (!(n - 1) + !(n - 2))
	        •	This formula is efficient and avoids repeated calculations.
        */
        return der[n];
    }
}
