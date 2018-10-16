import networkx as nx
#import matplotlib.pyplot as plt
#nx.draw_networkx(T)
#plt.show()
 
str = input()
while str != ("0 0"):
    n, m = str.split(" ")

    if((int(n) >= 0 and int(n) <= 100) and (int(m) >= 0 and int(m) <= 4950)):
        G = nx.Graph()

        for i in range(0, int(m)):
            str = input()
            i, j, h = str.split(" ")
            G.add_edge(int(i), int(j), weight = int(h))
        
        str = input()
        qnt_teste = int(str)
        T = nx.minimum_spanning_tree(G)
        num = 1
        
        for j in range(0, qnt_teste):
            print("Instancia" + num)
            str = input()
            origem, destino = str.split(" ")
            caminho = nx.shortest_path(T, int(origem), int(destino))
            tamanho = len(caminho)
            maiorPeso = 0

            for k in range(0, tamanho - 1):
                pesoAresta = T[int(caminho[k])][int(caminho[k + 1])]['weight']
                if(pesoAresta > maiorPeso):
                    maiorPeso = pesoAresta
            print(maiorPeso)
            num = num + 1
    str = input()
