/**
 * TP07Q02ArvoreArvore
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

class No {
    private int elemento; // Conteudo do no.
    private No esq; // No da esquerda.
    private No dir; // No da direita.
   private No2 raizsec;
     
   /**
     * Construtor da classe.
     * @param elemento Conteudo do no.
     */
    No(int elemento) {
      setElemento(elemento);
      setEsq(null);
      setDir(null);
      setraizsec(null);
    }
 
    /**
     * Construtor da classe.
     * @param elemento Conteudo do no.
     * @param esq No da esquerda.
     * @param dir No da direita.
     */
    No(int elemento, No esq, No dir, No2 raizsec) {
      setElemento(elemento);
      setEsq(esq);
      setDir(dir);
      setraizsec(raizsec);
    }
	
		 /**
    * Setar conteudo da String Elemento
    * @param elemento String palavra do no
    */
   public void setElemento(int elemento){
      this.elemento = elemento;
   }
   /**
    * Setar ponteiro da Esquerda
    * @param esq No2 ponteiro esquerda
    */
   
   public void setEsq(No esq){
      this.esq = esq;
   }
   /**
    * Setar ponteiro da Direita
    * @param dir No2 ponteiro direita
    */
   
   public void setDir(No dir){
      this.dir = dir;
   }

   public void setraizsec(No2 raizsec){
	this.raizsec = raizsec;
   }
	
   /**
    * Pegar int do no
    * @return this.elemento palavra contida no no
    */
   public int getElemento(){
      return this.elemento;
   }
    /**
    * Pegar ponteiro a Esquerda do no
    * @return this.esq ponteiro da esquerda
    */
   
   public No getEsq(){
      return this.esq;
   }
   
    /**
    * Pegar ponteiro a Direita do no
    * @return this.dir ponteiro da Direita
    */
   
   public No getDir(){
      return this.dir;
   }

   public No2 getraizsec(){
	return this.raizsec;
   }
	
	
}
class No2 {
    private Municipio elemento; // Conteudo do no.
    private No2 esq; // No da esquerda.
    private No2 dir; // No da direita.
     
   /**
     * Construtor da classe.
     * @param elemento Conteudo do no.
     */
    No2(Municipio elemento) {
          setElemento(elemento);
      setEsq(null);
      setDir(null);
    }
 
    /**
     * Construtor da classe.
     * @param elemento Conteudo do no.
     * @param esq No2 da esquerda.
     * @param dir No2 da direita.
     */
    No2(Municipio elemento, No2 esq, No2 dir) {
         setElemento(elemento);
      setEsq(esq);
      setDir(dir);
    }
	 /**
    * Setar conteudo da String Elemento
    * @param elemento String palavra do no
    */
   public void setElemento(Municipio elemento){
      this.elemento = elemento;
   }
   /**
    * Setar ponteiro da Esquerda
    * @param esq No2 ponteiro esquerda
    */
   
   public void setEsq(No2 esq){
      this.esq = esq;
   }
   /**
    * Setar ponteiro da Direita
    * @param dir No2 ponteiro direita
    */
   
   public void setDir(No2 dir){
      this.dir = dir;
   }
   
   /**
    * Pegar palavra do no2
    * @return this.elemento palavra contida no no
    */
   public Municipio getElemento(){
      return this.elemento;
   }
    /**
    * Pegar ponteiro a Esquerda do no
    * @return this.esq ponteiro da esquerda
    */
   
   public No2 getEsq(){
      return this.esq;
   }
   
    /**
    * Pegar ponteiro a Direita do no
    * @return this.dir ponteiro da Direita
    */
   
   public No2 getDir(){
      return this.dir;
   }
}//fim no2
/**
 * Arvore de arvore
 * @author Max do Val Machado
 */
class ArvoreArvore {
    private No raiz; // Raiz da arvore.
    private int nvezes = 0;
	private int movimentos = 0;
 
