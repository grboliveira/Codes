/**
 * TP06Q07 - Lista Dupla em C
 * @author Jorge Allan de Castro Oliveira
 * @version 1 06/2017
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <malloc.h>
#include <err.h>

/**
 * Este método quebra os dados da entrada em um array.
 */
char** split(char* entrada) {                                                                           
        char** array = (char**) malloc(16*sizeof(char*));                                            
        char *tmp;                                                                              
        tmp = strtok(entrada, "\t\r\n\f\v");                                                     
        int i = 0;                                                                                    
        while(tmp) {                                                                             
                array[i] = (char*) malloc(sizeof(char*));                                            
                array[i] = tmp;                                                                
                tmp = strtok('\0', "\t\r\n\f\v");                                               
                i++;                                                                                  
        }                                                                                             
        return array;                                                                                
}

/**
 * Este método quebra os dados da entrada em um array.
 */
char** splitIn(char* entrada) {                                                                         
        char** array = (char**) malloc(16*sizeof(char*));                                            
        char *tmp;                                                                              
        tmp = strtok(entrada, " ");                                                              
        int i = 0;                                                                                    
        while(tmp) {                                                                             
                array[i] = (char*) malloc(sizeof(char*));                                            
                array[i] = tmp;                                                                
                tmp = strtok('\0', " ");                                                        
                i++;                                                                                  
        }                                                                                             
        return array;                                                                                
}                                                                                                     

typedef struct Municipio {
    int id;
    char nome[200]; 
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
    char consorcio[10]; 
}Municipio;

typedef struct CelulaDupla {
    Municipio elemento;        // Elemento inserido na celula.
    struct CelulaDupla* prox; // Aponta a celula prox.
   	struct CelulaDupla* ant;  // Aponta a celula anterior.
} CelulaDupla;
 
CelulaDupla* novaCelulaDupla(Municipio elemento) {
   CelulaDupla* nova = (CelulaDupla*) malloc(sizeof(CelulaDupla));
   nova->elemento = elemento;
   nova->ant = nova->prox = NULL;
   return nova;
}

CelulaDupla* primeiro;
CelulaDupla* ultimo;
Municipio municipio[5800];
Municipio arr[200];

/**
 * Cria uma lista.
 */
