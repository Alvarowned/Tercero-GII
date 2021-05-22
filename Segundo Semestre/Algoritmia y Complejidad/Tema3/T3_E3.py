# Ejemplo de funcion por partes (x < 0 desc, x > 0 asc)
def f(x):
    if(x < 0):
        return -x
    else:
        return x

def busquedaMinLocal(xi, xf):
    x0 = 0
    minimo = 999
    for i in range (xi, xf + 1):
        if(f(i) < minimo):
            x0, minimo = i, f(i)
    return x0

def busquedaK(k, xi, xf, e):
    x0 = busquedaMinLocal(xi, xf)
    listaInter1 = busquedaK_aux(k, xi, x0, e)
    listaInter2 = busquedaK_aux(k, x0, xf, e)
    return listaInter1 + listaInter2

def busquedaK_aux(k, xi, xf, e):
    if(abs(f(xf) - f(xi)) <= e):
        return [[xi, xf]]
    else:
        puntoMedio = (int) (xi + (abs(xf - xi) / 2))
        if(f(xf) - f(xi) > 0):     # Ascendente
            if(not((f(xi) > k) or (f(xf) < k))):
                if(k < f(puntoMedio)):
                    return busquedaK_aux(k, xi, puntoMedio, e)
                else:
                    return busquedaK_aux(k, puntoMedio, xf, e)
            else:
                return []
        else:                      # Descendente
            if(not((f(xi) < k) or (f(xf) > k))):
                if(k > f(puntoMedio)):
                    return busquedaK_aux(k, xi, puntoMedio, e)
                else:
                    return busquedaK_aux(k, puntoMedio, xf, e)
            else:
                return []

listaIntervalos = busquedaK(5, -3, 10, 2)
print(listaIntervalos)


