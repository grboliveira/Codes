#include <stdio.h>
#include <math.h>

double areaTriangulo(double base, double altura) {
    return (base * altura) / 2.0;
}

double areaCirculo(double raio) {
    return 3.14159 * (pow(raio, 2));
}

double areaTrapezio(double basemenor, double basemaior, double altura) {
    return ((basemaior + basemenor) * altura) / 2.0;
}

double areaQuadrado(double lado) {
    return (pow(lado, 2));
}

double areaRetangulo(double lado1, double lado2) {
    return (lado1 * lado2);
}

int main(int argc, char const *argv[]) {
    double a, b, c;

    scanf("%lf", &a);
    scanf("%lf", &b);
    scanf("%lf", &c);

    double triangulo = areaTriangulo(a, c);
    double circulo = areaCirculo(c);
    double trapezio = areaTrapezio(a, b, c);
    double quadrado = areaQuadrado(b);
    double retangulo = areaRetangulo(a, b);

    printf("TRIANGULO: %.3lf\n", triangulo);
    printf("CIRCULO: %.3lf\n", circulo);
    printf("TRAPEZIO: %.3lf\n", trapezio);
    printf("QUADRADO: %.3lf\n", quadrado);
    printf("RETANGULO: %.3lf\n", retangulo);

    return 0;
}
