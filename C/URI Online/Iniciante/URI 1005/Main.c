#include <stdio.h>

double mediaNota(double notaA, double notaB, double pesoA, double pesoB) {
    return ((notaA * pesoA) + (notaB * pesoB)) / (pesoA + pesoB);
}

int main(int argc, char const *argv[]) {
    double notaA, notaB;
    double pesoA = 3.5;
    double pesoB = 7.5;

    scanf("%lf", &notaA);
    scanf("%lf", &notaB);

    double media = mediaNota(notaA, notaB, pesoA, pesoB);
    printf("MEDIA = %.5lf\n", media);

    return 0;
}