    /**
     * Construtor da classe.
     */
    public ArvoreArvore() throws Exception{
        raiz = null;
	int[] array = new int[]{29, 21, 50, 14, 25, 35, 52, 12, 16, 23, 27, 32, 42, 51, 53, 11, 13, 15, 17, 22, 24, 26, 28, 31, 33, 41, 43};
	for(int i = 0 ; i < array.length; i++){
      	inserir(i);
	}//fim for      
 
      //os outros 23 caracteres.
    }
 
   
   	/**
	 * Metodo publico iterativo para inserir elemento.
	 * @param x Elemento a ser inserido.
	 * @throws Exception Se o elemento existir.
	 */
	public void inserir(int x) throws Exception {
			raiz = inserir(x, raiz);
	}//fim inserir

	/**
	 * Metodo privado recursivo para inserir elemento.
	 * @param x Elemento a ser inserido.
	 * @param i No em analise.
	 * @return No em analise, alterado ou nao.
	 * @throws Exception Se o elemento existir.
	 */
	private No inserir(int x, No i) throws Exception {
		if(i == null) {
			i = new No(x);

		} else if (x < i.getElemento()) {
			i.setEsq(inserir(x, i.getEsq()));

		} else if (x > i.getElemento()) {
			i.setDir(inserir(x, i.getDir()));

		} else {
			throw new Exception("Erro ao inserir!");
		}// fim else
		return i;
	}// fim inserir

	/**
	 * Metodo publico iterativo para remover elemento.
	 * @param x Elemento a ser removido.
	 * @throws Exception Se nao encontrar elemento.
	 */
	public void remover(int x) throws Exception {
		raiz = remover(x, raiz);
	}//fim remover

	/**
	 * Metodo privado recursivo para remover elemento.
	 * @param x Elemento a ser removido.
	 * @param i No em analise.
	 * @return No em analise, alterado ou nao.
	 * @throws Exception Se nao encontrar elemento.
	 */
	private No remover(int x, No i) throws Exception {

		if (i == null) {
			throw new Exception("Erro ao remover!");

		} else if (x < i.getElemento()) {
			i.setEsq(remover(x, i.getEsq()));

		} else if (x > i.getElemento()) {
			i.setDir(remover(x, i.getDir()));

			// Sem no a direita.
		} else if (i.getDir() == null) {
			i = i.getEsq();

			// Sem no a esquerda.
		} else if (i.getEsq() == null) {
			i = i.getDir();

			// No a esquerda e no a direita.
		} else {
			i.setEsq(antecessor(i, i.getEsq()));
		}//fim if

		return i;
	}//fim remover

	/**
	 * Metodo para trocar no removido pelo antecessor.
	 * @param i No que teve o elemento removido.
	 * @param j No da subarvore esquerda.
	 * @return No em analise, alterado ou nao.
	 */
	private No antecessor(No i, No j) {

		// Existe no a direita.
		if (j.getDir() != null) {
			// Caminha para direita.
			j.setDir(antecessor(i, j.getDir()));

			// Encontrou o maximo da subarvore esquerda.
		} else {
			i.setElemento(j.getElemento()); // Substitui i por j.
			j = j.getEsq(); // Substitui j por j.ESQ.
		}//fim else
		return j;
	}//fim no ant

	/** 
	 * Retorna o inteiro nevezes
	 * @return um Inteiro
	 */
	public int getnvezes(){
		return nvezes;
	}//fim get nvezes

	/**
	 * Retorna um intiero movimentos
	 * @return um inteiro
	 */
	public int getmovimentos(){
		return movimentos;
	}//fim get movimento
	
	  /**
     * Metodo privado iterativo que encontra o no que contem
     * a arvore com as palavras de mesma inicial
     * que a passada por parametro.
     * @param palavra String a ser pesquisada.
     * @return i No que contem arvore a ser analisada.
     * @throws Exception se letra inicial diferente de A~Z.
     */
    public No buscarNo(Municipio x) throws Exception {
        int cod = x.getCodigoUf();
        return buscarNo(cod, raiz);
    }

