/* PUC MINAS
 * Jorge Allan de Castro Oliveira
 * 08/2018
 * Encontra na matriz o sub-retangulo cuja a
 * soma de seus elementos é a maior possível.
 */

#include <stdio.h>
#include <stdlib.h>
#define MAX 100

/*
Imprime o maior numero apos percorrer todos os
sub-retangulos da matriz e somar os seus elementos.
 */
void somaSubRet(int tam, int matriz[MAX][MAX]) {
	int i, j, k, l, m, n;

	int soma = 0;
	int maior = 0;

	for(i = 0; i < tam; i++) {
		for(j = 0; j < tam; j++) {
			for(k = 0; k < tam; k++) {
				for(l = 0; l < tam; l++) {
					for (m = i; m <= k; m++) {
						for (n = j; n <= l; n++) {
							soma = soma + matriz[m][n];
						}
					}
					//printf("%d\n",soma);
					if(soma > maior) {
						maior = soma;
					   //printf("%d\n",maior);
					}
					soma = 0;
				}		
			}
		}
	}
	printf("%d\n",maior);
}

/*
Inicializa uma matriz bidimensional e realiza a leitura
do arquivo para preencher as posicoes com os valores.
 */
void criaMatriz(int tam) {
	int i,j;
	int matriz[MAX][MAX];

	for(i = 0; i < tam; i++) {
		for(j = 0; j < tam; j++) {
			scanf(" %d", &matriz[i][j]);
		}
	}
	somaSubRet(tam, matriz);
}

/*
Metodo principal le o primeiro valor do
arquivo referente ao tamanho da matriz.
 */
int main(int argc, char *argv[]) {
	int tam;
	scanf(" %d\n",&tam);
	criaMatriz(tam);

	return(0);	
}