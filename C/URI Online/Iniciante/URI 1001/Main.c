#include <stdio.h>

int soma(int a, int b) {
    return a + b;
}

int main(int argc, char const *argv[]) {
    int a, b;

    scanf("%d", &a);
    scanf("%d", &b);

    int x = soma(a, b);
    printf("X = %d\n", x);
 
    return 0;
}