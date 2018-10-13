/**
 * TP07Q03ArvoreAVL
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
    public Municipio elemento; // Conteudo do no.
    public No esq; // No da esquerda.
    public No dir; // No da direita.
    public int nivel; // Numero de niveis abaixo do no
 
    /**
     * Construtor da classe.
     * 
     * @param elemento
     *            Conteudo do no.
     */
    No(Municipio elemento) {
        this(elemento, null, null, 1);
    }
 
    /**
     * Construtor da classe.
     * 
     * @param elemento
     *            Conteudo do no.
     * @param esq
     *            No da esquerda.
     * @param dir
     *            No da direita.
     */
    No(Municipio elemento, No esq, No dir, int nivel) {
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
        this.nivel = nivel;
    }
 
    // Cálculo do número de níveis a partir de um vértice
    public No setNivel() {
        this.nivel = 1 + Math.max(getNivel(esq), getNivel(dir));
        return this;
    }
 
    // Retorna o número de níveis a partir de um vértice
    public static int getNivel(No no) {
        return (no == null) ? 0 : no.nivel;
    }
 
}

class AVL {
    private No raiz; // Raiz da arvore.
    private int comparacao = 0;
 
    /**
     * Construtor da classe.
     */
    public AVL() {
        raiz = null;
    }
 
    public int getAltura() {
        return nivel(raiz) - 1;
    }
 
    private int nivel(No no) {
        return (no == null) ? 0 : (1 + Math.max(nivel(no.esq), nivel(no.dir)));
    }

    public int getComparacao() {
        return comparacao;
    }
 
    /**
     * Metodo publico iterativo para pesquisar elemento.
     * 
     * @param elemento
     *            Elemento que sera procurado.
     * @return <code>true</code> se o elemento existir, <code>false</code> em
     *         caso contrario.
     */
    public void pesquisar(int elemento) {
        pesquisar(raiz, elemento);
    }
 
    /**
     * Metodo privado recursivo para pesquisar elemento.
     * 
     * @param no
     *            No em analise.
     * @param x
     *            Elemento que sera procurado.
     * @return <code>true</code> se o elemento existir, <code>false</code> em
     *         caso contrario.
     */
    private void pesquisar(No no, int x) {
        boolean resp;
        if (no == null) {
        	comparacao++;
            MyIO.println("NAO");
 
        } else if (x == no.elemento.getId()) {
        	comparacao++;
            MyIO.println("SIM");
 
        } else if (x < no.elemento.getId()) {
        	comparacao++;
            MyIO.print("esq ");
            pesquisar(no.esq, x);
 
        } else {
          MyIO.print("dir ");
            pesquisar(no.dir, x);
        }
    }
 
    /**
     * Metodo publico iterativo para exibir elementos.
     */
    public void mostrarCentral() {
        System.out.print("[ ");
        mostrarCentral(raiz);
        System.out.println("]");
    }
 
    /**
     * Metodo privado recursivo para exibir elementos.
     * 
     * @param no
     *            No em analise.
     */
    private void mostrarCentral(No no) {
        if (no != null) {
            mostrarCentral(no.esq); // Elementos da esquerda.
            System.out.print(no.elemento + " "); // Conteudo do no.
            mostrarCentral(no.dir); // Elementos da direita.
        }
    }
 
    /**
     * Metodo publico iterativo para exibir elementos.
     */
    public void mostrarPre() {
        System.out.print("[ ");
        mostrarPre(raiz);
        System.out.println("]");
    }
 
    /**
     * Metodo privado recursivo para exibir elementos.
     * 
     * @param no
     *            No em analise.
     */
    private void mostrarPre(No no) {
        if (no != null) {
            System.out.print(no.elemento + "(fator " + (No.getNivel(no.dir) - no.getNivel(no.esq)) + ") "); // Conteudo
                                                                                                            // do
                                                                                                            // no.
            mostrarPre(no.esq); // Elementos da esquerda.
            mostrarPre(no.dir); // Elementos da direita.
        }
    }
 
    /**
     * Metodo publico iterativo para exibir elementos.
     */
    public void mostrarPos() {
        System.out.print("[ ");
        mostrarPos(raiz);
        System.out.println("]");
    }
 
    /**
     * Metodo privado recursivo para exibir elementos.
     * 
     * @param no
     *            No em analise.
     */
    private void mostrarPos(No no) {
        if (no != null) {
            mostrarPos(no.esq); // Elementos da esquerda.
            mostrarPos(no.dir); // Elementos da direita.
            System.out.print(no.elemento + " "); // Conteudo do no.
        }
    }
 
    /**
     * Metodo publico iterativo para inserir elemento.
     * 
     * @param x
     *            Elemento a ser inserido.
     * @throws Exception
     *             Se o elemento existir.
     */
    public void inserir(Municipio municipio) throws Exception {
        if(procurarElemento(municipio.getId()) == false) {
            raiz = inserir(raiz, municipio);
        }
    }

    public boolean procurarElemento(int id) {
        return procurarElemento(id, raiz);
    }
 
