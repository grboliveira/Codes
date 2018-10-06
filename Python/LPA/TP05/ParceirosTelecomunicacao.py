import networkx as nx

str = input()

while str != ("0 0 0"):
    n, p, k = str.split(" ")

    if int(n) >= 1 and int(n) <= 1000:
        G = nx.Graph()

        for i in range(0, int(p)):
            str = input()
            x, y = str.split(" ")
            G.add_edge(x, y)
        
        remover = True
        while remover == True:
            aux = G.copy()
            remover = False

            for node in aux.nodes():
                if G.degree(node) < int(k):
                    G.remove_node(node)
                    remover = True
        
        if len(G) > 0:
            C = max(nx.connected_component_subgraphs(G), key = len)
            print(len(C))
        else:
            print(0)
    str = input()