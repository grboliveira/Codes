/**
 * TP06Q04 - Ordenação Quicksort com Lista Duplamente Encadeada
 * @author Jorge Allan de Castro Oliveira
 * @version 1 04/2017
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
        Arq.close();

        //Abrir o arquivo para leitura e definir atributo numeroFuncionarios, numeroComissados (A2, A5 - Recursos humanos)
        Arq.openRead("/tmp/recursoshumanos.txt", "ISO-8859-1");

        for(i = Arq.readLine(); cont < Integer.parseInt(entrada); cont++, i = Arq.readLine()); cont = 0;
        array = i.split("\t");

        this.numeroFuncionarios = new Integer(array[4]).intValue();
        this.numeroComissados = new Integer(array[7]).intValue();
        Arq.close();
   
        //Abrir o arquivo para leitura e definir atributo escolaridade, atualizacaoPlano (A16, A19 - Planejamento urbano)
        Arq.openRead("/tmp/planejamentourbano.txt", "ISO-8859-1");

        for(i = Arq.readLine(); cont < Integer.parseInt(entrada); cont++, i = Arq.readLine()); cont = 0;
        array = i.split("\t");

        this.escolaridade = array[5];

        if(array[8].equals("Não foi atualizado") || array[8].equals("-")) {
          this.atualizacaoPlano = 0;
        } else {
          this.atualizacaoPlano = new Integer(array[8]).intValue();
        } Arq.close();

        //Abrir o arquivo para leitura e definir atributo estagio (A143 - Gestão ambiental)
      Arq.openRead("/tmp/gestaoambiental.txt", "ISO-8859-1");

        for(i = Arq.readLine(); cont < Integer.parseInt(entrada); cont++, i = Arq.readLine()); cont = 0;
        array = i.split("\t");

        this.estagio = array[7];
        Arq.close();

        //Abrir o arquivo para leitura e definir atributo atualizacaoCadastro (A63 - Recursos gestão)
        Arq.openRead("/tmp/recursosparagestao.txt", "ISO-8859-1");

        for(i = Arq.readLine(); cont < Integer.parseInt(entrada); cont++, i = Arq.readLine()); cont = 0;
        array = i.split("\t");

        if(array[6].equals("Não soube informar*") || array[6].equals("-")) {
          this.atualizacaoCadastro = 0;
        } else {
          this.atualizacaoCadastro = new Integer(array[6]).intValue();
        } Arq.close();
     
        //Abrir o arquivo para leitura e definir atributo consorcio (A152 - Articulação Interinstitucional)
        Arq.openRead("/tmp/articulacaoointerinstitucional.txt", "ISO-8859-1");

        for(i = Arq.readLine(); cont < Integer.parseInt(entrada); cont++, i = Arq.readLine());
        array = i.split("\t");

        String resultado = array[5];
        
        if(resultado.equals("Sim")) {
          this.consorcio = true; 
        } else {
          this.consorcio = false; 
        } Arq.close();
    }
}

class TP06Q04QuicksortListaFlexivel {
    public static void main(String[] args) throws Exception {
      ListaDupla lista = new ListaDupla();
        MyIO.setCharset("ISO-8859-1");

        for(String entrada = MyIO.readLine(); entrada.equals("0") == false; entrada = MyIO.readLine()) {
            Municipio municipio = new Municipio();
            municipio.ler(entrada, 0);
            lista.inserirFim(municipio);          
        }

        long inicio = System.currentTimeMillis();
        lista.quicksort();
        long fim = System.currentTimeMillis();
    
        double tempo = ((fim - inicio)/1000.0);
        lista.mostrar();

        int comparacao = lista.getComparacao();
        int movimentacao = lista.getMovimentacao();

        Arq.openWrite("559855_quicksort2.txt");
        Arq.println("Matrícula: 559855\t"+comparacao+"\t"+movimentacao+"\t"+tempo+"/s");
        Arq.close(); 
    }
}

class CelulaDupla {
    public Municipio elemento;
    public CelulaDupla ant;
    public CelulaDupla prox;
 
    /**
     * Construtor da classe.
     */
    public CelulaDupla() {
        this(null);
    }
 
    /**
     * Construtor da classe.
     * @param elemento int inserido na celula.
     */
    public CelulaDupla(Municipio elemento) {
        this.elemento = elemento;
        this.ant = this.prox = null;
    }
}

class ListaDupla {
    private CelulaDupla primeiro;
    private CelulaDupla ultimo;
    private int comparacao = 0;
    private int movimentacao = 0;

    /**
     * Contrutor da classe
     */
    public ListaDupla() {
        primeiro = new CelulaDupla();
        ultimo = primeiro;
    }

