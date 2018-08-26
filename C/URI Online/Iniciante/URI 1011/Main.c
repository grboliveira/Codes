#include <stdio.h>
#include <math.h>

double calcVolume(int raio, double pi) {
    return (4.0/3) * pi * (pow(raio, 3));
}

int main(int argc, char const *argv[]) {
    int raio;
    double pi = 3.14159;

    scanf("%d", &raio);

    double volume = calcVolume(raio, pi);
    printf("VOLUME = %.3lf\n", volume);

    return 0;
}
