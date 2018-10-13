/**
 * TP07Q07HashIndireta
 * @author Jorge Allan de Castro Oliveira
 * @version 06/2017
 */

class Municipio {
  	private int id;
  	private String nome;
  	private String uf;
  	private int codigoUf;
  	private int populacao;
  	private int numeroFuncionarios;
  	private int numeroComissados;
  	private String escolaridade;
  	private String estagio;
  	private int atualizacaoPlano;
  	private String regiao;
  	private int atualizacaoCadastro;
  	private Boolean consorcio;

  	/**
     * Construtor da classe.
     */
  	public Municipio() {
  		setId(0);
  		setNome("");
  		setUf("");
  		setCodigoUf(0);
  		setPopulacao(0);
  		setNumeroFuncionarios(0);
  		setNumeroComissados(0);
  		setEscolaridade("");	
  		setEstagio("");
  		setAtualizacaoPlano(0);
  		setRegiao("");
  		setAtualizacaoCadastro(0);
  		setConsorcio(false);
  	}

  	/**
   	 * Construtor da classe.
     * @param id Número do município
     * @param nome Nome do município
     * @param uf Estado do município
     * @param codigoUf Código do estado do município
     * @param populacao Número de habitantes do município
     * @param numeroFuncionarios Total de funcionários ativos da administração direta
     * @param numeroComissados Total de funcionários ativos da administração direta - Somente comissionados
     * @param escolaridade Escolaridade do gestor
     * @param estagio Processo de elaboração da agenda
     * @param atualizacaoPlano Ano da última atualização do plano diretor
     * @param regiao Agrupamento onde se encontra o município
     * @param atualizacaoCadastro Ano da última atualização completa do cadastro
     * @param consorcio Se o município faz parte de consórcio público na área de Educação Intermunicipal
     */
  	public Municipio(int id, String nome, String uf, int codigoUf, int populacao, int numeroFuncionarios, int numeroComissados, String escolaridade, String estagio, int atualizacaoPlano, String regiao, int atualizacaoCadastro, boolean consorcio) {
  		  setId(id);
  		  setNome(nome);
  		  setUf(uf);
  		  setCodigoUf(codigoUf);
  		  setPopulacao(populacao);
  		  setNumeroFuncionarios(numeroFuncionarios);
  		  setNumeroComissados(numeroComissados);
  		  setEscolaridade(escolaridade);	
  		  setEstagio(estagio);
  		  setAtualizacaoPlano(atualizacaoPlano);
  		  setRegiao(regiao);
  		  setAtualizacaoCadastro(atualizacaoCadastro);
  		  setConsorcio(consorcio);
  	}

  	//Métodos Set

  	/**
     * Define valor à variável id.
     */
  	public void setId(int id) {
  		this.id = id;
  	}

  	/**
     * Define valor à variável nome.
     */
  	public void setNome(String nome){
  		this.nome = nome;
  	}

  	/**
     * Define valor à variável uf.
     */
  	public void setUf(String uf) {
  		this.uf = uf;
  	}

  	/**
     * Define valor à variável codigoUf.
     */
  	public void setCodigoUf(int codigoUf) {
  		this.codigoUf = codigoUf;
  	}

  	/**
     * Define valor à variável populacao.
     */
  	public void setPopulacao(int populacao) {
  		this.populacao = populacao;
  	}

  	/**
     * Define valor à variável numeroFuncionarios.
     */
  	public void setNumeroFuncionarios(int numeroFuncionarios) {
  		this.numeroFuncionarios = numeroFuncionarios;
  	}

  	/**
     * Define valor à variável numeroComissados.
     */
    public void setNumeroComissados(int numeroComissados) {
    	 this.numeroComissados = numeroComissados;
    }

    /**
     * Define valor à variável escolaridade.
     */
    public void setEscolaridade(String escolaridade) {
    	this.escolaridade = escolaridade;
    }

