def esPrimo(n):
    for i in range(2,n//2):
        if(n % i == 0):
            return False
    return True

numero = int(input("Escriba el número a comprobar si es primo: "))

if(esPrimo(numero)):
    print("El numero es primo.")
else:
    print("El numero no es primo.")