void start () {
    primeiro = NULL;
   	ultimo = primeiro;
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
 *  Calcula e retorna o tamanho, em numero de elementos, da lista.
 *  @return resp int tamanho
 */
int tam() {
   int tamanho = 0; 
   CelulaDupla* i;
   for(i = primeiro; i != ultimo; i = i->prox, tamanho++);
   return tamanho;
}

/**
 * Insere um elemento na primeira posicao da lista.
 * @param elemento int elemento a ser inserido.
 */
void inserirInicio(Municipio elemento) {
   CelulaDupla* tmp = novaCelulaDupla(elemento);
 
   tmp->ant = primeiro;
   tmp->prox = primeiro->prox;
   primeiro->prox = tmp;
   if (primeiro == ultimo) {                    
      ultimo = tmp;
   } else {
      tmp->prox->ant = tmp;
   }
   tmp = NULL;
}

/**
 * Insere um elemento na ultima posicao da lista.
 * @param elemento int elemento a ser inserido.
 */
void inserirFim(Municipio elemento) {
   ultimo->prox = novaCelulaDupla(elemento);
   ultimo->prox->ant = ultimo;
   ultimo = ultimo->prox;
}

/**
 * Insere um elemento em uma posicao especifica considerando que o 
 * primeiro elemento valido esta na posicao 0.
 * @param x int elemento a ser inserido.
 * @param pos int posicao da insercao.
 * @throws Exception Se <code>posicao</code> invalida.
 */
void inserir(Municipio elemento, int pos) {
 
   int tamanho = tam();
 
   if(pos < 0 || pos > tamanho) {
      errx(1, "Erro ao remover (posicao %d/%d invalida!", pos, tamanho);
   } else if (pos == 0){
      inserirInicio(elemento);
   } else if (pos == tamanho) {
      inserirFim(elemento);
   } else {
      // Caminhar ate a posicao anterior a insercao
      CelulaDupla* i = primeiro;
      int j;
      for(j = 0; j < pos; j++, i = i->prox);
 
      CelulaDupla* tmp = novaCelulaDupla(elemento);
      tmp->ant = i;
      tmp->prox = i->prox;
      tmp->ant->prox = tmp->prox->ant = tmp;
      tmp = i = NULL;
   }
}

/**
 * Remove um elemento da primeira posicao da lista.
 * @return resp int elemento a ser removido.
 */
Municipio removerInicio() {
   if (primeiro == ultimo) {
      errx(1, "Erro ao remover (vazia)!");
   }
 
   CelulaDupla* tmp = primeiro;
   primeiro = primeiro->prox;
   Municipio resp = primeiro->elemento;
   tmp->prox = primeiro->ant = NULL;
   free(tmp);
   tmp = NULL;
   return resp;
}
 
/**
 * Remove um elemento da ultima posicao da lista.
 * @return resp int elemento a ser removido.
 */
Municipio removerFim() {
   if (primeiro == ultimo) {
      errx(1, "Erro ao remover (vazia)!");
   } 
   Municipio resp = ultimo->elemento;
   ultimo = ultimo->ant;
   ultimo->prox->ant = NULL;
   free(ultimo->prox);
   ultimo->prox = NULL;
   return resp;
}

/**
 * Remove um elemento de uma posicao especifica da lista
 * considerando que o primeiro elemento valido esta na posicao 0.
 * @param posicao Meio da remocao.
 * @return resp int elemento a ser removido.
 * @throws Exception Se <code>posicao</code> invalida.
 */
Municipio remover(int pos) {
   	Municipio resp;
   	int tamanho = tam();
 
   	if (primeiro == ultimo){
      	errx(1, "Erro ao remover (vazia)!");
   	} else if(pos < 0 || pos >= tamanho) {
      	errx(1, "Erro ao remover (posicao %d/%d invalida!", pos, tamanho);
   	} else if (pos == 0){
      	resp = removerInicio();
   	} else if (pos == tamanho - 1){
      	resp = removerFim();
   	} else {
      	// Caminhar ate a posicao anterior a insercao
      	CelulaDupla* i = primeiro->prox;
      	int j;
      	for(j = 0; j < pos; j++, i = i->prox);
 
      	i->ant->prox = i->prox;
      	i->prox->ant = i->ant;
      	resp = i->elemento;
      	i->prox = i->ant = NULL;
      	free(i);
      	i = NULL;
   	}
   	return resp;
}

/**
 * Metodo que vai retornar um ponteiro de uma posicao na lista
 * @param int o valor da posicao procurada
 * @return CelulaDupla;
 */
CelulaDupla* ponteiroPosicao(int num) {
    CelulaDupla* i;
    int j = 0;

    for(i = primeiro->prox; j < num; i = i->prox, j++);
    return i;
}

int maiorId(Municipio um, Municipio dois) {
	int resp = 0;
	if((um.populacao == dois.populacao) && (um.id > dois.id)) {
		resp = 1;
	}
    return resp;
}

/**
 * Metodo que vai fazer a comparção por População
 * @param Municipio esta com o menor populção
 * @param Municipio esta com o maior população
 * @return boolean 
 */ 
int menor(Municipio um, Municipio dois) {
    int resp = 0;

    if(um.populacao < dois.populacao) {
        resp = 1;
    } else {
        resp = maiorId(um, dois);
    }
    return resp;
}

/**
 * Metodo que vai fazer a comparção por População
 * @param Municipio esta com o maior populção
 * @param Municipio esta com o menor população
 * @return boolean 
 */ 
int maior(Municipio um, Municipio dois) {
    int resp = 0;

    if(um.populacao > dois.populacao) {
        resp = 1;
    } else {
        resp = maiorId(dois,um);
    }
    return resp;
} 

/**
 * Metodo que vai retornar o valor de uma posição na lista
 * @param int o valor da posicao procurada
 * @return Municipio 
 */
Municipio posicao(int num) {
    CelulaDupla* i;
    int j = 0;

    for(i = primeiro->prox; j < num; i = i->prox, j++);
    Municipio valor = i->elemento;

    return valor;
}

/**
 * Troca o conteudo de duas posicoes do array
 * @param i int primeira posicao
 * @param j int segunda posicao
 */
void swap(int i, int j) {
    CelulaDupla* ponteiro_um = ponteiroPosicao(i);
    CelulaDupla* ponteiro_dois = ponteiroPosicao(j);
    Municipio municipio = ponteiro_um->elemento;

    ponteiro_um->elemento = ponteiro_dois->elemento;
    ponteiro_dois->elemento = municipio;
}

/**
 * Algoritmo de ordenacao Quicksort.
 * @param int esq inicio do array a ser ordenado
 * @param int dir fim do array a ser ordenado
 */
void quicksort(int esq, int dir) {
    int i = esq, j = dir;
    CelulaDupla* esquerda = ponteiroPosicao(i);
    CelulaDupla* direita = ponteiroPosicao(j);

    int pos = (dir + esq) / 2;
    Municipio pivo = posicao(pos);

    while(i <= j) {
        while(menor(posicao(i), pivo) == 1) {
            i = i + 1;
            esquerda = esquerda->prox;
        }
        while(maior(posicao(j),pivo) == 1) {
            j = j - 1;
            direita = direita->ant;
        }

        if(i <= j) {
            swap(i, j);
            i = i + 1;
            esquerda = esquerda->prox;
            j = j  -1;
            direita = direita->ant;
        }
    }

    if(esq < j) quicksort(esq, j);
    if(i < dir) quicksort(i, dir);
}


/**
 * Algoritmo de ordenacao Quicksort.
 */
void quick() {
    int n = tam();
    quicksort(0, n - 1);
}

/**
 * Mostra os elementos da lista separados por espacos.
 */
void mostrar() {
   	CelulaDupla* i;
   	for (i = primeiro->prox; i != NULL; i = i->prox) {
       	imprimir(i->elemento);
   	}
}

int main() {
    start();
    ler();

    int entrada;
    do {
        scanf("%d", &entrada);
        if(entrada > 0) {
            inserirFim(municipio[entrada]);
        }
    } while(entrada != 0);

    quick();

    mostrar();     
    return 0;
}