    /**
     * Define valor à variável estagio.
     */
    public void setEstagio(String estagio) {
    	this.estagio = estagio;
    }

    /**
     * Define valor à variável atualizacaoPlano.
     */
    public void setAtualizacaoPlano(int atualizacaoPlano) {
    	this.atualizacaoPlano = atualizacaoPlano;
    }

    /**
     * Define valor à variável regiao.
     */
    public void setRegiao(String regiao) {
    	this.regiao = regiao;
    }

    /**
     * Define valor à variável atualizacaoCadastro.
     */
    public void setAtualizacaoCadastro(int atualizacaoCadastro) {
    	this.atualizacaoCadastro = atualizacaoCadastro;
    }

    /**
     * Define valor à variável consorcio.
     */
    public void setConsorcio(Boolean consorcio) {
    	this.consorcio = consorcio;
    }

    //Métodos Get

    /**
     * Retorna valor da variável id.
     */
  	public int getId() {
  		return this.id;
  	}

  	/**
     * Retorna valor da variável nome.
     */
  	public String getNome() {
  		return this.nome;
  	}

  	/**
     * Retorna valor da variável uf.
     */
  	public String getUf() {
  		return this.uf;
  	}

  	/**
     * Retorna valor da variável codigoUf.
     */
  	public int getCodigoUf() {
  		return this.codigoUf;
  	}

  	/**
     * Retorna valor da variável populacao.
     */
  	public int getPopulacao() {
  		return this.populacao;
  	}

  	/**
     * Retorna valor da variável numeroFuncionarios.
     */
  	public int getNumeroFuncionarios() {
  		return this.numeroFuncionarios;
  	}

  	/**
     * Retorna valor da variável numeroComissados.
     */
  	public int getNumeroComissados() {
  		return this.numeroComissados;
  	}

  	/**
     * Retorna valor da variável escolaridade.
     */
  	public String getEscolaridade() {
  		return this.escolaridade;
  	}

  	/**
     * Retorna valor da variável estagio.
     */
  	public String getEstagio() {
  		return this.estagio;
  	}

  	/**
     * Retorna valor da variável atualizacaoPlano.
     */
  	public int getAtualizacaoPlano() {
  		return this.atualizacaoPlano;
  	}

  	/**
     * Retorna valor da variável regiao.
     */
  	public String getRegiao() {
  		return this.regiao;
  	}

  	/**
     * Retorna valor da variável atualizacaoCadastro.
     */
  	public int getAtualizacaocadastro() {
  		return this.atualizacaoCadastro;
  	}

  	/**
     * Retorna valor da variável consorcio.
     */
  	public Boolean getConsorcio() {
  		return this.consorcio;
  	}

  	/**
     * Copia as variáveis da classe
     */
  	public Municipio clone() {
  		Municipio resp = new Municipio();

  		resp.id = this.id;
  		resp.nome = this.nome;
  		resp.uf = this.uf;
  		resp.codigoUf = this.codigoUf;
  		resp.populacao = this.populacao;
  		resp.numeroFuncionarios = this.numeroFuncionarios;
  		resp.numeroComissados = this.numeroComissados;
  		resp.escolaridade = this.escolaridade;
  		resp.estagio = this.estagio;
  		resp.atualizacaoPlano = this.atualizacaoPlano;
  		resp.regiao = this.regiao;
  		resp.atualizacaoCadastro = this.atualizacaoCadastro;
  		resp.consorcio = this.consorcio;

  		return resp;
  	}

  	/**
   	 * Imprime o contéudo as variáveis
     */
  	public void imprimir() {
           MyIO.println(this.id + " " + 
                        this.nome + " " + 
                        this.uf + " " +
                        this.codigoUf + " " +
                        this.populacao + " " +
                        this.numeroFuncionarios + " " +
                        this.numeroComissados + " " +
                        this.escolaridade + " " +
                        this.estagio + " " +
                        this.atualizacaoPlano + " " +
                        this.regiao + " " +
                        this.atualizacaoCadastro + " " +
                        this.consorcio + 
                        "");
    }

