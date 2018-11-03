#Jorge Allan de Castro Oliiveira
# Salas Separadas

import networkx as nx

n = input()
while n != "0":
    n = int(n)
    if(n >= 2 and n <= 100):
        G = nx.Graph()

        for i in range(0, n):
            str = input()
            m = input()
            m = m.split(" ")

            tamanho = len(m)
            for j in range(0, tamanho):
                G.add_edge(i+1, int(m[j]))
            
        if(nx.is_bipartite(G) == True): #Verifica se o grafo é bipartite
            print("SIM")
        else:
            print("NÃO")

    n = input()

