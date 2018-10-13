/**
 * TP01Q03 Aleatorio
 * @author Jorge Allan de Castro Oliveira
 * @version 1 02/2017
 * Este algoritmo sorteia duas letras e troca a ocorrencia da
 * primeira nas palavras de entrada pela segunda sorteada
 */

import java.util.Random;

public class Aleatorio {
	/**
  	 * Troca as letras de determinadas posições
  	 */
	public static String setAleatorio(String entrada, Random sort, String palavra) {
		char letra_um = (char)('a' + (Math.abs(sort.nextInt()) % 26)); //Gera uma letra aleatória
		char letra_dois = (char)('a' + (Math.abs(sort.nextInt()) % 26)); //Gera uma letra aleatória

		for(int i = 0; i < entrada.length(); i++) { //Percorre as letras da palavra
			if(entrada.charAt(i) == letra_um) { //Compara cada caractere com a letra gerada aleatoriamente
				palavra += letra_dois; //Guarda na nova variável a letra aleatória na mesma posição da letra original
			}
			else {
				palavra += entrada.charAt(i); //Caso o caractere não seja igual a letra original é guardada na nova variável
			}
		}
		return palavra; //Retorna a palavra com as novas letras
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
		Random sort = new Random();
		sort.setSeed(4);
		
		do {
        	entrada[num] = MyIO.readLine(); //Leitura da entrada padrão
      	} while (encerramento(entrada[num++]) == false); num--; //Loop de leitura que encerra ao ler a palavra FIM

		for (int i = 0; i < num ; i++) { //Laço de repetição que percorre todos os elementos do array
			MyIO.println(setAleatorio(entrada[i], sort, "")); //Manda a palavra contida no array como parâmentro para o método setAleatorio e imprime na saída
		}
	}
}