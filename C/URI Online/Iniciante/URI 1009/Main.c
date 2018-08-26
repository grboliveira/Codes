#include <stdio.h>

double salarioBonus(double salario, double vendas, double comissao) {
    return (vendas * comissao) + salario;
}

int main(int argc, char const *argv[]) {
    char nome[25];
    double salario;
    double vendas;
    double comissao = 0.15;

    scanf("%s", nome); // sem o &
    scanf("%lf", &salario);
    scanf("%lf", &vendas);

    double total = salarioBonus(salario, vendas, comissao);
    printf("TOTAL = R$ %.2lf\n", total);
    return 0;
}
