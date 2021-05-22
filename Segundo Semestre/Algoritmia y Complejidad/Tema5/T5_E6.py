cadena = "acabada"
tablaSustitucion = [["b","b","a","d"],
                    ["c","a","d","a"],
                    ["b","a","c","c"],
                    ["d","c","d","b"]]
indice = ["a", "b", "c", "d"]

def sustituciones(cadena, carFin):
    return sustitucionesAux(indice, tablaSustitucion, cadena, carFin, [cadena])

def sustitucionesAux(indice, tablaSustitucion, cadena, carFin, progreso):
    if(len(cadena) == 1):
        if(cadena == carFin):
            return [progreso]
        else:
            return []
    else:
        resultados = []
        for i in range(0, len(cadena)-1):
            index1, index2 = indice.index(cadena[i]), indice.index(cadena[i+1])
            cadenaAux = cadena[:i] + tablaSustitucion[index1][index2] + cadena[i+2:]
            sol = sustitucionesAux(indice, tablaSustitucion, cadenaAux, carFin, progreso + [cadenaAux])
            if(sol != []):
                resultados += sol
        return resultados

finalD = sustituciones(cadena, "a")
print("Todos los procesos que terminan en la letra a son: ")
for i in finalD:
    print(i)
