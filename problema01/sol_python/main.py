'''
Tomando con referencia la clase de sus ángulos, los triángulos se clasifican en:

Rectángulo tiene un ángulo recto (igual a 90°)
Obtusángulo tiene un ángulo obtuso (mayor que 90° pero menor 180°)
Acutángulo los tres ángulos son agudos (menor que 90°)
Elaborar un algoritmo que permita leer el tamaño de los tres ángulos (A,B,C) de un triángulo
e imprima qué tipo es.
'''
a = float(input('Ingresa el angulo a: '))
b = float(input('Ingresa el angulo b: '))
c = float(input('Ingresa el angulo c: '))

if (a + b + c == 180) and a != 0 and b != 0 and c != 0:
    if a == 90 or b == 90 or c == 90:
        print("Triángulo rectángulo")
    elif (a > 90 and a < 180) or (b > 90 and b < 180) or (c > 90 and c < 180):
        print("Triángulo obtusangulo")
    else:
        print("Triangulo acutangulo")
else:
    print("Triangulo incorrecto")



