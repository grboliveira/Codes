/**
 * TP02Q05 Is
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
     * Manda por parâmetro o array com os dados da entrada e um contador
     */
    public static int isEspecial(String palavra) {
        return isEspecial(palavra, 0, 0);
    }

    /**
     * Verifica se é um caractere especial
     */
    public static int isEspecial(String palavra, int i, int especial) {
        if(i < palavra.length()){
            if((int)palavra.charAt(i) == 44 || (int)palavra.charAt(i) == 46) {
                especial = isEspecial(palavra, i + 1, especial + 1);
            } else {
                especial = isEspecial(palavra, i + 1, especial);
            }
        }
        return especial;
    }

    /**
     * Manda por parâmetro o array com os dados da entrada e um contador
     */
    public static int getVogal(String palavra) {
        return getVogal(palavra, 0);
    }

    /**
     * Verifica se todas as letras da palavra de entrada são vogais
     */
	public static int getVogal(String palavra, int i) {
		int resultado = 0;

        if(i == palavra.length()) {
            resultado = 0;
        }
        else if(isLetra(palavra.charAt(i)) && isVogal(palavra.charAt(i))) { //Verifica se são vogais
		    resultado = 1 + getVogal(palavra, i + 1);
        }
        else {
            resultado = 0 + getVogal(palavra, i + 1);
        }
        return resultado;
	}

	/**
     * Manda por parâmetro o array com os dados da entrada e um contador
     */
	public static int getConsoante(String palavra) {
		return getConsoante(palavra, 0);
	}
	/**
     * Verifica se todas as letras da palavra de entrada são consoantes
     */
    public static int getConsoante(String palavra, int i) {
    	int resultado = 0;

        if(i == palavra.length()) {
            resultado = 0;
        } else if(isLetra(palavra.charAt(i)) && !isVogal(palavra.charAt(i))) { //Verifica se são consoantes
            resultado = 1 + getConsoante(palavra, i + 1);
        } else {
            resultado = 0 + getConsoante(palavra, i + 1);
        }
        return resultado;
    }

	/**
     * Manda por parâmetro o array com os dados da entrada e um contador
     */
    public static int getInteiro(String palavra) {
    	return getInteiro(palavra, 0);
    }

    /**
     * Verifica se todas as letras da palavra de entrada pertencem ao intervalo da tabela ascii
     */
    public static int getInteiro(String palavra, int i) {
    	int resultado = 0;

        if(i == palavra.length()) {
            resultado = 0;
        } else if(isNumero(palavra.charAt(i))) { //Verifica se são números
            resultado = 1 + getInteiro(palavra, i + 1);
        } else {
            resultado = 0 + getInteiro(palavra, i + 1);
        }
        return resultado;
    }

    public static boolean isReal(String palavra){
        boolean real;
        int i = getReal(palavra);
        int especial = isEspecial(palavra);

        if(i == palavra.length() && especial <= 1) {
            real = true;
        } else {
            real = false;
        }
        return real;
    }

	/**
     * Manda por parâmetro o array com os dados da entrada e um contador
     */
    public static int getReal(String palavra) {
    	return getReal(palavra, 0, 0);
    }

    /**
     * Verifica se existe algum caractere especial contido na palavra de entrada
     */
    public static int getReal(String palavra, int i, int resultado) {
    	if(i < palavra.length()) {
            if(isNumero(palavra.charAt(i))) {
                resultado = getReal(palavra, i + 1, resultado + 1);
            } else if((int)palavra.charAt(i) == 44 || (int)palavra.charAt(i) == 46) {
                resultado = getReal(palavra, i + 1, resultado + 1);
            } else {
                resultado = getReal(palavra, i + 1, resultado);
            }
        }
        return resultado;
	}

    /**
     * Verifica se é o fim do arquivo, encerrando a leitura da entrada
     */
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
			int vogal = getVogal(entrada[i]);
			if(vogal == entrada[i].length()) {
				MyIO.print("SIM ");
			} else {
				MyIO.print("NAO ");
			}

			int consoante = getConsoante(entrada[i]);
			if(consoante == entrada[i].length()) {
				MyIO.print("SIM ");
			} else {
				MyIO.print("NAO ");
			}

            int inteiro = getInteiro(entrada[i]);
            if(inteiro == entrada[i].length()) {
				MyIO.print("SIM ");
			} else {
				MyIO.print("NAO ");
			}

            boolean real = isReal(entrada[i]);
            if(real) {
				MyIO.println("SIM");
			} else {
				MyIO.println("NAO");
			}
		}
	}
}