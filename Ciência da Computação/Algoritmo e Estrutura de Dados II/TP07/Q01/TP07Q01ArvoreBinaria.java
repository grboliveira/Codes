/**
 * TP07Q01ArvoreBinaria
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
    public Municipio elemento; // Conteúdo do nó
    public No esq, dir;  // Filhos da esquerda e direita na árvore
 
    /**
     * Construtor da classe.
     * @param elemento Conteúdo do nó.
     */
    public No(Municipio elemento) {
        this(elemento, null, null);
    }
 
    /**
     * Construtor da classe.
     * @param elemento Conteúdo do nó.
     * @param esq Nó da esquerda.
     * @param dir Nó da direita.
     */
    public No(Municipio elemento, No esq, No dir) {
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
    }
}

class Arvore {
    private No raiz; // Raiz da árvore
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
     * Método para pesquisar elemento.
     * @param id Elemento que será procurado.
     */
    public void pesquisar(int id) {
        pesquisar(id, raiz);
    }
 
    /**
     * Método para pesquisar elemento.
     * @param id Elemento que sera procurado.
     * @param i No em análise.
     */
    private void pesquisar(int id, No i) {
        if (i == null) {
            comparacao++;
	 		MyIO.println("NAO");
      	}
      	else if (id == i.elemento.getId()) {
            comparacao++;
			MyIO.println("SIM");
      	}
      	else if (id < i.elemento.getId()) {
            comparacao++;
			MyIO.print("esq ");
         	pesquisar(id, i.esq);
      	}
      	else if (id >= i.elemento.getId()) {
            comparacao++;
			MyIO.print("dir ");
        	pesquisar(id, i.dir);
      	}
    }
 
    /**
     * Método para inserir elemento.
     * @param municipio Elemento a ser inserido.
     * @throws Exception Se o elemento existir.
     */
    public void inserir(Municipio municipio) throws Exception {
        raiz = inserir(municipio, raiz);
    }
 
    /**
     * Método para inserir elemento.
     * @param municipio Elemento a ser inserido.
     * @param i No em análise.
     * @return No em análise, alterado ou não.
     * @throws Exception Se o elemento existir.
     */
    private No inserir(Municipio municipio, No i) throws Exception {
        if (i == null) {
         	i = new No(municipio);
      	}
      	else if (municipio.getId() < i.elemento.getId()) {
         	i.esq = inserir(municipio, i.esq);
      	}
      	else if (municipio.getId() >= i.elemento.getId()) {
         	i.dir = inserir(municipio, i.dir);
      	}
      	else {
         	throw new Exception("Erro ao inserir!");
      	}	
        return i;
    }
 
    /**
     * Método para remover elemento.
     * @param id Elemento a ser removido.
     * @throws Exception Se não encontrar elemento.
     */
    public void remover(int id) throws Exception {
        raiz = remover(id, raiz);
    }
 
    /**
     * Método para remover elemento.
     * @param id Elemento a ser removido.
     * @param i No em analise.
     * @return No em analise, alterado ou nao.
     * @throws Exception Se não encontrar elemento.
     */
    private No remover(int id, No i) throws Exception {
        if (i == null) {
         	return i;
      	}
      	else if (id < i.elemento.getId()) {
         	i.esq = remover(id, i.esq);
      	}
      	else if (id > i.elemento.getId()) {
         	i.dir = remover(id, i.dir);
 		}
      	// Sem no a direita.
       	else if (i.dir == null) {
         	i = i.esq;
 		}
      	// Sem no a esquerda.
      	else if (i.esq == null) {
         	i = i.dir;
 		}
      	// No a esquerda e no a direita.
      	else {
         	i.esq = antecessor(i, i.esq);
        }
        return i;
    }
 
    /**
     * Método para trocar no removido pelo antecessor.
     * @param i No que teve o elemento removido.
     * @param j No da subarvore esquerda.
     * @return No em análise, alterado ou não.
     */
    private No antecessor(No i, No j) {
      	// Existe nó à direita.
        if (j.dir != null) {
         	// Caminha para direita.
            j.dir = antecessor(i, j.dir);
 		}
      	// Encontrou o máximo da subárvore esquerda.
        else {
            i.elemento = j.elemento; // Substitui i por j.
            j = j.esq; // Substitui j por j.esq.
        }
        return j;
    }
}

class TP07Q01ArvoreBinaria {
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
            } else if(entrada.charAt(0) == 'R') { //Verifica se existe o comando de remover
            	array = entrada.split(" ");
            	int id = Integer.parseInt(array[1]);

                arvore.remover(id); //Remover pelo atributo id
            }  
        } 

        long inicio = System.currentTimeMillis();

    	for(String entrada = MyIO.readLine(); entrada.equals("FIM") == false; entrada = MyIO.readLine()) {
			  int id = Integer.valueOf(entrada);
			  MyIO.print("raiz ");
			  arvore.pesquisar(id);
		}

        long fim = System.currentTimeMillis();
    
        double tempo = ((fim - inicio)/1000.0);
        int comparacao = arvore.getComparacao();

        Arq.openWrite("559855_arvoreBinaria.txt");
        Arq.println("Matrícula: 559855\t"+comparacao+"\t"+tempo+"/s");
        Arq.close(); 
  	}
}