'''
Elaborar un programa que permita leer los datos de un empleado (nombre, tipo de empleado, número de horas trabajadas
y cuota que se le paga por hora) y calcule e imprima el sueldo por pagar. Si el empleado es tipo 1 se le pagan las
horas extras (más de 40 horas) a 1.5 de la cuota por hora, si es tipo 2, a 2, si es tipo 3, a 2.5, y si es tipo 4, a 3
veces la cuota por hora.
'''
empleado = str(input("Ingrese sus nombres completos: "))
horas = float(input("Ingrese el numero de horas trabajadas en la semana: "))
cuota = float(input("Ingrese la cuota por hora: "))
tipo = int(input("Ingrese el tipo de cliente que usted es: "))
extra = float
sueldo = float
if (tipo == 1 and horas > 40):
    extra = horas - 40
    sueldo = cuota * 40 + (extra * 1.5 * cuota)
    print("Su sueldo es " + str(sueldo))
elif (tipo == 2 and horas > 40):
    extra = horas - 40
    sueldo = cuota * 40 + (extra * 2 * cuota)
    print("Su sueldo es " + str(sueldo))
elif (tipo == 3 and horas > 40):
    extra = horas - 40
    sueldo = cuota * 40 + (extra * 2.5 * cuota)
    print("Su sueldo es " + str(sueldo))
elif (tipo == 4 and horas > 40):
    extra = horas - 40
    sueldo = cuota * 40 + (extra * 3 * cuota)
    print("Su sueldo es " + str(sueldo))
elif (horas <= 40):
    sueldo = cuota * horas
    print("Su sueldo es: " + str(sueldo))