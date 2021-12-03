''''
Elaborar un programa que calcule e imprima la suma 1 + 1/2 + 1/3 + 1/4 ... + 1/100.
'''
numerador = int(1)
denominador = int(1)
suma = 0
while (denominador <= 100):
    division = (numerador/denominador)
    suma = suma + division
    redondear = round(suma, 2)
    print(str (numerador) + "/" + str (denominador) + " La suma es " + str(redondear))
    denominador = denominador + 1