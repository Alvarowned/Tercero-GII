dato = "1151451"

def permutaciones(dato, n):
    return permutacionesAux(dato, n, 0, "")

def permutacionesAux(dato, n, primPos, permActual):
    if(n == 0):
        return [permActual]
    else:
        resultados = []
        for i in range(primPos, len(dato)-n+1):
            perm = permActual + dato[i]
            resultados += permutacionesAux(dato, n-1, i+1, perm)
        return resultados

lPerm = permutaciones(dato, 4)
print("Las combinaciones posibles a partir del numero", dato, "son: ")
for i in lPerm:
    print(i)
