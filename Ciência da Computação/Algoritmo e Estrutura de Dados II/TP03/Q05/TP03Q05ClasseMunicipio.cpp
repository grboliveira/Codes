/**
 * TP03Q05 - Municipio em C
 * @author Jorge Allan de Castro Oliveira
 * @version 1 06/2017
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <malloc.h>
#include <err.h>

/**
 * Este método quebra a linha e armazena dados em um array.
 * Feito com ajuda e baseado no método feito pela aluna Stefany.
 */
char** split(char* entrada) {
        char** array = (char**) malloc(16*sizeof(char*));
        char *tmp; 
        tmp = strtok(entrada, "\t\r\n\f\v"); //Separa o conjunto de caracteres pelos delimitadores                             
        int i = 0;
        while(tmp) {
                array[i] = (char*) malloc(sizeof(char*));
                array[i] = tmp;                                    
                tmp = strtok('\0', "\t\r\n\f\v"); //Separa o conjunto de caracteres pelos delimitadores                                        
                i++;                                                                                  
        }                                                                                             
        return array;                                                                                
}

/**
 * Este método quebra os dados da entrada padrão em um array.
 * Feito com ajuda e baseado no método feito pela aluna Stefany.
 */
char** splitIn(char* entrada) {
        char** array = (char**) malloc(16*sizeof(char*));
        char *tmp;
        tmp = strtok(entrada, " "); //Separa o conjunto de caracteres pelos delimitadores
        int i = 0;
        while(tmp) {
                array[i] = (char*) malloc(sizeof(char*));                                     
                array[i] = tmp;                                                    
                tmp = strtok('\0', " "); //Separa o conjunto de caracteres pelos delimitadores
                i++;
        }
        return array;
}      

typedef struct Municipio {
    int id;
    char nome[100];
    char uf[4];
    int codigoUf;
    int populacao;
    char regiao[100];
    int numeroFuncionarios;
    int numeroComissados;
    char escolaridade[100];
    int atualizacaoPlano;
    char estagio[100];
    int atualizacaoCadastro;
    char consorcio[25];
}Municipio;

int n;
Municipio municipio[5800];
Municipio arr[200];


void start() {
    n = 0;
}

int isVazio(char entrada[]) {
    int resp = 0;
    char linha[] = " -";
    char emp[] = " ";
    
    if(strcmp(entrada, emp) == 0) {
        resp = 1;
    } else {
        if(strcmp(entrada, linha) == 0) {
            resp = 1;
        }
    }
    return resp;
}

void ler() {
    char arraytmp[2000];
    char cmp[2000];

    int i = 0;
    int num;

    FILE *arquivo = fopen("/tmp/variaveisexternas.txt","r");

    if(arquivo != NULL) {
        while(fgets(arraytmp, sizeof(arraytmp), arquivo) != NULL) {
            char **frase = split(arraytmp);
            strcpy(cmp, frase[0]);

            if(isVazio(cmp) == 1) {
                municipio[i].id = 0;
            } else {
                num = atoi(frase[0]);
                municipio[i].id = num;
            }

            strcpy(municipio[i].nome, frase[4]);
            strcpy(municipio[i].uf, frase[3]);

            strcpy(cmp, frase[2]);

            if(isVazio(cmp) == 1) {
                municipio[i].codigoUf = 0;
            } else {
                num = atoi(frase[2]);
                municipio[i].codigoUf = num;
            }

            strcpy(cmp, frase[6]);

            if(isVazio(cmp) == 1) {
                municipio[i].populacao = 0;
            } else {
                num = atoi(frase[6]);
                municipio[i].populacao = num;
            }

            strcpy(municipio[i].regiao, frase[1]);
            i++;
        }
    }

    i = 0;
    arquivo = fopen("/tmp/recursoshumanos.txt", "r");

    if(arquivo != NULL) {
        while(fgets(arraytmp, sizeof(arraytmp), arquivo) != NULL) {
            char **frase = split(arraytmp);

            strcpy(cmp, frase[4]);

            if(isVazio(cmp) == 1) {
                municipio[i].numeroFuncionarios = 0;
            } else {
                num = atoi(frase[4]);
                municipio[i].numeroFuncionarios = num;
            }

            strcpy(cmp, frase[7]);

            if(isVazio(cmp) == 1) {
                municipio[i].numeroComissados = 0;
            } else {
                num = atoi(frase[7]);
                municipio[i].numeroComissados = num;
            }
            i++;
        }
    }

    i = 0;
    arquivo = fopen("/tmp/planejamentourbano.txt","r");

    if(arquivo != NULL) {
        while(fgets(arraytmp, sizeof(arraytmp), arquivo) != NULL) {
            char **frase = split(arraytmp);

            strcpy(municipio[i].escolaridade, frase[5]);
            strcpy(cmp, frase[8]);

            if(isVazio(cmp)) {
                municipio[i].atualizacaoPlano = 0;
            } else {
                num = atoi(frase[8]);
                municipio[i].atualizacaoPlano = num;
            }
            i++;
        }
    }

    fclose(arquivo);

    i = 0;
    arquivo = fopen("/tmp/gestaoambiental.txt","r");

    if(arquivo != NULL) {

        while(fgets(arraytmp, sizeof(arraytmp), arquivo) != NULL) {
            char **frase = split(arraytmp);

            strcpy(municipio[i].estagio, frase[7]);
            i++;
        }
    }

    fclose(arquivo);

    i = 0;
    arquivo = fopen("/tmp/recursosparagestao.txt","r");

    if(arquivo != NULL) {

        while(fgets(arraytmp, sizeof(arraytmp), arquivo) != NULL) {
            char **frase = split(arraytmp);

            strcpy(cmp, frase[6]);

            if(isVazio(cmp)) {
                municipio[i].atualizacaoCadastro = 0;
            } else {
                num = atoi(frase[6]);
                municipio[i].atualizacaoCadastro = num;
            }
            i++;
        }
    }

    fclose(arquivo);

    i = 0;
    arquivo = fopen("/tmp/articulacaoointerinstitucional.txt","r");

    if(arquivo != NULL) {

        while(fgets(arraytmp, sizeof(arraytmp), arquivo) != NULL) {
            char **frase = split(arraytmp);

            if(frase[5][0] == 'S' && frase[5][1] == 'i' && frase[5][2] == 'm') {
                strcpy(municipio[i].consorcio, "true");
            } else {
                strcpy(municipio[i].consorcio, "false");
            }
            i++;
        }
    }

    fclose(arquivo);
}

