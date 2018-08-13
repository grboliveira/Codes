import java.math.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14159;
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        double area = areaCirculo(pi, raio);

        System.out.format("A=%.4f%n", area); //Precisão de 4 casas decimais
        scanner.close();
    }

    public static double areaCirculo(double pi, double raio) {
        return (double) pi * (Math.pow(raio, 2));
    }
}