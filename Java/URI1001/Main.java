import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = soma(a, b);

        System.out.print("X = " + x + "\n");
        scanner.close();
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}