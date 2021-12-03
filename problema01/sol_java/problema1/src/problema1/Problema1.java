/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author 0KevinB
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Rectángulo tiene un ángulo recto (igual a 90°)
        Obtusángulo tiene un ángulo obtuso (mayor que 90° pero menor 180°)
        Acutángulo los tres ángulos son agudos (menor que 90°) Elaborar un 
        algoritmo que permita leer el tamaño de los tres ángulos (A,B,C) de 
        un triángulo e imprima qué tipo es.*/

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double angulo1;
        double angulo2;
        double angulo3;
        System.out.println("Ingrese el angulo A");
        angulo1 = entrada.nextDouble();
        System.out.println("Ingrese el angulo B");
        angulo2 = entrada.nextDouble();
        System.out.println("Ingrese el angulo C");
        angulo3 = entrada.nextDouble();
        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            System.out.println("Su triangulo es uno rectangulo");
        } else {
        if ((angulo1 > 90 && angulo1 < 180) || (angulo2 > 90 && angulo2 < 180)
                || (angulo3 > 90 && angulo3 < 180)) {
            System.out.println("Su triangulo es uno obtusangulo");
        } else {
        if (angulo1 < 90 || angulo2 < 90 || angulo3 < 90) {
            System.out.println("Su triangulo es uno acutangulo");
        }
    }
        }
}
}