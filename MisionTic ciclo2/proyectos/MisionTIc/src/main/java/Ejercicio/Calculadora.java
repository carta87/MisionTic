/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String prueba= "domingo";
        String descripcion;
        descripcion = prueba;
        byte opc, num1, num2;

        do {
            System.out.println(" ====MENU PRINCIPAL CALCULADORA =====\n"
                    + " 1. SUMA \n"
                    + " 2. RESTA\n"
                    + " 3. MULTIPLICACION\n"
                    + " 4. DIVISION \n"
                    + " 5. SALIR\n");
            opc = teclado.nextByte();

            if (opc == 1) {//suma
                System.out.println(" Ingrese el primer numero  ");
                num1 = teclado.nextByte();

                System.out.println(" Ingrese el segundo numero  ");
                num2 = teclado.nextByte();
                int resul = num1 + num2;
                System.out.println(" El resultado de la suma es " + resul + "\n\n");
            }

            if (opc == 2) {//resta
                System.out.println(" Ingrese el primer numero  ");
                num1 = teclado.nextByte();

                System.out.println(" Ingrese el segundo numero  ");
                num2 = teclado.nextByte();
                int resul = num1 - num2;
                System.out.println(" El resultado de la resta es " + resul + "\n\n");
            }

            if (opc == 3) {//multiplicacion
                System.out.println(" Ingrese el primer numero  ");
                num1 = teclado.nextByte();

                System.out.println(" Ingrese el segundo numero  ");
                num2 = teclado.nextByte();
                int resul = num1 * num2;
                System.out.println(" El resultado de la resta es " + resul + "\n\n");
            }

            if (opc == 4) {//division
                System.out.println(" Ingrese el primer numero  ");
                num1 = teclado.nextByte();

                System.out.println(" Ingrese el segundo numero  ");
                num2 = teclado.nextByte();

                if (num1 == 0 || num2 == 0) {
                    System.out.println("No es posbible dividir por cero ");
                } else {
                    int resul = num1 / num2;
                    System.out.println(" El resultado de la resta es " + resul + "\n\n");
                }
            }

        } while (opc != 5);

        System.out.println("Gracias por utilizr la calculadora en Java");
    }
}