    /**
     * Metodo privado recursivo que realiza a pesquisa do No.
     * @param letra char inicial da palavra que esta sendo pesquisada.
     * @param i No em analise.
     * @return resp No que contem inicial da palavra.
     * @throws Exception se letra inicial diferente de A~Z.
     */
    private No buscarNo(int cod, No i) throws Exception {
        No resp = null;
        if(i == null) {
            throw new Exception("Mes inexistente!");
        } else if(cod == i.getElemento()) {
            resp = i;
        } else if(cod < i.getElemento()) {
            resp = buscarNo(cod, i.getEsq());
        } else {
            resp = buscarNo(cod, i.getDir());
        }
        return resp;
    }//
	
	/**
	 * Metodo publico iterativo para inserir elemento na segunda arvore.
	 * @param x Elemento a ser inserido.
	 * @throws Exception Se o elemento existir.
	 */
	public void inserirsecundaria(Municipio x) throws Exception {
			No i = buscarNo(x);
			i.setraizsec(inserirsecundaria(x, i.getraizsec()));
	}//fim inserir
	
	/**
	 * Metodo privado recursivo para inserir elemento.
	 * @param x Elemento a ser inserido.
	 * @param i No em analise.
	 * @return No em analise, alterado ou nao.
	 * @throws Exception Se o elemento existir.
	 */
	private No2 inserirsecundaria(Municipio x, No2 j) throws Exception {
		if(j == null) {
			j = new No2(x);

		} else if (x.getId() < j.getElemento().getId()) {
			j.setEsq(inserirsecundaria(x, j.getEsq()));

		} else if (x.getId() > j.getElemento().getId()) {
			j.setDir(inserirsecundaria(x, j.getDir()));

		} else {
			throw new Exception("Erro ao inserir!");
		}// fim else
		return j;
	}// fim inserir


	/**
	 * Metodo publico recursivo para remover elemento.
	 * @param x Elemento a ser removido.
	 * @param i No em analise.
	 * @return No em analise, alterado ou nao.
	 * @throws Exception Se nao encontrar elemento.
	 */	
	 
	public void remove(int x) throws Exception{
		No i =  buscarnoremover(x);
		i.setraizsec(removersec(x, i.getraizsec()));
   }//fim remove
	
	/**
	 * Metodo privado recursivo para remover elemento.
	 * @param x Elemento a ser removido.
	 * @param i No em analise.
	 * @return No em analise, alterado ou nao.
	 * @throws Exception Se nao encontrar elemento.
	 */	
	 
	private No2 removersec(int x, No2 j) throws Exception {

		if (j == null) {
			throw new Exception("Erro ao remover!");

		} else if (x < j.getElemento().getId()) {
			j.setEsq(removersec(x, j.getEsq()));
		} else if (x > j.getElemento().getId()) {
			j.setDir(removersec(x, j.getDir()));

			// Sem no a direita.
		} else if (j.getDir() == null) {
			j = j.getEsq();

			// Sem no a esquerda.
		} else if (j.getEsq() == null) {
			j = j.getDir();

			// No a esquerda e no a direita.
		} else {
			j.setEsq(antecessor(j, j.getEsq()));
		}//fim if

		return j;
	}//fim remover


	
	/**
	 * Metodo publico iterativo para pesquisar elemento.
	 * @param x Elemento que sera procurado.
	 * @return <code>true</code> se o elemento existir,
	 * <code>false</code> em caso contrario.
	 */
	public boolean pesquisar(int x) {
		MyIO.print("raiz ");
		return pesquisar(raiz ,x);
	}// fim pesquisar
	

	/**
	 * Metodo publico iterativo para pesquisar elemento.
	 * @param x Elemento que sera procurado.
	 * @return <code>true</code> se o elemento existir,
	 * <code>false</code> em caso contrario.
	 */
	private boolean pesquisar(No i,int x) {
		boolean resp = false;
			if(i != null){
				MyIO.print("esq ");
				resp = pesquisar(i.getEsq(),x); // Elementos da esquerda.
				if(resp == false){
					MyIO.print("raiz ");
			 		resp = pesquisar(x, i.getraizsec());
				}//fim if			
				if(resp==false){
					MyIO.print("dir ");
					resp = pesquisar(i.getDir(),x); // Elementos da direita.
				}//fim if
			nvezes +=2;
			}//fim if
			nvezes++;
		return resp;
	}// fim pesquisar