    private boolean procurarElemento(int id, No i) {
      boolean resp;
      if (i == null) {
         resp = false;
 
      } else if (id == i.elemento.getId()) {
         resp = true;
 
      } else if (id < i.elemento.getId()) {
         resp = procurarElemento(id, i.esq);
 
      } else {
         resp = procurarElemento(id, i.dir);
      }
      return resp;
    }
 
    /**
     * Metodo privado recursivo para inserir elemento.
     * 
     * @param no
     *            No em analise.
     * @param x
     *            Elemento a ser inserido.
     * @return No em analise, alterado ou nao.
     * @throws Exception
     *             Se o elemento existir.
     */
    private No inserir(No no, Municipio x) throws Exception {
        if (no == null) {
            no = new No(x);
        } else if (x.getId() < no.elemento.getId()) {     
            no.esq = inserir(no.esq, x);
        } else if (x.getId() > no.elemento.getId()) {
            no.dir = inserir(no.dir, x);
        } else {
            throw new Exception("Erro ao inserir elemento! ");
        }
 
        no = balancear(no);
        return no;
    }
 
    private No balancear(No no) throws Exception {
        if (no != null) {
            int fator = No.getNivel(no.dir) - no.getNivel(no.esq);
 
            // Se balanceada
            if (Math.abs(fator) <= 1) {
                no = no.setNivel();
 
                // Se desbalanceada para a direita
            } else if (fator == 2) {
 
                int fatorFilhoDir = No.getNivel(no.dir.dir) - No.getNivel(no.dir.esq);
 
                // Se o filho a direita tambem estiver desbalanceado
                if (fatorFilhoDir == -1) {
                    no.dir = rotacionarDir(no.dir);
                }
                no = rotacionarEsq(no);
 
                // Se desbalanceada para a esquerda
            } else if (fator == -2) {
 
                int fatorFilhoEsq = No.getNivel(no.esq.dir) - No.getNivel(no.esq.esq);
 
                // Se o filho a esquerda tambem estiver desbalanceado
                if (fatorFilhoEsq == 1) {
                    no.esq = rotacionarEsq(no.esq);
                }
                no = rotacionarDir(no);
 
            } else {
                throw new Exception("Erro fator de balanceamento (" + fator + ") invalido!");
            }
        }
 
        return no;
    }
 
    private No rotacionarDir(No no) {
        No noEsq = no.esq;
        No noEsqDir = noEsq.dir;
 
        noEsq.dir = no;
        no.esq = noEsqDir;
 
        no.setNivel();
        noEsq.setNivel();
 
        return noEsq;
    }
 
    private No rotacionarEsq(No no) {
        No noDir = no.dir;
        No noDirEsq = noDir.esq;
 
        noDir.esq = no;
        no.dir = noDirEsq;
 
        no.setNivel();
        noDir.setNivel();
        return noDir;
    }
 
    /**
     * Metodo publico iterativo para remover elemento.
     * 
     * @param elemento
     *            Elemento a ser removido.
     * @throws Exception
     *             Se nao encontrar elemento.
     */
    public void remover(int x) throws Exception {
        raiz = remover(raiz, x);
    }
 
    /**
     * Metodo privado recursivo para remover elemento.
     * 
     * @param no
     *            No em analise.
     * @param x
     *            Elemento a ser removido.
     * @return No em analise, alterado ou nao.
     * @throws Exception
     *             Se nao encontrar elemento.
     */
    private No remover(No no, int x) throws Exception {
 
        if (no == null) {
            return no;
 
        } else if (x < no.elemento.getId()) {
            no.esq = remover(no.esq, x);
 
        } else if (x > no.elemento.getId()) {
            no.dir = remover(no.dir, x);
 
            // Sem no a direita.
        } else if (no.dir == null) {
            no = no.esq;
 
            // Sem no a esquerda.
        } else if (no.esq == null) {
            no = no.dir;
 
            // No a esquerda e no a direita.
        } else {
            no.esq = antecessor(no, no.esq);
        }
 
        no = balancear(no);
        return no;
    }
 
    /**
     * Metodo para trocar no removido pelo antecessor.
     * 
     * @param n1
     *            No que teve o elemento removido.
     * @param n2
     *            No da subarvore esquerda.
     * @return No em analise, alterado ou nao.
     */
    private No antecessor(No n1, No n2) {
 
        // Existe no a direita.
        if (n2.dir != null) {
            // Caminha para direita.
            n2.dir = antecessor(n1, n2.dir);
 
            // Encontrou o maximo da subarvore esquerda.
        } else {
            n1.elemento = n2.elemento; // Substitui N1 por N2.
            n2 = n2.esq; // Substitui N2 por N2.ESQ.
        }
        return n2;
    }
}

class TP07Q03ArvoreAVL {
    public static void main(String[] args) throws Exception {
        AVL arvore = new AVL();
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

        Arq.openWrite("559855_avl.txt");
        Arq.println("Matrícula: 559855\t"+comparacao+"\t"+tempo+"/s");
        Arq.close(); 
    }
}