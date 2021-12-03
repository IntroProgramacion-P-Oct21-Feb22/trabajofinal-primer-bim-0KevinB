/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.pkg09;

import java.util.Locale;
import static java.util.Locale.US;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Utilizando una estructura repetitiva diseñe un algoritmo para 
        calcular e imprimir los k primeros términos de la serie:
        S1 = 12−11+24−22+36−33+48−44 */
        // Creo que hay un error con el limite 
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadena = "";
        int numero1 = 12;
        int numero2 = 11;
        int caracter = 1;
        while (numero1 <= 48) {
            cadena = String.format("%s%s-%s+",
                    cadena,
                    numero1,
                    numero2);
            numero1 = numero1 + 12;
            numero2 = numero2 + 11;
            caracter = cadena.length();
            cadena = cadena.substring(0, caracter - 1);
            System.out.println(cadena);
        }

    }
}