    /**
   	 * Abre o conteúdo dos arquivos e os armazena em um vetor
     */
	  public void ler(String entrada, int cont) {
        //Abrir o arquivo para leitura e definir atributo id, nome, uf, codigoUf, populacao (A1, A200, A201, A202, A204 - Variáveis externas)
  		Arq.openRead("/tmp/variaveisexternas.txt", "ISO-8859-1");
  		String i;

      	for(i = Arq.readLine(); cont < Integer.parseInt(entrada); cont++, i = Arq.readLine()); cont = 0;
      	String array[] = i.split("\t");
        	
      	this.id = new Integer(array[0]).intValue();
        this.nome = array[4];
        this.uf = array[3];
        this.codigoUf = new Integer(array[2]).intValue();
        this.populacao = new Integer(array[6]).intValue();
      	this.regiao = array[1];

  		//Abrir o arquivo para leitura e definir atributo numeroFuncionarios, numeroComissados (A2, A5 - Recursos humanos)
  		Arq.openRead("/tmp/recursoshumanos.txt", "ISO-8859-1");

      	for(i = Arq.readLine(); cont < Integer.parseInt(entrada); cont++, i = Arq.readLine()); cont = 0;
      	array = i.split("\t");

      	this.numeroFuncionarios = new Integer(array[4]).intValue();
      	this.numeroComissados = new Integer(array[7]).intValue();
   
      	//Abrir o arquivo para leitura e definir atributo escolaridade, atualizacaoPlano (A16, A19 - Planejamento urbano)
  		Arq.openRead("/tmp/planejamentourbano.txt", "ISO-8859-1");

      	for(i = Arq.readLine(); cont < Integer.parseInt(entrada); cont++, i = Arq.readLine()); cont = 0;
      	array = i.split("\t");

      	this.escolaridade = array[5];

      	if(array[8].equals("Não foi atualizado") || array[8].equals("-")) {
        	this.atualizacaoPlano = 0;
      	} else {
        	this.atualizacaoPlano = new Integer(array[8]).intValue();
      	}

      	//Abrir o arquivo para leitura e definir atributo estagio (A143 - Gestão ambiental)
  		Arq.openRead("/tmp/gestaoambiental.txt", "ISO-8859-1");

      	for(i = Arq.readLine(); cont < Integer.parseInt(entrada); cont++, i = Arq.readLine()); cont = 0;
      	array = i.split("\t");

      	this.estagio = array[7];

      	//Abrir o arquivo para leitura e definir atributo atualizacaoCadastro (A63 - Recursos gestão)
  		Arq.openRead("/tmp/recursosparagestao.txt", "ISO-8859-1");

      	for(i = Arq.readLine(); cont < Integer.parseInt(entrada); cont++, i = Arq.readLine()); cont = 0;
      	array = i.split("\t");

      	if(array[6].equals("Não soube informar*") || array[6].equals("-")) {
        	this.atualizacaoCadastro = 0;
      	} else {
        	this.atualizacaoCadastro = new Integer(array[6]).intValue();
      	}
     
      	//Abrir o arquivo para leitura e definir atributo consorcio (A152 - Articulação Interinstitucional)
  		Arq.openRead("/tmp/articulacaoointerinstitucional.txt", "ISO-8859-1");

      	for(i = Arq.readLine(); cont < Integer.parseInt(entrada); cont++, i = Arq.readLine());
      	array = i.split("\t");

      	String resultado = array[5];
      	
      	if(resultado.equals("Sim")) {
      		this.consorcio = true; 
      	} else {
        	this.consorcio = false; 
      	}
    }
}

class Lista {
   private Celula primeiro; // Primeira celula: SEM elemento valido.
   private Celula ultimo; // Ultima celula: COM elemento valido.
   private int comparacao = 0;

   /**
    * Construtor da classe: Instancia uma celula (primeira e ultima).
    */
   public Lista() {
      primeiro = new Celula(-1);
      ultimo = primeiro;
   }

