#include <stdio.h>

double mediaNota(double a, double b, double c, int p1, int p2, int p3) {
    return ((a * p1) + (b * p2) + (c * p3)) / (p1 + p2 + p3);
}

int main(int argc, char const *argv[]) {
    double a, b, c;
    int p1 = 2;
    int p2 = 3;
    int p3 = 5;

    scanf("%lf", &a);
    scanf("%lf", &b);
    scanf("%lf", &c);

    if(a <= 10.0 && b <= 10.0 && c <= 10.0) {
        double media = mediaNota(a, b, c, p1, p2, p3);
        printf("MEDIA = %.1lf\n", media);
    }

    return 0;
}
