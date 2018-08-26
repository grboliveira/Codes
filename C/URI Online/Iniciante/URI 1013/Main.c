#include <stdio.h>
#include <stdlib.h>

int calcMaior(int a, int b) {
    return (a + b + abs(a - b)) / 2;
}

int main(int argc, char const *argv[]) {
    int a, b, c;

    scanf("%d %d %d", &a, &b, &c);

    int aux = calcMaior(a, b);
    int maior = calcMaior(aux, c);

    printf("%d eh o maior\n", maior);

    return 0;
}
