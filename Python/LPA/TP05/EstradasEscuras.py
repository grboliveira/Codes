import networkx as nx

str = input("")
n, m = str.split(" ")
        
n = int(n)
m = int(m)
    
G = nx.Graph()
sumG = 0

for i in range(0, m):
    str = input("")
    u, v, w = str.split(" ")
    G.add_edge(int(u), int(v), weight=int(w))
    sumG += int(w)
    
T = nx.minimum_spanning_tree(G)
sumT = 0

for(u, v, wt) in T.edges.data('weight'):
    sumT += int(wt)

print(sumG - sumT)
