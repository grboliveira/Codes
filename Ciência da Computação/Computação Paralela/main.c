/**
 * Tarefa 01
 * No comando 'omp for ordered schedule(dynamic)' o 'dynamic' significa que cada thread
 * vai usar um pedaço dos dados e então, após o seu término, pegará o próximo pedaço que
 * que não foi trabalhado por nenhuma thread e assim por diante.
 */

#include <stdio.h>
#include <omp.h>

int main() {
    int i;

    #pragma omp parallel num_threads(2) // Define o número de threads em 2 
    { 
        int tid = omp_get_thread_num(); // Lê o identificador da thread

        #pragma omp for ordered schedule(dynamic) // Força os eventos dentro do loop ocorram em uma ordem prevista
        for(i = 1; i <= 3; i++) {
           printf("[PRINT1] T%d = %d \n", tid, i);
           printf("[PRINT2] T%d = %d \n", tid, i);
        }
    }
}