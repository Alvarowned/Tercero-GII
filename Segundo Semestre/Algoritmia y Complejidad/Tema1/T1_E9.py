# T1-E9

n = int(input("Inserta un numero: "))
print("El resultado del sumatorio del numero:",n,"es",sumatorioRecurisvo(n))

def sumatorioRecurisvo(num):
    if (num == 0):
        return 0
    return num + sumatorioRecurisvo(num - 1)

