matrizDeAdy = [[0, 0, 1, 1], [1, 0, 0, 0], [1, 1, 0, 0], [0, 0, 1, 0]]

def sanIsidoroDeSevilla(matriz):
    return traspuesta(matriz, 0, len(matriz)-1, 0, len(matriz)-1)

def traspuesta(m, filaI, filaF, colI, colF):
    if(filaI < filaF):  # 1x1
        filaMedio = (filaI + filaF)//2
        colMedio = (colI + colF)//2
        m1 = traspuesta(m, filaI, filaMedio, colI, colMedio)
        m2 = traspuesta(m1, filaI, filaMedio, colMedio+1, colF)
        m3 = traspuesta(m2, filaMedio+1, filaF, colI, colMedio)
        m4 = traspuesta(m3, filaMedio+1, filaF, colMedio+1, colF)
        return cambio(m4, filaMedio+1, colI, filaI, colMedio+1, filaF - filaMedio)
    else:
        return m

def cambio(m, filaIA, colIA, filaIB, colIB, dimensiones):
    for i in range(0, dimensiones):
        for j in range(0, dimensiones):
            aux = m[filaIA + i][colIA + j]
            m[filaIA + i][colIA + j] = m[filaIB + i][colIB + j]
            m[filaIB + i][colIB + j] = aux
            return m

print(sanIsidoroDeSevilla(matrizDeAdy))
