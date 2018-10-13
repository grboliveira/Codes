#include <stdio.h>

int main(int argc, char const *argv[]) {
    int distancia;
    double combustivel;

    scanf("%d %lf", &distancia, &combustivel);

    double media = (distancia / combustivel);

    printf("%.3lf km/l\n", media);

    return 0;
}
