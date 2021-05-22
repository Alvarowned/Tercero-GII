# T1-E5

def esPrimo (num):
    return esPrimoAux(num, 2)

def esPrimoAux (num, div):
    if(num % div == 0 and num != 2):
        return False
    elif(div > numero / 2):
        return True
    else:
        return esPrimoAux(num, div+1)

numero = int(input("Escriba el número a comprobar si es primo: "))

if(esPrimo(numero)):
    print("El numero es primo.")
else:
    print("El numero no es primo.")
