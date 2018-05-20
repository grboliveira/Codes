/**
 * Teste
 * @author Jorge Allan de Castro Oliveira
 * @version 1 05/2018
 */

public class Teste {
    String nome;
    int idade;
    String telefone;

    Teste() {
        nome = "";
        idade = 0;
        telefone = "";
    }

    Teste(String nome, int idade, String telefone) {
        nome = this.nome;
        idade = this.idade;
        telefone = this.telefone;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}