#Jorge Allan de Castro Oliiveira
# Max o Louco

import networkx as nx

str = input()
while str != ("0 0 0"):
    n, m, t = str.split(" ")
    n = int(n)
    m = int(m)
    t = int(t)

    if((n >= 1 and n <= 10) and (m >= 1 and m <= 20) and (t >= t and t <= 50)):
        G = nx.Graph()
        custoViagem = []

        for i in range(0, n):
            G.add_node(i + 1)

        for j in range(0, m):
            str = input()
            a, b, c = str.split(" ")
            a = int(a)
            b = int(b)
            c = int(c)

            if(c >= 1 and c <= 1000):
                G.add_edge(a, b, weight = c)

        for k in range(0, n):
            custoViagem.append(int(input()))
        
        if(nx.has_path(G, source = 1, target = n) == True): #Conferir se há um caminho entre os vértices de origem e destino
            total = 0

            caminho = nx.shortest_path(G, source = 1, target = n) 
            tamanho = len(caminho)

            for l in range(0, tamanho - 1):
                t = t - (G[caminho[l]][caminho[l + 1]]['weight'])
                total = total + (t * custoViagem[l + 1])

            print(total)
        else :
            print(-1)

    str = input()


