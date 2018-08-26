#include <stdio.h>

double calc(int qnt1, double val1, int qnt2, double val2) {
    return (qnt1 * val1) + (qnt2 * val2);
}

int main(int argc, char const *argv[]) {
    int id1, id2;
    int qnt1, qnt2;
    double val1, val2;

    scanf("%d", &id1);
    scanf("%d", &qnt1);
    scanf("%lf", &val1);

    scanf("%d", &id2);
    scanf("%d", &qnt2);
    scanf("%lf", &val2);

    double total = calc(qnt1, val1, qnt2, val2);
    printf("VALOR A PAGAR: R$ %.2lf\n", total);

    return 0;
}
