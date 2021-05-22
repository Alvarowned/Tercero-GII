from collections import deque, namedtuple

inf = float('inf')
Arista = namedtuple('Arista', 'ini, fin, coste')

def generarArista(ini, fin, coste = 1):
  return Arista(ini, fin, coste)

class Grafo:
    def __init__(self, aristas):
        self.aristas = [generarArista(*arista) for arista in aristas]

    @property
    def vertices(self):
        return set(sum(([arista.ini, arista.fin] for arista in self.aristas), []))

    def paresDeNodos(self, n1, n2, ambosSentidos=True):
        if ambosSentidos:
            pares = [[n1, n2], [n2, n1]]
        else:
            pares = [[n1, n2]]
        return node_pairs

    def quitarArista(self, n1, n2, ambosSentidos=True):
        pares = self.paresDeNodos(n1, n2, ambosSentidos)
        aristas = self.aristas[:]
        for arista in aristas:
            if [arista.ini, arista.fin] in pares:
                self.aristas.remove(arista)

    def añadirArista(self, n1, n2, coste = 1, ambosSentidos=True):
        pares = self.paresDeNodos(n1, n2, ambosSentidos)
        for arista in self.aristas:
            if [arista.ini, arista.fin] in pares:
                return ValueError('Edge {} {} already exists'.format(n1, n2))
        self.aristas.append(Arista(ini=n1, fin=n2, coste=coste))
        if ambosSentidos:
            self.aristas.append(Arista(ini=n2, fin=n1, coste=coste))

    @property
    def vecinos(self):
        vecinos = {vertice: set() for vertice in self.vertices}
        for arista in self.aristas:
            vecinos[arista.ini].add((arista.fin, arista.coste))
        return vecinos

    def dijkstra(self, origen, dest):
        assert origen in self.vertices, 'Such source node doesn\'t exist'
        distancias = {vertice: inf for vertice in self.vertices}
        anterioresVertices = {
            vertice: None for vertice in self.vertices
        }
        distancias[origen] = 0
        vertices = self.vertices.copy()
        while vertices:
            verticeActual = min(vertices, key=lambda vertice: distancias[vertice])
            vertices.remove(verticeActual)
            if distancias[verticeActual] == inf:
                break
            for vecino, coste in self.vecinos[verticeActual]:
                rutaAlternativa = distancias[verticeActual] + coste
                if rutaAlternativa < distancias[vecino]:
                    distancias[vecino] = rutaAlternativa
                    anterioresVertices[vecino] = verticeActual
        camino, verticeActual = deque(), dest
        while anterioresVertices[verticeActual] is not None:
            camino.appendleft(verticeActual)
            verticeActual = anterioresVertices[verticeActual]
        if camino:
            camino.appendleft(verticeActual)
        return camino


grafo = Grafo([("a", "b", 10),  ("a", "c", 8),  ("a", "f", 12), ("b", "c", 1),
    ("b", "d", 13), ("c", "d", 5), ("c", "f", 6),  ("d", "e", 8), ("e", "f", 9)])

print(grafo.dijkstra("a", "e"))
