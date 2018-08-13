import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int soma = soma(a, b);

        System.out.print("SOMA = " + soma + "\n");
        scanner.close();
    }

    public static int soma(int a, int b) {
        return a + b;
    }
}