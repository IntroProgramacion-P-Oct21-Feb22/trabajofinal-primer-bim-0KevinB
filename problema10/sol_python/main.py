''''
Realice un algoritmo que lea un número de datos y calcule la media y la varianza de los mismos. El usuario decide
cuando no ingresar más números.
'''
contador = 0
suma = 0
varianza = 0
resta = 0
bandera = True

while (bandera == True):
    numero = int(input("Ingrese un numero: "))

    if numero != 0:
        suma = numero + suma
        contador = contador + 1
        promedio = suma / contador
        resta = (resta + (numero - promedio)**2)
        varianza = varianza + (resta / contador)
    salida = str(input("Ingrese SALIR para terminar: "))
    if salida == "SALIR" or salida == "salir" or salida == "Salir":
        bandera = False



print('El promedio de los {} numeros es igual a {} y la varianza es {}'.format(contador, promedio, varianza))