    public int getComparacao() {
        return comparacao;
    }

    public int getMovimentacao() {
        return movimentacao;
    }

    /**
     * Calcula e retorna o tamanho, em numero de elementos, da lista.
     * @return resp int tamanho
     */
    public int tamanho() {
        int tamanho = 0; 

        for(CelulaDupla i = primeiro; i != ultimo; i = i.prox, tamanho++);
        comparacao++;
        return tamanho;
   }

    /**
     * Insere um elemento na última posição da lista.
     * @param municipio Municipio elemento a ser inserido.
     * @throws Exception Se a lista estiver cheia.
     */
    public void inserirFim(Municipio municipio) throws Exception {
        ultimo.prox = new CelulaDupla(municipio);
        ultimo.prox.ant = ultimo;
        ultimo = ultimo.prox;
    }

    /**
     * Algoritmo de ordenacao Quicksort.
     */
    public void quicksort() {
        int n = tamanho();
        quicksort(0, n - 1);
    }
 
    /**
     * Algoritmo de ordenacao Quicksort.
    * @param int esq inicio do array a ser ordenado
    * @param int dir fim do array a ser ordenado
     */
    public void quicksort(int esq, int dir) {
        int i = esq, j = dir;
        CelulaDupla esquerda = ponteiroPosicao(i);
        CelulaDupla direita = ponteiroPosicao(j);

        int pos = (dir + esq) / 2;
        Municipio pivo = posicao(pos);

        while(i <= j) {
        comparacao++;
            while(menor(posicao(i), pivo)) {
                i++;
                esquerda = esquerda.prox;
            }
            while(maior(posicao(j),pivo)) {
                j--;
                direita = direita.ant;
            }

            if(i <= j) {
                comparacao++;
                swap(i, j);
                i++;
                esquerda = esquerda.prox;
                j--;
                direita = direita.ant;
            }
        }

        if(esq < j) quicksort(esq, j);
        if(i < dir) quicksort(i, dir);
    }

    /**
     * Troca o conteudo de duas posicoes do array
     * @param i int primeira posicao
     * @param j int segunda posicao
     */
    public void swap(int i, int j) {
        CelulaDupla ponteiro_um = ponteiroPosicao(i);
        CelulaDupla ponteiro_dois = ponteiroPosicao(j);
        Municipio municipio = ponteiro_um.elemento.clone();

        ponteiro_um.elemento = ponteiro_dois.elemento.clone();
        ponteiro_dois.elemento = municipio.clone();
        movimentacao += 2;
    }

    /**
   * Metodo que vai fazer a comparção por População
   * @param Municipio esta com o menor populção
   * @param Municipio esta com o maior população
   * @return boolean 
   */ 
  public boolean menor(Municipio um, Municipio dois) {
    boolean resp = false;

    if(um.getPopulacao() < dois.getPopulacao()) {
        comparacao++;
        resp = true;
    } else {
        resp = maiorId(um, dois);
    }
    return resp;
  }

    /**
   * Metodo que vai fazer a comparção por População
   * @param Municipio esta com o maior populção
   * @param Municipio esta com o menor população
   * @return boolean 
   */ 
  public boolean maior(Municipio um, Municipio dois) {
    boolean resp = false;

    if(um.getPopulacao() > dois.getPopulacao()) {
        comparacao++;
        resp = true;
    } else {
        resp = maiorId(dois,um);
    }
    return resp;
  } 

  public boolean maiorId(Municipio um, Municipio dois) {
    comparacao += 2;
    return ((um.getPopulacao() == dois.getPopulacao()) && (um.getId() > dois.getId()));
  }

  /**
   * Metodo que vai retornar o valor de uma posição na lista
   * @param int o valor da posicao procurada
   * @return Municipio 
   */

  public Municipio posicao(int num) {
    CelulaDupla i;
    int j = 0;

    for(i = primeiro.prox; j < num; i = i.prox, j++);
    Municipio valor = i.elemento.clone();

    return valor;
  }

  /**
   * Metodo que vai retornar um ponteiro de uma posicao na lista
   * @param int o valor da posicao procurada
   * @return CelulaDupla;
   */

  public CelulaDupla ponteiroPosicao(int num) {
    CelulaDupla i;
    int j = 0;

    for( i = primeiro.prox; j < num; i = i.prox, j++);
    return i;
  }

    /**
     * Mostra os elementos da lista e separados por espacos.
     */
    public void mostrar() {
        for (CelulaDupla i = primeiro.prox; i != null; i = i.prox) {
            i.elemento.imprimir();
        }
    }
}
