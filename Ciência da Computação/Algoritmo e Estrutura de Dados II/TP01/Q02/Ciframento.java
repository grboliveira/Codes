/**
 * TP01Q02 Ciframento
 * @author Jorge Allan de Castro Oliveira
 * @version 1 02/2017
 * Este algoritmo examina se a palavra e troca as mesmas por uma
 * letra correspondente ao um número de casas decimais definidas
 */

public class Ciframento {
	/**
  	 * Troca as posições da palavra pela letra correspondente no alfabeto
  	 */
	public static String setCifra(String palavra) { //Palavra chega ao método por parâmetro e retorna valor booleano
		int conversao;
		String criptografada = "";
		
		for(int i = 0; i < palavra.length(); i++) { //Laço que percorre as letras da palavra
			conversao = (int)palavra.charAt(i) + 3; //Troca de letras
			criptografada += (char)conversao;
		}
		return criptografada; //Retorna o valor da variável
	}

	public static Boolean encerramento(String parada) {
        Boolean condicao = false;

        if (parada.charAt(0) == 'F' && parada.charAt(1) == 'I' && parada.charAt(2) == 'M') { //Confere se a entrada é o fim do arquivo
            condicao = true;
        }
        return condicao; //Caso retorne falso continua a leitura do arquivo
    }

	public static void main(String[] args) throws Exception {
		int num = 0; //Contador de atribuição dos valores lidos para dentro do array
		String[] entrada = new String[1000]; //Tamanho máximo de elementos que podem lidos da entrada padrão
		
		do {
        	entrada[num] = MyIO.readLine(); //Leitura da entrada padrão
      	} while (encerramento(entrada[num++]) == false); num--; //Loop de leitura que encerra ao ler a palavra FIM

		for (int i = 0; i < num ; i++) { //Laço de repetição que percorre todos os elementos do array
			MyIO.println(setCifra(entrada[i])); //Manda a palavra contida no array como parâmentro para o método setCifra e imprime na saída
		}
	}
}