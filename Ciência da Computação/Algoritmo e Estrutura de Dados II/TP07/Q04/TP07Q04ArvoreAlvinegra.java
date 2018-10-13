/**
 * TP07Q04ArvoreAlvinegra
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

class No{
    public boolean cor;
    public Municipio elemento;
    public No esq, dir;

    public No() {
        this(null);
    }
    public No (Municipio elemento) {
        this(elemento, false, null, null);
    } 
    public No (Municipio elemento, boolean cor){
        this(elemento, cor, null, null);
    }
    public No (Municipio elemento, boolean cor, No esq, No dir) {
      this.cor = cor;
      this.elemento = elemento;
      this.esq = esq;
      this.dir = dir;
    }
}

class Arvore {
    private No raiz; // Raiz da arvore.
    private int comparacao = 0;

    /**
     * Construtor da classe.
     */
    public Arvore() {
      raiz = null;
    }

    public int getComparacao() {
        return comparacao;
    }
 
 	/**
	 * Metodo publico iterativo para pesquisar elemento.
	 * @param elemento Elemento que sera procurado.
	 * @return <code>true</code> se o elemento existir,
	 * <code>false</code> em caso contrario.
	 */
	public boolean pesquisar(int elemento) {
		MyIO.print("raiz dir ");
		boolean resp = pesquisar(elemento, raiz);
		if(resp == false) {
			MyIO.print("dir dir ");
		}
		return resp;
	}

	/**
	 * Metodo privado recursivo para pesquisar elemento.
	 * @param elemento Elemento que sera procurado.
	 * @param i No em analise.
	 * @return <code>true</code> se o elemento existir,
	 * <code>false</code> em caso contrario.
	 */
	private boolean pesquisar(int elemento, No i) {
		boolean resp;
		if (i == null) {
			resp = false;
		} else if (elemento == i.elemento.getId()) {
			comparacao++;
			resp = true;

		} else if (elemento < i.elemento.getId()) {
			comparacao++;
			MyIO.print("esq ");
			resp = pesquisar(elemento, i.esq);

		} else {
			comparacao++;
			MyIO.print("dir ");
			resp = pesquisar(elemento, i.dir);
		}
		return resp;
	}

    /**
	 * Metodo publico iterativo para inserir elemento.
	 * @param elemento Elemento a ser inserido.
	 * @throws Exception Se o elemento existir.
	 */
	public void inserir(Municipio elemento) throws Exception {

		//Se a arvore tiver tres ou mais elementos
		if(raiz != null && raiz.esq != null && raiz.dir != null) {
			inserir(elemento, null, null, null, raiz);
			//Senao, se a arvore estiver vazia
		} else if(raiz == null){
			raiz = new No(elemento, false);
			//Senao, se a arvore tiver um elemento 
		} else if (raiz.esq == null && raiz.dir == null){
			if (raiz.elemento.getId() > elemento.getId()) {
				raiz.esq = new No(elemento, true);
			} else {
				raiz.dir = new No(elemento, true);
			}
			//Senao, se a arvore tiver dois elementos (raiz e dir)
		} else if (raiz.esq == null){

			if(raiz.elemento.getId() > elemento.getId()){
				raiz.esq = new No(elemento);
			} else if (raiz.dir.elemento.getId() > elemento.getId()) {
				raiz.esq = new No(raiz.elemento);
				raiz.elemento = elemento;
			} else {
				raiz.esq = new No(raiz.elemento);
				raiz.elemento = raiz.dir.elemento;
				raiz.dir.elemento = elemento;
			}

			raiz.esq.cor = raiz.dir.cor = false;

		} else if (raiz.dir == null){

			if(raiz.elemento.getId() < elemento.getId()){
				raiz.dir = new No(elemento);
			} else if (raiz.esq.elemento.getId() < elemento.getId()){
				raiz.dir = new No(raiz.elemento);
				raiz.elemento = elemento;
			} else {
				raiz.dir = new No(raiz.elemento);
				raiz.elemento = raiz.esq.elemento;
				raiz.esq.elemento = elemento;
			}

			raiz.esq.cor = raiz.dir.cor = false;
		} else {
			throw new Exception("Erro ao inserir!");
		}

		raiz.cor = false;
	}

	/**
	 * Metodo privado recursivo para inserir elemento.
	 * @param elemento Elemento a ser inserido.
	 * @param avo No em analise.
	 * @param pai No em analise.
	 * @param i No em analise.
	 * @throws Exception Se o elemento existir.
	 */
	private void inserir(Municipio elemento, No bisavo, No avo, No pai, No i) throws Exception {
		if (i == null) {

			if(elemento.getId() < pai.elemento.getId()){
				i = pai.esq = new No(elemento, true);
			} else {
				i = pai.dir = new No(elemento, true);
			}

			if(pai.cor == true){
				balancear(bisavo, avo, pai, i);
			}

		} else {

			//Achou um 4-no: e preciso fragmeta-lo e reequilibrar a arvore
			if(i.esq != null && i.dir != null && i.esq.cor == true && i.dir.cor == true){
				i.cor = true;
				i.esq.cor = i.dir.cor = false;
				if(i == raiz){
					i.cor = false;
				}else if(pai.cor == true){
					balancear(bisavo, avo, pai, i);
				}
			}
			if (elemento.getId() < i.elemento.getId()) {
				inserir(elemento, avo, pai, i, i.esq);
			} else if (elemento.getId() >= i.elemento.getId()) {
				inserir(elemento, avo, pai, i, i.dir);
			} else {
				throw new Exception("Erro inserir (elemento repetido)!");
			}
		}
	}

	/**
	 * Metodo privado recursivo para balancear a arvore.
	 * @param bisavo No em analise.
	 * @param avo No em analise.
	 * @param pai No em analise.
	 * @param i No em analise.
	 */
	private void balancear(No bisavo, No avo, No pai, No i){

		//Se o pai tambem e preto, reequilibrar a arvore, rotacionando o avo
		if(pai.cor == true){

			//4 tipos de reequilibrios e acoplamento
			if(pai.elemento.getId() > avo.elemento.getId()){ // rotacao a esquerda ou direita-esquerda
				if(i.elemento.getId() > pai.elemento.getId()){
					avo = rotacaoEsq(avo);
				} else {
					avo = rotacaoDirEsq(avo);
				}

			} else { // rotacao a direita ou esquerda-direita
				if(i.elemento.getId() < pai.elemento.getId()){
					avo = rotacaoDir(avo);
				} else {
					avo = rotacaoEsqDir(avo);
				}
			}

			if(bisavo == null){
				raiz = avo;
			} else {
				if(avo.elemento.getId() < bisavo.elemento.getId()){
					bisavo.esq = avo;
				} else {
					bisavo.dir = avo;
				}
			}

			//reestabelecer as cores apos a rotacao
			avo.cor = false;
			avo.esq.cor = avo.dir.cor = true;
		}
	}

    private No rotacaoDir(No no) {
        No noEsq = no.esq;
        No noEsqDir = noEsq.dir;

        noEsq.dir = no;
        no.esq = noEsqDir;

        return noEsq;
    }

    private No rotacaoEsq(No no) {
        No noDir = no.dir;
        No noDirEsq = noDir.esq;

        noDir.esq = no;
        no.dir = noDirEsq;
        return noDir;
   }

    private No rotacaoDirEsq(No no) {
        no.dir = rotacaoDir(no.dir);
        return rotacaoEsq(no);
    }

   private No rotacaoEsqDir(No no) {
        no.esq = rotacaoEsq(no.esq);
        return rotacaoDir(no);
    }
} //fim Arvore()

