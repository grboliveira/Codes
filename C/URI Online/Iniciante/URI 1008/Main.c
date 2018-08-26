#include <stdio.h>

double calculaSalario(int horas, double valor) {
    return horas * valor;
}

int main(int argc, char const *argv[]) {
    int num;
    int horas;
    double valor;

    scanf("%d", &num);
    scanf("%d", &horas);
    scanf("%lf", &valor);

    double salario = calculaSalario(horas, valor);
    printf("NUMBER = %d\n", num);
    printf("SALARY = U$ %.2lf\n", salario);

    return 0;
}
