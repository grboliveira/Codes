/*TP02Q06 Palíndromo em C
 *@author Jorge Oliveira
 *Este algoritmo examina se a palavra continua idêntica caso
 *inverta a posição de todas as letras desta mesma palavra
 */

#define true 1
#define false 0

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int encerramento(char* palavra);
int isPalindromo(int i, char palavra[]);

/**
 * Executa leitura da entrada padrão e escreve a sáida
 */
int main(int argc, char const *argv[]) {
	char (palavra[1000])[80];
	int num = 0;
	int condicao = 0;
	do {
		scanf(" %[^\n]s",palavra[num]);
		condicao = encerramento(palavra[num]);
		num++;
	} while(condicao != true);
	num--;

	for (int i = 0; i < num; i++) {
		int resultado = isPalindromo(0, palavra[i]);
		if(resultado == true) {
            printf("SIM\n");
		} else {
			printf("NAO\n");
		}
	}     
	return 0;
}

/**
 * Verifica se as letras da primeira metade corresponde com as da segunda metade
 */
int isPalindromo(int i, char palavra[]) {
	if(i == strlen(palavra) - 1) {
		return true;
	}
	else if(palavra[i] != palavra[strlen(palavra) - 1 - i]) {
		return false;
	}
	return isPalindromo(i + 1, palavra);
}

/**
 * Analisa as letras da entrada para verificar se é o fim do arquivo
 */
int encerramento(char* palavra) {
	int condicao = strcmp(palavra,"FIM");

	if(!condicao) {
		return true;
	}
	else {
		return false;
	}
}	