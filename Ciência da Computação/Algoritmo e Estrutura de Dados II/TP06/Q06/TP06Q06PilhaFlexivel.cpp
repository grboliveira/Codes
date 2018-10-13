/**
 * TP06Q06 - Pilha Flexivel em C
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
    char regiao[50];
    int numeroFuncionarios;
    int numeroComissados;
    char escolaridade[100];
    int atualizacaoPlano;
    char estagio[100];
    int atualizacaoCadastro;
    char consorcio[25]; 
}Municipio;

typedef struct Celula {
    Municipio elemento; // Elemento inserido na celula.
    struct Celula* prox; // Aponta a celula prox.
} Celula;
 
Celula* novaCelula(Municipio elemento) {
   Celula* nova = (Celula*) malloc(sizeof(Celula));
   nova->elemento = elemento;
   nova->prox = NULL;
   return nova;
}

Celula* topo; // Sem celula cabeca.
Municipio municipio[5800];
Municipio arr[200];

/**
 * Cria uma fila sem elementos.
 */
void start () {
   topo = NULL;
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

void imprimir(Municipio municipio) {
        printf("%d %s %s %d %d %d %d %s %s %d %s %d %s\n", municipio.id,
                                                           municipio.nome,
                                                           municipio.uf,
                                                           municipio.codigoUf,
                                                           municipio.populacao,
                                                           municipio.numeroFuncionarios,
                                                           municipio.numeroComissados,
                                                           municipio.escolaridade,
                                                           municipio.estagio,
                                                           municipio.atualizacaoPlano,
                                                           municipio.regiao,
                                                           municipio.atualizacaoCadastro,
                                                           municipio.consorcio);
}

/**
 * Insere elemento na pilha (politica FILO).
 * @param elemento int elemento a inserir.
 */
void inserir(Municipio elemento) {
        Celula* tmp = novaCelula(elemento);
        tmp->prox = topo;
        topo = tmp;
        tmp = NULL;
}

/**
 * Remove elemento da pilha (politica FILO).
 * @return Elemento removido.
 */
Municipio remover() {
   if (topo == NULL) {
      errx(1, "Erro ao remover!");
   }
 
   Municipio resp = topo->elemento;
   Celula* tmp = topo;
   topo = topo->prox;
   tmp->prox = NULL;
   free(tmp);
   tmp = NULL;

   return resp;
}

/**
 * Calcula e retorna o tamanho, em numero de elementos, da pilha.
* @return tamanho int tamanho da pilha
*/
int tam() {
    Celula* tmp = topo;
    int tamanho;
    for(tamanho = 0; tmp->prox != NULL; tamanho++, tmp = tmp->prox);
    tmp = NULL;

    return tamanho;
}

/**
 * Imprime na saida os dados presentes nos
 * respectivos atributos do Municipio.
 */
void mostrar() {  
    int cont = 0;
    int tamanho = tam();
    Celula* i;
    Celula* j;

    for(i = topo; i->prox != NULL; i = i->prox);
    imprimir(i->elemento);

    while(cont != tamanho) {
        for(j = topo; j->prox != i; j = j->prox);
            i = j;
            cont = cont + 1;
            imprimir(i->elemento);
        } 
    }

int main(){
    start();
    ler();

    int entrada;
    do {
        scanf("%d", &entrada);
        if(entrada > 0) {
            inserir(municipio[entrada]);
        }
    } while(entrada != 0);

    int tamanho = 5000;
    char str[tamanho];

    scanf("%d", &entrada);
    char s[50];

    do {
        fgets(str, tamanho, stdin);
        char** in = splitIn(str);

        if((strstr(str, "I")) != NULL) {

            int j = atoi(in[1]);
            inserir(municipio[j]);

        } else if((strstr(str, "R")) != NULL) {
            Municipio elemento = remover();
            printf("(R) %s\n", elemento.nome);
        }
    } while(--entrada >= 0);

    mostrar();     
    return 0;
}
