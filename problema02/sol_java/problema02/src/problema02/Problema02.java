/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 0KevinB
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* En un almacén de venta de trajes, si se compra uno se hace el 20% 
        de descuento, si se compran 2, el 25%, si se compran 3, el 40%, y si 
        compra más de 3, el 50%. Elaborar un algoritmo que lea la cantidad de 
        trajes y el precio unitario (todos tienen el mismo precio) e imprima 
        el subtotal por pagar, el descuento y el total por pagar.*/
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double precioU;
        int cantidad;
        double subtotal;
        double precio;
        double descuento;
        double porcentaje;
        System.out.println("Ingrese la cantidad de trajes que desea comprar");
        cantidad = entrada.nextInt();
        System.out.println("Ingrese el costo unitario");
        precioU = entrada.nextDouble();
        if (cantidad == 1) {
            porcentaje = 20;
            subtotal = precioU * cantidad;
            descuento = (precioU * cantidad * porcentaje) / 100;
            precio = subtotal - descuento;
            System.out.println("Su subtotal a pagar es: " + subtotal);
            System.out.println("Su descuento es: " + descuento);
            System.out.println("Su precio final es: " + precio);
        } else {
            if (cantidad == 2) {
                porcentaje = 25;
                subtotal = precioU * cantidad;
                descuento = (precioU * cantidad * porcentaje) / 100;
                precio = subtotal - descuento;
                System.out.println("Su subtotal a pagar es: " + subtotal);
                System.out.println("Su descuento es: " + descuento);
                System.out.println("Su precio final es: " + precio);
            } else {
                if (cantidad == 3) {
                    porcentaje = 40;
                    subtotal = precioU * cantidad;
                    descuento = (precioU * cantidad * porcentaje) / 100;
                    precio = subtotal - descuento;
                    System.out.println("Su subtotal a pagar es: " + subtotal);
                    System.out.println("Su descuento es: " + descuento);
                    System.out.println("Su precio final es: " + precio);
                } else {
                    if (cantidad > 3) {
                        porcentaje = 50;
                        subtotal = precioU * cantidad;
                        descuento = (precioU * cantidad * porcentaje) / 100;
                        precio = subtotal - descuento;
                        System.out.println("Su subtotal a pagar es: " + subtotal);
                        System.out.println("Su descuento es " + descuento);
                        System.out.println("Su precio final es: " + precio);
                    }
                }
            }
        }
    }
    
}
