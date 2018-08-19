/**
  * PUC MINAS
  * @author Jorge Allan de Castro Oliveira
  * @version 1 08/2018
  * Calcula a distancia entre as bolas de sinuca em
  * uma mesa, ou seja, imprime na tela o numero da bola
  * cuja sua distancia até a bola branca é o menor valor
  */

import java.math.*;
import java.util.Scanner;

class Bilhar {
    public static void main(String[] args) {
        int id = 0;
        double dist = 999999;
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt(); // Quantidade de testes a ser executado

        while(c > 0) {
            int n = scanner.nextInt(); // Quantidade de bolas em cada teste, com exceção da branca

            if(n > 0 && n < 51) { 
                int a = scanner.nextInt(); 
                int b = scanner.nextInt();
                int x, y;

                for(int i = 0; i < n; i++) {
                    x = scanner.nextInt();
                    y = scanner.nextInt();

                    if((x > 0 && x < 1420) && (y > 0 && y < 2840) && (calc(a, b, x, y) < dist)) {
                        dist = calc(a, b, x, y);
                        id = i + 1;
                    }
                }
            }
            System.out.println(id);
            c--;
        }
        scanner.close();
    }

  	/**
   	 * Calcula a distancia entre dois pontos
     * @param a Abcissa do ponto referente a bola branca
     * @param b Ordenada do ponto referente a bola branca
     * @param x Abcissa do ponto referente a bola de teste
     * @param y Ordenada do ponto referente a pola de teste
     */
    public static double calc(int a, int b, int x, int y) {
        return Math.sqrt(Math.pow((a - x),2) + Math.pow((b - y), 2));
    }
}