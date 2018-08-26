#include <stdio.h>
#include <math.h>

double distancia(double x1, double y1, double x2, double y2) {
    return (sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2)));
}

int main(int argc, char const *argv[]) {
    double p1[2];
    double p2[2];

    scanf("%lf %lf %lf %lf", &p1[0], &p1[1], &p2[0], &p2[1]);

    double dist = distancia(p1[0], p1[1], p2[0], p2[1]);
    printf("%.4lf\n", dist);

    return 0;
}
