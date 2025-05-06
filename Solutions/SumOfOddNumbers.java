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
