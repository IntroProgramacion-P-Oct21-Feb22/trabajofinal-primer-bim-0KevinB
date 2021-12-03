''''
Utilizando una estructura repetitiva diseñe un algoritmo para calcular e imprimir los k primeros términos de
la serie:
S1 = 12−11+24−22+36−33+48−44
'''
# El ejercicio pide "K terminos"
numero1 = int(12)
numero2 = int(11)
contador = 1
cadena = ""
caracter = "+"
while (contador <= 4):
    cadena = (cadena + str(numero1) + "-" + str(numero2) + "+")

    contador = contador + 1
    numero1 = numero1 + 12
    numero2 = numero2 + 11
    cadena_final = cadena[:-1]
    print(cadena_final)