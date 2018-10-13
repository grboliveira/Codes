/**
 * TP02Q00 Aquecimento
 * @author Jorge Allan de Castro Oliveira
 * @version 1 02/2017
 * Este algoritmo conta a quantidade de letras maiúsculas
 * e minúsculas na palavra de entrada de forma recursiva
 */

class Aquecimento {
	public static int contarLetrasMaiusculas(String entrada) {
   	int i = 0;
   	return contarLetrasMaiusculas(entrada, 0);
	}

	public static int contarLetrasMaiusculas(String entrada, int i) {
   	int resultado = 0;

   	if(i >= entrada.length()) { //Verifica se o contador é do mesmo tamanho da entrada
   		resultado = 0;
   	}
   	else if ((entrada.charAt(i) >= 'A' && entrada.charAt(i) <= 'Z')){ //Verifica se está entre os caracteres maiúsculos
      	resultado = 1 + contarLetrasMaiusculas(entrada, i+1);
   	}
  	 	else {
      	resultado = 0 + contarLetrasMaiusculas(entrada, i+1);
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

   public static void main (String[] args){
      int num = 0; //Contador de atribuição dos valores lidos para dentro do array
      String[] entrada = new String[1000]; //Tamanho máximo de elementos que podem lidos da entrada padrão
      
      do {
         entrada[num] = MyIO.readLine(); //Leitura da entrada padrão
         } while (encerramento(entrada[num++]) == false); num--; //Loop de leitura que encerra ao ler a palavra FIM

      for (int i = 0; i < num ; i++) { //Laço de repetição que percorre todos os elementos do array
         MyIO.println(contarLetrasMaiusculas(entrada[i]));
      }
   }
}
