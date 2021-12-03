'''
En un almacén de venta de trajes, si se compra uno se hace el 20% de descuento, si se compran 2, el 25%, si se
compran 3, el 40%, y si compra más de 3, el 50%. Elaborar un algoritmo que lea la cantidad de trajes y el precio
unitario (todos tienen el mismo precio) e imprima el subtotal por pagar, el descuento y el total por pagar.
'''
trajes = int(input('Ingresa el numero de trajes comprados: '))
precio_unitario = float(input('Ingresa el costo unitario: '))
descuento = float
porcentaje = float
subtotal = float
total = float
if (trajes == 1):
    porcentaje = 20
    descuento = (precio_unitario * trajes) * porcentaje / 100
    subtotal = (precio_unitario * trajes)
    total = (precio_unitario * trajes) - descuento
    print("Su subtotal a pagar es: " + str(subtotal))
    print("Su descuento es: " + str(descuento))
    print("Su total a pagar es: " + str(total))
elif (trajes == 2):
    porcentaje = 25
    descuento = (precio_unitario * trajes) * porcentaje / 100
    subtotal = (precio_unitario * trajes)
    total = (precio_unitario * trajes) - descuento
    print("Su subtotal a pagar es: " + str(subtotal))
    print("Su descuento es: " + str(descuento))
    print("Su total a pagar es: " + str(total))
elif (trajes == 3):
    porcentaje = 40
    descuento = (precio_unitario * trajes) * porcentaje / 100
    subtotal = (precio_unitario * trajes)
    total = (precio_unitario * trajes) - descuento
    print("Su subtotal a pagar es: " + str(subtotal))
    print("Su descuento es: " + str(descuento))
    print("Su total a pagar es: " + str(total))
elif (trajes > 3):
    porcentaje = 50
    descuento = (precio_unitario * trajes) * porcentaje / 100
    subtotal = (precio_unitario * trajes)
    total = (precio_unitario * trajes) - descuento
    print("Su subtotal a pagar es: " + str(subtotal))
    print("Su descuento es: " + str(descuento))
    print("Su total a pagar es: " + str(total))