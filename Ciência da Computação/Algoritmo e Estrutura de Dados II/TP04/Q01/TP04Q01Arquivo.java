/**
 * TP04Q01Arquivo
 * @author Jorge Allan de Castro Oliveira
 * @version 1 03/2017
 */

import java.io.*;
import java.text.DecimalFormat;

public class TP04Q01Arquivo {
	public static void main(String [] args) {
		MyIO.setCharset("UTF8"); //Define o tipo de codificação
		int tamanho = MyIO.readInt(); //Número correspondente a quantidade de valores da entrada
		int contador = 1;

		try{			
			RandomAccessFile random = new RandomAccessFile("inverso.txt", "rw"); //Arquivo que será escrito os valores

			while(contador <= tamanho) {
				double num = MyIO.readDouble(); //Leitura de um valor tipo double da entrada padrão
				random.writeDouble(num);
				contador++;
			}

			long posicao = random.getFilePointer() - 8;
			random.close();
			random = new RandomAccessFile("inverso.txt", "r"); //Arquivo que será escrito os valores

			while(posicao >= 0 ) {
				random.seek(posicao);
				double num = random.readDouble();
				if(num - (int)num == 0)MyIO.println((int) num); //Conversão para int
				else {
					MyIO.println(num);
				}
				posicao -= 8;
			}

			random.close();
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}
}
