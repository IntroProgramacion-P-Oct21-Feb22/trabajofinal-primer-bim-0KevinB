''''Elaborar un programa que permita leer un número par y calcule e imprima la suma de los números pares del 2 hasta
el número leído. Si el número leído es menor a 2 debe imprimir un mensaje de error.
'''
numero = int (input("Ingrese un numero PAR y mayor a 2: "))
suma = int (0)
contador = int (0)

if (numero % 2 == 1) :
    print("Ingrese un numero par")
elif (numero <= 2):
    print("Ingrese un numero mayor a 2")
else:
    while (contador <= numero):
        contador = contador + 1
        if (contador % 2 == 0):
            suma = contador + suma
    print("La suma de los numeros pares es: " + str (suma))
