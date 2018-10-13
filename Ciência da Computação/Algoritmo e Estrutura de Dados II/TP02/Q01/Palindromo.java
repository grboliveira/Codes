/**
 * TP02Q01 Palíndromo
 * @author Jorge Allan de Castro Oliveira
 * @version 1 02/2017
 * Este algoritmo examina se a palavra continua idêntica caso
 * inverta a posição de todas as letras desta mesma palavra
 */

public class Palindromo {
	/**
  	 * Manda para o método isPalindromo um contador, a
  	 * string de entrada e retorna verdadeiro ou falso
  	 */
	public static Boolean isPalindromo(String palavra) {
		return isPalindromo(palavra, 0);
	}

	/**
  	 * Verifica se as letras da primeira metade corresponde com as da segunda metade
  	 */
	public static Boolean isPalindromo(String palavra, int i) {
		boolean resultado;

		if(i == (palavra.length()) / 2) { //Condicional que retorna verdadeiro caso o contador tenha valor igual a metade do tamanho da string
			resultado = true;
		} else if(palavra.charAt(palavra.length() - 1 - i) != palavra.charAt(i)) { //Condicional que retorna falso caso as letras não sejam idênticas
			resultado = false;
		} else {
			resultado = isPalindromo(palavra, i + 1); //Chamada recursiva para continuar verificando as letras da palavra
		}
		return resultado; //Retorna o valor da variável resultado
	}

	/**
  	 * Verifica se chegou no final do arquivo
  	 */
	public static Boolean encerramento(String palavra) {
		boolean condicao = false;

		if(palavra.charAt(0) == 'F' && palavra.charAt(1) == 'I' && palavra.charAt(2) == 'M') { //Condicional que retorna true caso as letras sejam idênticas
			condicao = true;
		}
		return condicao; //Retorna o valor da variável condicao
	}

	public static void main(String[] args) {
		int num = 0;
		String [] entrada = new String[1000]; //Array para armazenamento das palavras da entrada

		do {
			entrada[num] = MyIO.readLine(); //Leitura dos dados contidos na entrada padrão
		} while(encerramento(entrada[num++]) == false); num--;  //Laço que continua a leitura até atingir o fim do arquivo

		for(int i = 0; i < num; i++) {
			boolean palindromo = isPalindromo(entrada[i]);

			if(palindromo) { //Verifica o valor da variável booleana
				MyIO.println("SIM"); //Imprime SIM caso seja verdadeira
			} else {
				MyIO.println("NAO"); //Imprime não caso seja falsa
			}
		}
	}
}