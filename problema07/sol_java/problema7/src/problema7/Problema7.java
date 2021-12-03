/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema7;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Elaborar un programa que permita leer un número par y calcule e 
        imprima la suma de los números pares del 2 hasta el número leído. Si 
        el número leído es menor a 2 debe imprimir un mensaje de error.*/

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int numero;
        int suma = 0;
        int contador = 0;

        System.out.println("Ingrese un par numero, el numero debe ser mayor a 2");
        numero = entrada.nextInt();
        if (numero % 2 == 1) {
            System.out.println("Ingrese un numero par");
        } else {
            if (numero < 2) {
                System.out.println("Ingrese un numero mayor a 2");
            } else {
                while (contador <= numero) {
                    contador = contador + 1;
                    if (contador % 2 == 0) {
                        suma = contador + suma;
                    }

                }
            }
            System.out.println(suma);

        }
    }
}
