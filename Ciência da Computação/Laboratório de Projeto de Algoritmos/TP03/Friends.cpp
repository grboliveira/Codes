/* PUC MINAS
 * Jorge Allan de Castro Oliveira
 * 08/2018
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <limits.h>

/* REPRESENTACAO POR MATRIZ DE ADJACENCIAS:
A estrutura representa um grafo.
O campo adj eh um ponteiro para a matriz de adjacencias do grafo.
O campo visitado verifica se um vertice do grafo ja foi contado ou nao.
O campo vertice contem o numero de vertices e o campo aresta contem o numero de arcos do grafo. */
struct grafo {
    int vertice;
    int aresta;
    int *visitado;
    int **adj;
};

/* Um Grafo eh um ponteiro para um grafo, ou seja, um Grafo contem o endereco de um grafo. */
typedef struct grafo *Grafo;

/* REPRESENTACAO POR MATRIZ DE ADJACENCIAS:
A funcao iniciarMatriz() aloca uma matriz com linhas 0..r-1 e colunas 0..c-1.
Cada elemento da matriz recebe valor val. */
static int **iniciarMatriz(int r, int c, int val) {
    int **m = (int **) malloc(r * sizeof(int *));

    for(int i = 0; i < r; i++) {
        m[i] = (int *) malloc(c * sizeof(int));
    }

    for(int i = 0; i < r; i++) {
        for(int j = 0; j < c; j++) {
            m[i][j] = val;
        }
    }
    return m;
}

/* REPRESENTACAO POR MATRIZ DE ADJACENCIAS:
A funcao iniciarGrafo() constroi um grafo com vertices 0 1 .. V-1 e nenhum arco. */
Grafo iniciarGrafo(int vertice) {
    Grafo grafo = (Grafo) malloc(sizeof *grafo);
    grafo->vertice = vertice;
    grafo->aresta = 0;
    grafo->adj = iniciarMatriz(vertice, vertice, 0);
    grafo->visitado = new int[vertice];

    for(int i = 0; i < vertice; i++) {
      grafo->visitado[i] = 0;
    }

    return grafo;
}

/* REPRESENTACAO POR MATRIZ DE ADJACENCIAS:
A função inserirAresta() insere um arco v-w no grafo.
A função supoe que v e w são distintos, positivos e menores que grafo->vertice.
Se o grafo já tem um arco v-w, a função não faz nada. */
void inserirAresta(Grafo grafo, int v, int w, int peso) {
    if(grafo->adj[v][w] == 0) {
        grafo->adj[v][w] = peso;
        grafo->adj[w][v] = peso;
        grafo->aresta++;
    }
}

/* REPRESENTACAO POR MATRIZ DE ADJACENCIAS:
A função contarAlcance() conta o numero de vertices que sao alcancados a partir de um vertice V. */
int contarAlcance(Grafo grafo, int vertice, int n) {
     int resultado = 0;
    for(int i = 0; i < n; i++) {
        if(grafo->adj[vertice][i] == 1 && grafo->visitado[i] == 0) {
            grafo->visitado[i] = 1;
            resultado = resultado + 1 + contarAlcance(grafo, i, n);
        }
    }
    return resultado;
}

int main(int argc, char const *argv[]) {
    int teste, n, m;
    scanf("%d", &teste);

    while(teste > 0) {
        scanf("%d", &n);
        scanf("%d", &m);

        Grafo grafo;
        grafo = iniciarGrafo(n);

        if((n >= 1 && n <= 30000) && (m >= 0 && m <= 500000)) {
            for(int i = 0; i < m; i++) {
                int a, b;

                scanf("%d", &a);
                scanf("%d", &b);

                if((a >= 1 && a <= n) && (b >= 1 && b <= n)) {
                    inserirAresta(grafo, a - 1, b - 1, 1);
                }
            }
        }

        int cont = 0;
        for(int i = 0; i < n; i++) {
            if(grafo->visitado[i] == 0) {
                grafo->visitado[i] = 1;

                int aux = contarAlcance(grafo, i, n);
                if(aux > cont) {
                    cont = aux;
                }
            }
        }
        printf("%d\n", cont + 1);
        teste = teste - 1;
    }
    return 0;
}
