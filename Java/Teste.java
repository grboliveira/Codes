/**
 * Teste
 * @author Jorge Allan de Castro Oliveira
 * @version 1 05/2018
 */
class Pessoa {
    private String nome;
    private int idade;
    private String telefone;

    Pessoa() {
        setNome(" ");
        setIdade(0);
        setTelefone(" ");
    }

    Pessoa(String nome, int idade, String telefone) {
        setNome(nome);
        setIdade(idade);
        setTelefone(telefone);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return this.telefone;
    }
}

public class Teste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Jorge", 20, "988261885");
        System.out.println("Olá " + pessoa.getNome() + ", você tem " + pessoa.getIdade() + " anos e seu número é: " + pessoa.getTelefone());
    }
}