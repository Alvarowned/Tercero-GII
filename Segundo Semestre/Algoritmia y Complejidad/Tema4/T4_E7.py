def secuencia(a, b):
    print("Secuencia A: " + str(a))
    print("Secuencia B: " + str(b))
    
    m = [[0] * (len(b)+1) for _ in range(len(a)+1)]
    for i in range(len(a)):
        for j in range(len(b)):
            if (a[i] == b[j]):
                m[i+1][j+1] = m[i][j] + 1
            else:
                m[i+1][j+1] = max(m[i+1][j], m[i][j+1])
    
    subsec = ""
    i, j, length = 0, 0, 0
    while(length < m[len(a)][len(b)]):
        if (m[i+1][j+1] == m[i][j] + 1):
            subsec += str(a[i])
            length += 1
        if(i < len(a) - 1):
            i += 1
        if(j < len(b) - 1):
            j += 1
    print("\nLa matriz resultante es: \n")
    for l in m:
        print(l)
    print("\nLa longitud maxima de la subsecuencia de A y B sería " + str(len(subsec)) + ".\n")
    return subsec

a = [1,0,0,1]
b = [1,0,1,1,0]

print("La máxima subsecuencia común es: " + str(secuencia(a,b)))
