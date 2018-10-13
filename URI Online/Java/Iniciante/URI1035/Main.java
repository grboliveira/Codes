/**
 * URI1035 - Teste de Seleção 1
 * @author Jorge Allan de Castro Oliveira
 * @version 1 08/2018
 */

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String linha = scanner.nextLine(); //nextLine pega a linha completa enquanto o next pega apenas um valor da linha de cada vez

        String [] array = linha.trim().split(" ");

        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        int c = Integer.parseInt(array[2]);
        int d = Integer.parseInt(array[3]);

        if(b > c && d > a && ((c + d) > (a + b)) &&  (c > 0 && d > 0) && a % 2 == 0) {
            System.out.print("Valores aceitos\n");
        } else {
            System.out.print("Valores nao aceitos\n");
        }

        scanner.close();
    }
}