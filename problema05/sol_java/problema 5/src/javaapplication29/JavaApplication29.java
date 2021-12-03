/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication29;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Dados dos puntos X y Y , que son las coordenadas del plano 
        cartesiano, haga un algoritmo para clasificar el cuadrante del plano 
        donde está ubicada la coordenada (X, Y ).*/
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double x;
        double y;
        System.out.println("Ingresa el punto X");
        x = entrada.nextDouble();
        System.out.println("Ingresa el punto Y");
        y = entrada.nextDouble();
        
        if (x > 0 && y > 0){
            System.out.println("Primer cuadrante");
        } else {
            if (x < 0 && y > 0){
                System.out.println("Segundo cuadrante");
            } else { 
                if (x < 0 && y < 0){
                    System.out.println("Tercere cuadrante");
                } else {
                    if (x > 0 && y < 0) {
                        System.out.println("Cuarto cuadrante");
                    } else {
                        System.out.println("Esta el punto (0,0)");
                    }
                }
            }
    }   }
}
