import networkx as nx

str = input()
contVertices = int(str)

str = input()
valorVetices = str.split(" ")

G = nx.Graph()
dicionario = {}

for i in range (1, contVertices + 1):
    result = int(valorVetices[i - 1])
    G.add_node(i)
    if result not in dicionario:
        dicionario[result] = [i]
    else:
        dicionario[result].append(i)

for i in range(1, contVertices):
    str = input("")
    vertices = str.split(" ")
    origem = int(vertices[0])
    destino = int(vertices[1])
    G.add_edge(origem, destino)

caminho = dict(nx.all_pairs_shortest_path_length(G))
total = 0

for i, j in dicionario.items():
    origem = j[0]
    destino = j[1]
    total = total + int(caminho[origem][destino])

print(total)