void imprimir(int num) {
        printf("%d %s %s %d %d %d %d %s %s %d %s %d %s\n", arr[num].id,
                                                           arr[num].nome,
                                                           arr[num].uf,
                                                           arr[num].codigoUf,
                                                           arr[num].populacao,
                                                           arr[num].numeroFuncionarios,
                                                           arr[num].numeroComissados,
                                                           arr[num].escolaridade,
                                                           arr[num].estagio,
                                                           arr[num].atualizacaoPlano,
                                                           arr[num].regiao,
                                                           arr[num].atualizacaoCadastro,
                                                           arr[num].consorcio);
}

/**
 * Insere o elemento na primeira posição do array.
 * @param municipio elemento Elemento a ser inserido.
 */
void inserirInicio(Municipio elemento) {
        int i;
        if(n >= 200) {
            errx(1, "Erro ao inserir no inicio!");
        }

        for(i = n; i > 0; i--) {
                arr[i] = arr[i - 1];
        }

        arr[0] = elemento;
        n++;
}

/**
 * Insere o elemento na ultima posicao do array.
 * @param municipio elemento Elemento a ser inserido.
 */
void inserirFim(Municipio elemento) {
        if(n >= 200) {
                errx(1, "Erro ao inserir no fim!");
        }

        arr[n] = elemento;
        n++;
}

/**
 * Insere o elemento em uma posicao generica do array.
 * @param municipio elemento Elemento a ser inserido.
 * @param int posicao Posicao que sera inserido o elemento.
 */
void inserir(Municipio elemento, int posicao) {
        int i;
        if(n >= 200 || posicao < 0 || posicao > n) {
                errx(1, "Erro ao inserir no na posição!");
        }

        for(i = n; i > posicao; i--) {
                arr[i] = arr[i - 1];
        }

        arr[posicao] = elemento;
        n++;
}

/**
 * Remove o elemento da primeira posicao do array.
 * @return municipio resp Elemento a ser removido.
 */
Municipio removerInicio() {
        int i;
        if(n == 0) {
                errx(1, "Erro ao remover no inicio!");
        }

        Municipio resp = arr[0];
        n--;

        for(i = 0; i < n; i++) {
                arr[i] = arr[i + 1];
        }
        return resp;
}

/**
 * Remove o elemento da ultima posicao do array.
 * @return municipio resp Elemento a ser removido.
 */
Municipio removerFim() {
        if(n == 0) {
                errx(1, "Erro ao remover no fim!");
        }
        return arr[--n];
}

/**
 * Remove o elemento de uma posicao generica do array.
 * @param int posicao Posicao onde sera removido.
 * @return municipio resp elemento a ser removido.
 */
Municipio remover(int posicao) {
        int i;
        if(n == 0 || posicao < 0 || posicao >= n) {
                errx(1, "Erro ao remover na posição!");
        }

        Municipio resp = arr[posicao];
        n--;

        for(i = posicao; i < n; i++) {
                arr[i] = arr[i + 1];
        }
        return resp;
}

/**
 * Imprime na saida os dados presentes nos
 * respectivos atributos do Municipio.
 */
void mostrar() {
    for(int i = 0; i < n; i++) {
        imprimir(i);
    }
}

int main(){
    start();
    ler();

    int entrada;
    do {
        scanf("%d", &entrada);
        if(entrada > 0) {
            inserirFim(municipio[entrada]);
        }
    } while(entrada != 0);

    int tamanho = 5000;
    char str[tamanho];

    char s[50];
    scanf("%d", &entrada);
    
    do {
        fgets(str, tamanho, stdin);
        char** in = splitIn(str);

        if((strstr(str, "II")) != NULL) {

            int i = atoi(in[1]);
            inserirInicio(municipio[i]);

        } else if((strstr(str, "IF")) != NULL) {

            int i = atoi(in[1]);
            inserirFim(municipio[i]);

        } else if((strstr(str, "I*")) != NULL) {

            int i = atoi(in[1]);
            int j = atoi(in[2]);
            inserir(municipio[j], i);

        } else if((strstr(str, "RI")) != NULL) {

            Municipio elemento = removerInicio();
            printf("(R) %s\n", elemento.nome);

        } else if((strstr(str, "RF")) != NULL) {

            Municipio elemento = removerFim();
            printf("(R) %s\n", elemento.nome);

        } else if((strstr(str, "R*")) != NULL) {

            int i = atoi(in[1]);
            Municipio elemento = remover(i);
            printf("(R) %s\n", elemento.nome);
            
        }
    } while(--entrada >= 0);

    mostrar();     
    return 0;
}
