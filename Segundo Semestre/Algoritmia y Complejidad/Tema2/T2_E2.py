from random import randint

class Archivo:
    def __init__(self, li, pi):
        self.l = li
        self.p = pi

def imprimir_listaArch(lista):
    for i in range(0, len(lista)):
        print("Archivo", i, ":",lista[i].l,lista[i].p)

def ordenar_cinta(lista):
    if(len(lista) == 1):
        return lista
    else:
        menor = 200
        elem = 0
        for i in range(0, len(lista)):
            if(lista[i].p / lista[i].l < menor):
                menor = lista[i].p / lista[i].l
                elem = i
        arch = lista.pop(elem)
        lista_ret = ordenar_cinta(lista)
        lista_ret.append(arch)
        return lista_ret

listaArch = []
for i in range(0,5):
    arch = Archivo(randint(1, 200), randint(1, 10))
    listaArch.append(arch)

imprimir_listaArch(listaArch)
listaArchOrd = ordenar_cinta(listaArch)
print("\nResultado: ")
imprimir_listaArch(listaArchOrd)
