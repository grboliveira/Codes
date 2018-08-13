import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int prod = produto(a, b);

        System.out.print("PROD = "+ prod + "\n");
        scanner.close();
    }

    public static int produto(int a, int b) {
        return a * b;
    }
}