   public int getComparacao() {
      return comparacao;
   }

   /**
    * Mostra os elementos separados por espacos.
    */
   public void mostrar() {
      System.out.print("[ "); // Comeca a mostrar.
      for (Celula i = primeiro.prox; i != null; i = i.prox) {
         System.out.print(i.elemento + " ");
      }
      System.out.println("] "); // Termina de mostrar.
   }

   /**
    * Procura um elemento e retorna se ele existe.
    * @param x Elemento a pesquisar.
    * @return <code>true</code> se o elemento existir,
    * <code>false</code> em caso contrario.
    */
   public boolean pesquisar(int x) {
      	boolean retorno = false;
      	for (Celula i = primeiro.prox; i != null; i = i.prox) {
      	comparacao++;
        if(i.elemento == x) {
          	comparacao++;
            retorno = true;
            i = ultimo;
         }
      }
      return retorno;
   }

   /**
    * Insere um elemento na primeira posicao da sequencia.
    * @param elemento Elemento a inserir.
    */
   public void inserirInicio(int elemento) {
      Celula tmp = new Celula(elemento);
      tmp.prox = primeiro.prox;
      primeiro.prox = tmp;
      if (primeiro == ultimo) {
         ultimo = tmp;
      }
      tmp = null;
   }

   /**
    * Insere um elemento na ultima posicao da sequencia.
    * @param elemento Elemento a inserir.
    */
   public void inserirFim(int elemento) {
      Celula tmp = new Celula(elemento);
      ultimo.prox = tmp;
      ultimo = ultimo.prox;
      tmp = null;
   }

    /**
     * Insere elemento em um indice especifico.
     * Considera que primeiro elemento esta no indice 0.
     * @param x Elemento a inserir.
     * @param posicao Meio da insercao.
     * @throws Exception Se <code>posicao</code> for incorreta.
     */
   	public void inserirMeio(int x, int posicao) throws Exception {
      	Celula i;
      	int cont;

      	// Caminhar ate chegar na posicao anterior a insercao
      	for(i = primeiro, cont = 0; (i.prox != ultimo && cont < posicao); i = i.prox, cont++);
      
      	// Se indice for incorreto:
      	if (posicao < 0 || posicao > cont + 1) {
         	throw new Exception("Erro ao inserir (posicao " + posicao + "(cont = " + cont + ") invalida)!");
      	} else if (posicao == cont + 1) {
         	inserirFim(x);
      	} else {
         	Celula tmp = new Celula(x);
         	tmp.prox = i.prox;
         	i.prox = tmp;
         	tmp = i = null;
      	}
   }

   /**
    * Remove um elemento da primeira posicao da sequencia.
    * @return Elemento removido.
    * @throws Exception Se a sequencia nao contiver elementos.
    */
    public int removerInicio() throws Exception {
        int resp = -1;

        if (primeiro == ultimo) {
            throw new Exception("Erro ao remover (vazia)!");
        } else {
            primeiro = primeiro.prox;
            resp = primeiro.elemento;
        }
        return resp;
    }

    /**
     * Remove um elemento da ultima posicao da sequencia.
     * @return Elemento removido.
     * @throws Exception Se a sequencia nao contiver elementos.
     */
    public int removerFim() throws Exception {
        int resp =  -1;
        Celula i = null;

        if (primeiro == ultimo) {
            throw new Exception("Erro ao remover (vazia)!");
        } else {
            resp = ultimo.elemento;

            // Caminhar ate a penultima celula:
            for(i = primeiro; i.prox != ultimo; i = i.prox);

            ultimo = i;
            i = ultimo.prox = null;
        }
        return resp;
    }

