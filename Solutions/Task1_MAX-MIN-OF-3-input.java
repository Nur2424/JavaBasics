import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x1, x2, x3;
        String result = "";

        int[] inputValues = readInput();
        x1 = inputValues[0];
        x2 = inputValues[1];
        x3 = inputValues[2];
        
        int min = Math.min(x1, Math.min(x2, x3));
        int max = Math.max(x1, Math.max(x2, x3));
        
        result = "минимальное: " + min +", максимальное: " + max;

        System.out.println(result);
    }

    public static int[] readInput() {
        int[] inputValues = new int[3];

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            for (int i = 0; i < 3; i++) {
                inputValues[i] = Integer.parseInt(values[i]);
            }
        }
        scanner.close();

        return inputValues;
    }
}
