#include <stdio.h>

int diferenca(int a, int b, int c, int d) {
    return ((a * b) - (c * d));
}

int main(int argc, char const *argv[]) {
    int a, b, c, d;

    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);
    scanf("%d", &d);

    int restultado = diferenca(a, b, c, d);
    printf("DIFERENCA = %d\n", restultado);

    return 0;
}