class TP07Q04ArvoreAlvinegra {
  	public static void main(String[] args) throws Exception {
  		Arvore arvore = new Arvore();
        String comando, array[], linha;
        int posicao;

  		for(String entrada = MyIO.readLine(); entrada.equals("0") == false; entrada = MyIO.readLine()) {
            Municipio municipio = new Municipio();
  			municipio.ler(entrada, 0);
			arvore.inserir(municipio);          
		}

        int num = MyIO.readInt();

        for (int i = 0; i < num; i++) {
            String entrada = MyIO.readLine();
            Municipio municipio = new Municipio();

            if(entrada.charAt(0) == 'I') { //Verifica se existe o comando de inserir
                array = entrada.split(" ");

                linha = array[1];
                municipio.ler(linha, 0);
                arvore.inserir(municipio);              
            } 
        } 

        long inicio = System.currentTimeMillis();

    	for(String entrada = MyIO.readLine(); entrada.equals("FIM") == false; entrada = MyIO.readLine()) {
			  	int id = Integer.valueOf(entrada);
			  	boolean resp = arvore.pesquisar(id);

			  	if(resp == true) {
			  		MyIO.print("SIM\n");
			  	} else {
			  		MyIO.print("NAO\n");
			  	}
		}

        long fim = System.currentTimeMillis();
    
        double tempo = ((fim - inicio)/1000.0);
        int comparacao = arvore.getComparacao();

        Arq.openWrite("559855_alvinegra.txt");
        Arq.println("Matrícula: 559855\t"+comparacao+"\t"+tempo+"/s");
        Arq.close(); 
  	}
}
