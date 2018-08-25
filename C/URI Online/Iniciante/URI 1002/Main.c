#include <stdio.h>

double areaCirculo(double raio, double pi) {
    return (raio * raio) * pi;
}

int main() {
    double raio;
    double pi = 3.14159;

    scanf("%lf", &raio);

    double area = areaCirculo(raio, pi);
    printf("A=%.4lf\n", area);

    return 0;
}
