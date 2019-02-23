/* Multiplicação de matrizes sequencial
 * real    1m4.846s
 * user    1m0.180s
 * sys     0m0.289s
 * 
 * Multiplicação de matrizes paralelo
 * real    0m24.658s
 * user    1m34.478s
 * sys     0m0.111s
 * 
 * Speed up = 
*/
#include <stdio.h>
#include <stdlib.h>

void mm(double* a, double* b, double* c, int width) {
    
    #pragma omp parallel for
    for (int i = 0; i < width; i++) {
        for (int j = 0; j < width; j++) {
            double sum = 0;
            for (int k = 0; k < width; k++) {
                double x = a[i * width + k];
                double y = b[k * width + j];
                sum += x * y;
            } 
            c[i * width + j] = sum;
        }
    }
}

int main() {
    int width = 2000;
    double *a = (double*) malloc (width * width * sizeof(double));
    double *b = (double*) malloc (width * width * sizeof(double));        double *c = (double*) malloc (width * width * sizeof(double));

    for(int i = 0; i < width; i++) {
        for(int j = 0; j < width; j++) {
            a[i*width+j] = i;
            b[i*width+j] = j;
            c[i*width+j] = 0;
        }
    }
    mm(a,b,c,width);
}
