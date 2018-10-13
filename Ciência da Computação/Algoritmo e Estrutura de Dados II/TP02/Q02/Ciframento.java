/**
 * TP02Q02 Ciframento
 * @author Jorge Allan de Castro Oliveira
 * @version 1 02/2017
 * Este algoritmo examina se a palavra e troca as mesmas por uma
 * letra correspondente ao um número de casas decimais definidas
 */

public class Ciframento {
	/**
  	 * Manda para o método setCifra um contador, a
  	 * string de entrada e retorna a nova palavra
  	 */
	public static String setCifra(String palavra) {
		return setCifra(palavra, 0);
	}

	/**
  	 * Troca as posições da palavra pela letra correspondente no alfabeto
  	 */
	public static String setCifra(String palavra, int i) {
		int conversao;
		String criptografia = "";

		if(i != palavra.length() - 1) {
			conversao = (int)palavra.charAt(i) + 3; //Transforma as letras em determinadas posições em int e move três casas do alfabeto
            criptografia += (char)conversao + setCifra(palavra, i + 1); //Converte novamente para char e guarda na variavel as letras que formam a nova palavra 
		} else {
			conversao = (int)palavra.charAt(i) + 3; 
            criptografia += (char)conversao; 
		}
		return criptografia; //Retorna o valor da variável criptografia
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

		for(int i = 0; i < num; i++) { //Percorre todas as posições do array
			MyIO.println(setCifra(entrada[i])); //Imprime na saída todas as palavras com as letras trocadas
		}
	}
}
