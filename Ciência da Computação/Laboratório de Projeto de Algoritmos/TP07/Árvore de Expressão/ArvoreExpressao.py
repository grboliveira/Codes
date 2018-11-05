class No:
    def __init__(self, elemento):
        self.elemento = elemento
        self.noEsq = None
        self.noDir = None

class Pilha:
    def __init__(self):
        self.pilha = []

    def empilha(self, elemento):
        self.pilha.append(elemento)

    def desempilha(self):
        return self.pilha.pop()

    def vazia(self):
        return self.pilha == []

    def topo(self):
         return self.pilha[len(self.pilha)-1]

def converterInfix(exp):
    prec = {}
    prec["*"] = 3
    prec["/"] = 3
    prec["+"] = 2
    prec["-"] = 2
    prec["("] = 1
    pilhaOperacoes = Pilha()
    listaPostFix = []
    listaToken = exp.split()

    for t in listaToken:
        if t in "0123456789" or t in "ABCDEFGHIJKLMNOPQRSTUVWXYZ" or t in "abcdefghijklmnopqrstuvwxyz":
            listaPostFix.append(t)
        elif t == '(':
            pilhaOperacoes.empilha(t)
        elif t == ')':
            topToken = pilhaOperacoes.desempilha()
            while topToken != '(':
                listaPostFix.append(topToken)
                topToken = pilhaOperacoes.desempilha()
        else:
            while (not pilhaOperacoes.vazia()) and (prec[pilhaOperacoes.topo()] >= prec[t]):
                  listaPostFix.append(pilhaOperacoes.desempilha())
            pilhaOperacoes.empilha(t)

    while not pilhaOperacoes.vazia():
        listaPostFix.append(pilhaOperacoes.desempilha())
    return " ".join(listaPostFix)

def imprimir(raiz):
    thislevel = [raiz]
    j = 0
    while thislevel:
        nextlevel = list()
        print("Nivel", j, ": ", end = ' ')
        for i in thislevel:
            print (str(i.elemento), end = ' ')
            if i.noEsq: nextlevel.append(i.noEsq)
            if i.noDir: nextlevel.append(i.noDir)
            thislevel = nextlevel

        j = j + 1
        print(" ")

while True:
    try:
        linha = input()
        postfix = converterInfix(linha)
        postfix = postfix.replace(" ", "")
        p = Pilha()
        tamanho = len(postfix)

        for i in range(0, tamanho):
            if postfix[i] == '-' or postfix[i] == '/' or postfix[i] == '*' or postfix[i] == '+':
                noRaiz = No(postfix[i])
                noRaiz.noDir = p.desempilha()
                noRaiz.noEsq = p.desempilha()

                p.empilha(noRaiz)
            else:
                no = No(postfix[i])
                p.empilha(no)

        imprimir(p.desempilha())

    except EOFError:
        break