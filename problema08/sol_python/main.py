''''
Elaborar un programa que permita leer una medida (N) en número de metros y que imprima una tabla de equivalencias
a yardas, pulgadas y pies, desde 1 metro hasta N metros de uno en uno. Equivalencias: 1 pie = 12 pulgadas,
1 yarda = 3 pies, 1 pulgada = 2.54 cm, 1 metro = 100 cm. Se debe imprimir las conversiones:
'''
metros = float(input("Ingrese un numero en metros: "))
contador = 1


while (contador <= metros):
    centimetros = float(contador * 100)
    pulgadas = round(centimetros/2.54, 2)
    pies = round(pulgadas/12, 2)
    yardas = round(pies/3, 2)
    print("El valor de: " + str (contador) + " m en yardas es: " + str(yardas))
    print("El valor de: " + str (contador) + " m en pies es: " + str(pies))
    print("El valor de: " + str (contador) + " m en pulgadas es: " + str(pulgadas))
    contador = contador + 1