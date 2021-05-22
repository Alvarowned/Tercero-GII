from random import randint

def algorEscaleras(lista):
    return algorEscaleras_aux(lista, 0)

def algorEscaleras_aux(lista, cont):
    if (len(lista) == 1):
        return lista.pop(0)
    else:
        lista.sort()
        esc1 = lista.pop(0)
        esc2 = lista.pop(0)
        cont += (esc1 + esc2)
        lista.append(esc1 + esc2)
        return algorEscaleras_aux(lista, cont)


listaEscaleras = []
for i in range(0,5):
    escal = randint(1, 50)
    print("Escalera", i, "->", escal)
    listaEscaleras.append(escal)

tiempo = algorEscaleras(listaEscaleras)
print("\nEl tiempo resultante es", tiempo)
