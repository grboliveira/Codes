/**
 * TP01Q05 Is
 * @author Jorge Allan de Castro Oliveira
 * @version 1 02/2017
 * Este algoritmo analisa as palavras da entrada e verifica se as mesmas
 * são compostas apenas por vogais, consoantes, números inteiros ou reais
 */

public class Is {
	/**
  	 * Verifica se o caractere faz parte das 26 letras do alfabeto
  	 */
	public static Boolean isLetra(char letra) {
		boolean resultado = false;

        if((letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z')) { //Compara as letras da entrada
            resultado = true;
        }
        return resultado;
    }

	/**
     * Verifica se a letra é uma vogal maiúscula ou minúscula
     */
    public static Boolean isVogal(char letra) {
        boolean resultado = false;

        if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U' || letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') { //Compara as letras da entrada
            resultado = true;
        } 
        return resultado;
    }

	/**
     * Verifica se a letra está entre os números da tabela ascii correspondente as letras do alfabeto
     */
    public static Boolean isNumero(char caractere) {
        boolean numero = false;

        if((int)caractere >= 48 && (int)caractere <= 57) { // Compara as letras com os números do intervalo 
            numero = true;
        }
        return numero;
    }

    /**
     * Verifica se todas as letras da palavra de entrada são vogais
     */
	public static Boolean getVogal(String palavra) {
	    int cont = 0;
	    boolean resultado = false;

        for(int i = 0; i < palavra.length(); i++) { //Percorre as letras da palavra
            if(isLetra(palavra.charAt(i)) && isVogal(palavra.charAt(i))) { //Verifica se são vogais
		        cont++;
            }
        }

	    if(cont == palavra.length()) { //Verifica se o contador tem o mesmo tamanho da palavra
            resultado = true;
        }
        return resultado;
    }

    /**
     * Verifica se todas as letras da palavra de entrada são consoantes
     */
    public static Boolean getConsoante(String palavra) {
		int cont = 0;
		boolean resultado = false;

        for(int i = 0; i < palavra.length(); i++) { //Percorre as letras da palavra
            if(isLetra(palavra.charAt(i)) && !isVogal(palavra.charAt(i))) { //Verifica se são consoantes
                cont++;
            }
        }

        if(cont == palavra.length()) { //Verifica se o contador tem o mesmo tamanho da palavra
            resultado = true;
        }
        return resultado;
    }

    /**
     * Verifica se todas as letras da palavra de entrada pertencem ao intervalo da tabela ascii
     */
    public static Boolean getInteiro(String palavra) {
        int cont = 0;
        boolean resultado = false;

        for(int i = 0; i < palavra.length(); i++) { //Percorre as letras da palavra
            if(isNumero(palavra.charAt(i))) { //Verifica se são números
                cont++;
            }
        }

        if(cont == palavra.length()) { //Verifica se o contador tem o mesmo tamanho da palavra
            resultado = true;
        }
        return resultado;
    }

    /**
     * Verifica se existe algum caractere especial contido na palavra de entrada
     */
    public static Boolean getReal(String palavra) {
        int cont = 0;
        int especial = 0;
        boolean resultado = false;

        for(int i = 0; i < palavra.length(); i++) { //Percorre as letras da palavra
            if(isNumero(palavra.charAt(i))) { //Verifica se são números
                cont++;
            }
            else if((int)palavra.charAt(i) == 44 || (int)palavra.charAt(i) == 46) { //Verifica se o caractere é uma virgula ou ponto
                cont++;
                especial++;
            }
        }

        if(cont == palavra.length() && especial <= 1) { //Verifica se o contador tem o mesmo tamanho da palavra e se possui um ou menos caracteres especiais
            resultado = true;
        }
        return resultado;
    }

	public static Boolean encerramento(String parada) {
        Boolean condicao = false;

        if (parada.charAt(0) == 'F' && parada.charAt(1) == 'I' && parada.charAt(2) == 'M') { //Confere se a entrada é o fim do arquivo
            condicao = true;
        }
        return condicao; //Caso retorne falso continua a leitura do arquivo
    }

	public static void main(String[] args) {
		int num = 0; //Contador de atribuição dos valores lidos para dentro do array
		String[] entrada = new String[1000]; //Tamanho máximo de elementos que podem lidos da entrada padrão
		
		do {
        	entrada[num] = MyIO.readLine(); //Leitura da entrada padrão
      	} while (encerramento(entrada[num++]) == false); num--; //Loop de leitura que encerra ao ler a palavra FIM

		for (int i = 0; i < num ; i++) { //Laço de repetição que percorre todos os elementos do array
			boolean vogal = getVogal(entrada[i]);
			if(vogal) {
				MyIO.print("SIM ");
			} else {
				MyIO.print("NAO ");
			}

			boolean consoante = getConsoante(entrada[i]);
			if(consoante) {
				MyIO.print("SIM ");
			} else {
				MyIO.print("NAO ");
			}

            boolean inteiro = getInteiro(entrada[i]);
            if(inteiro) {
				MyIO.print("SIM ");
			} else {
				MyIO.print("NAO ");
			}

            boolean real = getReal(entrada[i]);
            if(real) {
				MyIO.println("SIM");
			} else {
				MyIO.println("NAO");
			}
		}
	}
}