	/**
	 * Metodo privado recursivo para pesquisar elemento.
	 * @param x Elemento que sera procurado.
	 * @param i No em analise.
	 * @return <code>true</code> se o elemento existir,
	 * <code>false</code> em caso contrario.
	 */
	private boolean pesquisar(int x, No2 i){
		boolean resp;
		if (i == null) {
			resp = false;

		} else if (x == i.getElemento().getId()) {
			nvezes++;
			resp = true;

		} else if (x < i.getElemento().getId()) {
			nvezes+=2;
			MyIO.print("esq  ");
			resp = pesquisar(x, i.getEsq());

		} else{
			nvezes+=2;
			MyIO.print("dir  ");
			resp = pesquisar(x, i.getDir());
		}//
		nvezes++;
		return resp;
	}//fim pesquisa
	
	private No2 antecessor(No2 i, No2 j) {
 
      // Existe no a direita.
		if (j.getDir() != null) {
			// Caminha para direita.
			j.setDir(antecessor(i, j.getDir()));

			// Encontrou o maximo da subarvore esquerda.
		} else {
			i.setElemento(j.getElemento()); // Substitui i por j.
			j = j.getEsq(); // Substitui j por j.ESQ.
		}//fim else
		return j;
	}//fim no ant	
	
	private No buscarnoremover(int id){
		return buscarnoremover(id,raiz);
	}//
	
	private No buscarnoremover(int id ,No i){
		 No resp = null;
	 		if( i != null){
				boolean eh = buscarnoremover(i.getraizsec(),id);
			if(eh == true) resp = i;
			if( resp == null) resp = buscarnoremover(id, i.getEsq());
			if( resp == null) resp = buscarnoremover(id, i.getDir());
			}//fim if
		return resp;
	}//fim 
	private boolean buscarnoremover( No2 j, int id){
		boolean resp = false;
		if (j == null){
			resp = false;
		} else if(id == j.getElemento().getId()){
			resp = true;
		} else if (id  <  j.getElemento().getId()){
			resp = buscarnoremover(j.getEsq(), id);
		} else {
			resp = buscarnoremover(j.getDir(), id);
		}//fim 
		return resp;
	}//fim	
}//fim arvore

class TP07Q01ArvoreArvore {
  	public static void main(String[] args) throws Exception {
  		Arvore arvore = new Arvore();
  		String comando, array[], linha;
        int posicao;

  		for(String entrada = MyIO.readLine(); entrada.equals("0") == false; entrada = MyIO.readLine()) {
            Municipio municipio = new Municipio();
  			municipio.ler(entrada, 0);
			arvore.inserirsecundaria(municipio);          
		}

		
        int num = MyIO.readInt();

        for (int i = 0; i < num; i++) {
            String entrada = MyIO.readLine();
            Municipio municipio = new Municipio();

            if(entrada.charAt(0) == 'I') {
                array = entrada.split(" ");

                linha = array[1];
                municipio.ler(linha, 0);
                arvore.inserirsecundaria(municipio);              
            } else if(entrada.charAt(0) == 'R') {
            	array = entrada.split(" ");
            	int id = Integer.parseInt(array[1]);
               	
                arvore.remover(id);
            }  
        } 
        
         long inicio = System.currentTimeMillis();

    	for(String entrada = MyIO.readLine(); entrada.equals("FIM") == false; entrada = MyIO.readLine()) {
			    int id = Integer.valueOf(entrada);
			  
			    boolean resp = arvore.pesquisar(id);

          if(resp == true) {
            MyIO.print(" SIM\n");
          } else {
            MyIO.print(" NAO\n");
          }
		  }

        long fim = System.currentTimeMillis();
    
        double tempo = ((fim - inicio)/1000.0);
        int comparacao = arvore.getComparacao();

        Arq.openWrite("559855_arvoreArvore.txt");
        Arq.println("Matrícula: 559855\t"+comparacao+"\t"+tempo+"/s");
        Arq.close();
  	}
}