    /**
     * Remove elemento de um indice especifico.
     * Considera que primeiro elemento esta no indice 0.
     * @param posicao Meio da remocao.
     * @return Elemento removido.
     * @throws Exception Se <code>posicao</code> for incorreta.
     */
    public int removerMeio(int posicao) throws Exception {
      	Celula i;
      	int resp = -1, cont;

      	if (primeiro == ultimo) {
         	throw new Exception("Erro ao remover (vazia)!");
      	} else {

        // Caminhar ate chegar na posicao anterior a insercao
        for(i = primeiro; i.prox.elemento != posicao; i = i.prox);
            Celula tmp = i.prox;
            resp = tmp.elemento;
            i.prox = tmp.prox;
            tmp.prox = null;
            i = tmp = null;
        }
      	return resp;
   	}
}

class Celula {
   public int elemento; // Elemento inserido na celula.
   public Celula prox; // Aponta a celula prox.

    /**
     * Construtor da classe.
     * @param elemento Elemento inserido na celula.
     */
    Celula(int elemento) {
        this.elemento = elemento;
        this.prox = null;
    }

   /**
    * Construtor da classe.
    * @param elemento Elemento inserido na celula.
    * @param prox Aponta a celula prox.
    */
   Celula(int elemento, Celula prox) {
        this.elemento = elemento;
        this.prox = prox;
    }
}


/*
*Hash adaptado para usar lista simples em vez de reserva ou rehash
*/
class Hash { 
    Lista tabela[];
    int tamanho;
    final int NULO = -1;

    public Hash() {
        this(21);
    }

    public Hash(int tamanho) {
        this.tamanho = tamanho;
        tabela = new Lista[tamanho];
        for(int i = 0; i < tamanho; i++){
            tabela[i] = new Lista();
        }
    }

    public int h(int elemento) {
        return elemento % tamanho;
    }

    public boolean pesquisar(int elemento) {
        int pos = h(elemento);

        return tabela[pos].pesquisar(elemento);
   }

    public void inserirInicio (int elemento) {
        int pos = h(elemento);
        tabela[pos].inserirInicio(elemento);
    }

    public void remover(int elemento) throws Exception {
        int resp = NULO;
        if(pesquisar(elemento)) {
            int pos = h(elemento);
            resp = tabela[pos].removerMeio(elemento);
        }
    }
}

class TP07Q07HashIndireta {
    public static void main(String[] args) throws Exception {
        Hash hash = new Hash();
        Lista lista = new Lista();
        String comando, array[], linha;
        int posicao;

        for(String entrada = MyIO.readLine(); entrada.equals("0") == false; entrada = MyIO.readLine()) {
            Municipio municipio = new Municipio();
            municipio.ler(entrada, 0);
            int id = municipio.getId();
            hash.inserirInicio(id);          
        }

        int num = MyIO.readInt();

        for (int i = 0; i < num; i++) {
            String entrada = MyIO.readLine();
            Municipio municipio = new Municipio();

            if(entrada.charAt(0) == 'I') { //Verifica se existe o comando de inserir
                array = entrada.split(" ");

                linha = array[1];
                municipio.ler(linha, 0);
                int id = municipio.getId();

                hash.inserirInicio(id);              
            } else if(entrada.charAt(0) == 'R') {
                array = entrada.split(" ");
                int id = Integer.parseInt(array[1]);

                hash.remover(id); //Remover pelo atributo id
            }
        } 

        long inicio = System.currentTimeMillis();

        for(String entrada = MyIO.readLine(); entrada.equals("FIM") == false; entrada = MyIO.readLine()) {
            int id = Integer.valueOf(entrada);
            boolean resultado = hash.pesquisar(id);

          if(resultado) {
            MyIO.println("SIM");
        }
        else {
            MyIO.println("NAO");
        }
        }

        long fim = System.currentTimeMillis();
    
        double tempo = ((fim - inicio)/1000.0);
        int comparacao = lista.getComparacao();

        Arq.openWrite("559855_hashReserva.txt");
        Arq.println("Matrícula: 559855\t"+comparacao+"\t"+tempo+"/s");
        Arq.close(); 
    }
}