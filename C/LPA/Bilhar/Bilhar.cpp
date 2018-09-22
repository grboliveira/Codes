/**
  * PUC MINAS
  * @author Jorge Allan de Castro Oliveira
  * @version 1 08/2018
  * Calcula a distancia entre as bolas de sinuca em
  * uma mesa, ou seja, imprime na tela o numero da bola
  * cuja sua distancia até a bola branca é o menor valor
  */

#include <stdio.h>
#include <math.h>

int calc(int a, int b, int x, int y) {
    return sqrt(pow(a - x, 2) + pow(b - y, 2));
}

int main(int argc, char const *argv[]) {
    int c;
    int id = 0; // Identificador da bola
    int dist = 9999;
    int novaDist = 0;
    scanf("%d", &c);  // Quantidade de testes a ser executado

    while(c > 0) {
        int n; 
        scanf("%d", &n); // Quantidade de bolas em cada teste, com exceção da branca
        if(n > 0 && n < 51) {
            int a, b;
            scanf("%d %d", &a, &b); // Coordenadas da bola branca

            for(int i = 0; i < n; i++) {
                int x, y;
                scanf("%d %d", &x, &y); // Coordenadas das demais bolas do teste
                novaDist = calc(a, b, x, y);

                if((x > 0 && x < 1420) && (y > 0 && y < 2840) && (novaDist < dist)) {
                    dist = novaDist;
                    id = i + 1; // Não existe identificador de bola menor que 1
                }
            }
        }
        printf("%d\n", id);
        c = c - 1;
    }
    return 0;
}
