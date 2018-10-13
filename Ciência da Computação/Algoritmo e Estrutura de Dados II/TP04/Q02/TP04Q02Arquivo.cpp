/**
 * TP04Q02 - Arquivo
 * @author Jorge Allan de Castro Oliveira
 * @version 1 03/2017
 */

#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	int contador = 0;
	int tamanho; //Variável para armazenar o número de leituras da entrada padrão
	double num; //Variável para armazenar números reais da entrada padrão

	scanf("%i",&tamanho); //Número correspondente a quantidade de valores da entrada
	contador = tamanho;

	FILE *arquivo = fopen("inverso.txt", "w"); //Arquivo que será escrito os valores

	while(contador > 0) {
		scanf("%lf", &num); //Leitura de um valor tipo double da entrada padrão
		fwrite(&num, sizeof(double), 1, arquivo);
		contador--;
	}

	fclose(arquivo); //Encerramento do arquivo
	arquivo = fopen("inverso.txt", "r"); //Arquivo que será escrito os valores
	tamanho = (tamanho * 8) * (-1);
	int inicio = -8;

	while(inicio >= tamanho) {	
		fseek(arquivo, inicio, SEEK_END);
		fread(&num, sizeof(double), 1, arquivo);
			if(num - (int)num == 0)printf("%d \n",(int)num); //Conversão para int
			else printf("%0g \n", num); //Imprime o número no arquivo
			inicio = inicio - 8;
	}

	fclose(arquivo); //Encerramento do arquivo
	return 0; //Sem retorno
}