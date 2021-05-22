pesoi = [2,3,5,6,7]
valori = [4,10,9,12,20]

def aliBaba(pesos, valores, capacidad1, capacidad2):
    indice = []
    lista1 = calculoMejores(pesos, valores, capacidad1)
    print("Primera bolsa: ")
    for i in range(0, len(lista1)):
        if(lista1[i] == 1):
            print("Objeto", i)
            del pesos[i]
            del valores[i]
        else:
            indice.append(i)
    lista2 = calculoMejores(pesos, valores, capacidad2)
    print("\nSegunda bolsa: ")
    for i in range(0, len(lista2)):
        if(lista2[i] != 0):
            print("Objeto", indice[i])

def calculoMejores(pesos, valores, capacidad):
    matriz = [[0]]
    usado = False
    for i in range(1, capacidad+1):
        if(not usado and i >= pesos[0]):
            matriz[0].append(valores[0])
            usado = True
        else:
            matriz[0].append(matriz[0][i-1])
    for i in range(1, len(pesos)):
        matriz.append([0])
        for j in range(1, capacidad+1):
            if(j < pesos[i]):
                matriz[i].append(matriz[i-1][j])
            else:
                matriz[i].append(max(matriz[i-1][j], matriz[i-1][j-pesos[i]] + valores[i]))
    return obtenerListaElem(matriz, capacidad, pesos, valores)

def obtenerListaElem(m, capacidad, pesos, valores):
    resultado = []
    i, j = len(pesos) - 1, capacidad
    while(i != 0):
        if(m[i][j] == m[i-1][j]):
            resultado.insert(0, 0)   # No se usa
            i -= 1
        else:
            resultado.insert(0, 1)   # Se usa
            j -= pesos[i]
            i -= 1
    if(m[0][j] == 0):
        resultado.insert(0, 0)
    else:
        resultado.insert(0, 1)
    return resultado

aliBaba(pesoi, valori, 7, 5)

