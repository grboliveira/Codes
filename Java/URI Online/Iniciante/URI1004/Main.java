/**
 * URI1004
 * @author Jorge Allan de Castro Oliveira
 * @version 1 08/2018
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.print("PROD = "+ produto(a, b) + "\n");
        scanner.close();
    }

    public static int produto(int a, int b) {
        return a * b;
    }
}