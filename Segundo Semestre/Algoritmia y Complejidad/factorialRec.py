def factorial(n):
    if(n == 1):
        return 1
    else:
        return n + factorial(n-1)

n = int(input("Introduzca el numero del cual se quiere calcular el factorial: "))
print("Factorial:", factorial(n))
