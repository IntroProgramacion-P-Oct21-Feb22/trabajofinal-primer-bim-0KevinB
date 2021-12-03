'''
Elaborar un programa que permita leer 3 números e imprima el mayor. Debe validar que sean diferentes, es decir, si hay
números iguales debe enviar un mensaje de error.
'''
a = int(input("Ingrese un numero: "))
b = int(input("Ingrese un numero: "))
c = int(input("Ingrese un numero: "))

if (a != b and a != c and b != c):
    if (a > b and a > c):
        print("El numero mayor es: " + str(a))
    elif (b > c and b > a):
        print("El numero mayor es: " + str(b))
    elif (c > a and c > b):
        print("El numero mayor es: " + str(c))
else:
    print("Los tres numeros deben ser distintos")