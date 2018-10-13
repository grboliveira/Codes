/**
 * TP01Q04 - Álgebra Booleana
 * @author Jorge Allan de Castro Oliveira
 * @version 1 04/2017
 */

class TP01Q04AlgebraBooleana {
	static String[] in = {"not(0)", "not(1)",
		"or(0,0)", "or(0,1)", "or(1,0)", "or(1,1)",
		"and(0,0)", "and(0,1)", "and(1,0)", "and(1,1)",
		"or(0,0,0)", "or(0,0,1)", "or(0,1,0)", "or(0,1,1)",
		"or(1,0,0)", "or(1,0,1)", "or(1,1,0)", "or(1,1,1)",
		"and(0,0,0)", "and(0,0,1)", "and(0,1,0)", "and(0,1,1)",
        "and(1,0,0)", "and(1,0,1)", "and(1,1,0)", "and(1,1,1)",
		"or(0,0,0,0)", "or(0,0,0,1)", "or(0,0,1,0)", "or(0,0,1,1)",
		"or(0,1,0,0)", "or(0,1,0,1)", "or(0,1,1,0)", "or(0,1,1,1)",
		"or(1,0,0,0)", "or(1,0,0,1)", "or(1,0,1,0)", "or(1,0,1,1)",
		"or(1,1,0,0)", "or(1,1,0,1)", "or(1,1,1,0)", "or(1,1,1,1)",
		"and(0,0,0,0)", "and(0,0,0,1)", "and(0,0,1,0)", "and(0,0,1,1)",
		"and(0,1,0,0)", "and(0,1,0,1)", "and(0,1,1,0)", "and(0,1,1,1)",
		"and(1,0,0,0)", "and(1,0,0,1)", "and(1,0,1,0)", "and(1,0,1,1)",
		"and(1,1,0,0)", "and(1,1,0,1)", "and(1,1,1,0)", "and(1,1,1,1)"
	};

	static String[] out = {"1", "0",
		"0", "1", "1", "1",
		"0", "0", "0", "1",
		"0", "1", "1", "1",
		"1", "1", "1", "1",
		"0", "0", "0", "0",
        "0", "0", "0", "1",
		"0", "1", "1", "1",
		"1", "1", "1", "1",
		"1", "1", "1", "1",
		"1", "1", "1", "1",
		"0", "0", "0", "0",
		"0", "0", "0", "0",
		"0", "0", "0", "0",
		"0", "0", "0", "1"
	};

	 /**
   	 * Método que verifica se dois conjuntos de caracteres são idênticos
     */
    public static boolean equal(String um, String dois){
        boolean resp = true;
        if(um.length() != dois.length()){
            resp = false;
        } else{
            int i = 0;
            while(i<um.length() && resp) {
                if(um.charAt(i) != dois.charAt(i)) {
                    resp = false;
                }
                i++;
            }
        }
        return resp;
    }

    /**
   	 * Retorna os valores que devem ser colocados nas expressões
     */
	public static int[] getValores(String entrada){
		int num = Character.getNumericValue(entrada.charAt(0));
		int[] in = new int[num];
		String frase = valores(entrada, num);

		for(int i=0; i<frase.length(); i++){
			int value = Character.getNumericValue(frase.charAt(i));
			if(value == 0 || value == 1){
				in[i] = value;
			}
		}
		return in;
	}

	public static String getFrase(String entrada) {
		String expressao = "";
		for(int i = 0; i < entrada.length(); i++) {
			if(!(entrada.charAt(i) >= '0' && entrada.charAt(i) <= '9')) {
				expressao += entrada.charAt(i);
			}
		}
		return expressao;
	}

	/**
   	 * Separa os espaços da entrada
     */
    public static String split(String entrada) {
        String expressao = "";
        for(int i=0; i < entrada.length(); i++) {
            if(entrada.charAt(i) != ' '){
                expressao += entrada.charAt(i);
            }
        }
        return expressao;
   	}

	/**
   	 * Retorna os valores da entrada
     */
	public static String valores(String entrada, int num) {
		String expressao = "";
		for(int i=1; i<=num; i++){
			expressao += entrada.charAt(i);
		}
		return expressao;
	}

	/**
   	 * Tratamento da erxpressão para sua devida validação e execução
     */
	public static String validar(String expressao, int[] valores) {
		expressao = setvalores(expressao, valores);
		expressao = executar(expressao);
		return expressao;
	}

	/**
   	 * Atribui os valores na expressão
     */
	public static String setvalores(String expressao, int[] valores) {
		String frase = "";
		for(int i = 0; i < expressao.length(); i++) {
			int j = 0, value=-1;
			while(j < valores.length) {
				if(expressao.charAt(i) == ('A'+j)) {
					value = valores[j];
				}
				j++;
			}
			if(value != -1) {
				frase += value;
			} else{
				frase += expressao.charAt(i);
			}
		}
		return frase;
	}

	/**
   	 * Substitui a expressão pelo respectivo valor definido no padrão
     */
	public static String trocar(String expressao, int index, int std) {
		String novo = "";

		for(int i = 0; i < expressao.length(); i++) {
			if(i == index) {
				novo += out[std];
				i = (index + in[std].length()-1);
			} else {
				novo += expressao.charAt(i);
			}
		}
		return novo;
	}


	/**
   	 * Simplifica a expressão após o término do tratamento
     */
	public static String executar(String expressao) {
		int index, std = 0;
		while(!equal(expressao, "0") && !equal(expressao, "1")) {
			index = index(expressao, in[std]);
			if(index != -1) {
				expressao = trocar(expressao, index, std);
			}
			if(std < in.length - 1) {
				std++;
			} else{
				std = 0;
			}
		}
		return expressao;
	}

	/**
   	 * Retorna o padrão booleano
     */
	public static int index(String expressao, String std) {
		int resp = -1;
		if(std.length() <= expressao.length()) {
			int i = 0;
			while(resp == -1 && i < expressao.length()) {
				if(expressao.charAt(i) == std.charAt(0)) {
					if(standard(expressao, std, i)) {
						resp = i;
					}
				}
				i++;
			}
		}
		return resp;
	}

	/**
   	 * Verifica se há o padrão
     */
	public static boolean standard(String expressao, String std, int i) {
		int j = 0;
		boolean resp = true;
		
		while(resp && i < expressao.length() && j < std.length()) {
			if(expressao.charAt(i) != std.charAt(j)) {
				resp = false;
			}
			i++;
			j++;
		}
		return resp;
	}


	public static void main(String[] args) {
        String[] entrada = new String[1000];
        String linha;
        int num = 0;

        do{
            entrada[num] = MyIO.readLine();
        } while(equal(entrada[num++], "0") == false); num--;

        for(int i=0; i<num; i++) {
			String expressao = split(entrada[i]);
			int[] valores = getValores(expressao);
			String nova = getFrase(expressao);
			MyIO.println(validar(nova, valores));
        }
    }
}
