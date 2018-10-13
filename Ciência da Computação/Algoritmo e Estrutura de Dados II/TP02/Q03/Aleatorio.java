/**
 * TP02Q03 Aleatório
 * @author Jorge Allan de Castro Oliveira
 * @version 1 02/2017
 * Este algoritmo sorteia duas letras e troca a ocorrencia da
 * primeira nas palavras de entrada pela segunda sorteada
 */

import java.util.Random;

public class Aleatorio {
	/**
  	 * Manda para o método setAleatorio um contador, a string
  	 * de entrada, as letras geradas e retorna a palavra
  	 */
	public static String setAleatorio(String palavra, Random sort) {
		char letra_um = (char)('a' + (Math.abs(sort.nextInt()) % 26)); //Gera uma letra aleatória
        char letra_dois = (char)('a' + (Math.abs(sort.nextInt()) % 26)); //Gera uma letra aleatória

		return setAleatorio(palavra, sort, 0, letra_um, letra_dois);
	}

	/**
  	 * Troca as letras de determinadas posições
  	 */
	public static String setAleatorio(String palavra, Random sort, int i, char letra_um, char letra_dois) {
		String aleatorio = "";

		if(i == palavra.length()) {
			return ""; 
		} else if(palavra.charAt(i) == letra_um) {
			aleatorio += letra_dois + setAleatorio(palavra, sort, i + 1, letra_um, letra_dois);
		} else {
            aleatorio += palavra.charAt(i) + setAleatorio(palavra, sort, i+1, letra_um, letra_dois);
        }
        return aleatorio;
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
		Random sort = new Random();
        sort.setSeed(4);

		do {
			entrada[num] = MyIO.readLine(); //Leitura dos dados contidos na entrada padrão
		} while(encerramento(entrada[num++]) == false); num--;  //Laço que continua a leitura até atingir o fim do arquivo

		for(int i = 0; i < num; i++) { //Percorre todas as posições do array
			MyIO.println(setAleatorio(entrada[i], sort)); //Imprime na saída todas as palavras com as letras trocadas
		}
	}
}
