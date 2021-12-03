''''
Dados dos puntos X y Y , que son las coordenadas del plano cartesiano, haga un algoritmo para clasificar el cuadrante
del plano donde está ubicada la coordenada (X, Y ).
'''

x = float(input("Ingrese el punto X: "))
y = float(input("Ingrese el punto Y: "))

if (x > 0 and y > 0):
    print("Se encuentra en el primer cuadrante")
elif (x < 0 and y > 0):
    print("Se encuentra en el segundo cuadrante")
elif (x < 0 and y < 0):
    print("Se encuentra en el tercer cuadrante")
elif (x > 0 and y < 0):
    print("Se encuentra en el cuarto cuadrante")
else:
    print("Alguna variable esta en punto cero")