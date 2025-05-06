/*
Task Description:

You have a variable message that contains user input data.
Write code that, depending on the length of the string message, writes a corresponding number of * characters into the variable result.
Important: Your code should work correctly with both Cyrillic and Latin characters.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String message = readInput();
        StringBuilder result = new StringBuilder();
        
        // Добавляем по одной * за каждый символ в message
        for (int i = 0; i < message.length(); i++) {
            result.append("*");
        }
        System.out.println(result.toString());
    }

    public static String readInput() {
        String message = "";

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            message = scanner.nextLine();
        }
        scanner.close();

        return message;
    }
}
