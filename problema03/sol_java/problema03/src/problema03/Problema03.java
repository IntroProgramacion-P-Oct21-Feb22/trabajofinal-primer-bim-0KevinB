/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Elaborar un programa que permita leer los datos de un empleado (nombre, 
    tipo de empleado, número de horas trabajadas y cuota que se le paga por 
    hora) y calcule e imprima el sueldo por pagar. Si el empleado es tipo 1 se
    le pagan las horas extras (más de 40 horas) a 1.5 de la cuota por hora, si
    es tipo 2, a 2, si es tipo 3, a 2.5, y si es tipo 4, a 3 veces la cuota 
    por hora.*/

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        int tipo;
        double horas;
        double extra;
        double sueldo;
        double salario_final;
        System.out.println("Ingrese su nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el tipo de empleado");
        tipo = entrada.nextInt();
        System.out.println("Ingrese el numero de horas de trabajo semanales");
        horas = entrada.nextDouble();
        System.out.println("Ingrese su cuota por hora");
        sueldo = entrada.nextDouble();

        if ((horas > 40) && (tipo == 1)) {
            extra = (horas - 40);
            extra = (extra * 1.5);
            salario_final = (40 * sueldo) + extra;
            System.out.println("Su salario final es: " + salario_final);
        } else {
            if ((horas > 40) && (tipo == 2)) {
                extra = horas - 40;
                extra = (extra * 2);
                salario_final = (40 * sueldo) + extra;
                System.out.println("Su salario final es: " + salario_final);
            } else {
                if ((horas > 40) && (tipo == 3)) {
                    extra = horas - 40;
                    extra = (extra * 2.5);
                    salario_final = (40 * sueldo) + extra;
                    System.out.println("Su salario final es: " + salario_final);
                } else {
                    if ((horas > 40) && (tipo == 4)) {
                        extra = horas - 40;
                        extra = (extra * 3);
                        salario_final = (40 * sueldo) + extra;
                        System.out.println("Su salario final es: " 
                                + salario_final);
                    } else {
                        if ((horas <= 40) && ((tipo == 4 || tipo == 3
                         || tipo == 2 || tipo == 1))) {
                        salario_final = horas * sueldo;
                            System.out.println("Su salario final es: " + 
                                    salario_final);
                    }
                }
            }
        }
    }
}
}