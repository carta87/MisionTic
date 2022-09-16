/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import javax.swing.JOptionPane;

/**
 *Calculadora utilizando la clase JOptionPane y condicionales en uns sola sentencia
 * @author Carlos T.
 */
public class calculadoraMejorada {

    public static void main(String[] args) {
        byte  num1=0, num2 = 0;
        int  opc;

        do {
            opc =  Integer.parseInt(JOptionPane.showInputDialog(" ====MENU PRINCIPAL CALCULADORA =====\n"
                + " 1. SUMA \n"  + " 2. RESTA\n"  + " 3. MULTIPLICACION\n" + " 4. DIVISION \n"  + " 5. SALIR\n")) ;
            
            if (opc== 5){ }
            else {
            Operaciones calculadora = new Operaciones();
            int mostrarResult = calculadora.operaciones(opc, num1, num2);
            JOptionPane.showConfirmDialog(null, " el resultado de la operacion es " + mostrarResult);
            }
            
        } while (opc != 5);

        JOptionPane.showConfirmDialog(null, "Gracias por utilizr la calculadora en Java");
    }
}
class Operaciones {
    
    public int operaciones(int opc, int num1, int num2) {
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el primer numero  "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el segundo numero  "));
        
        int resut = 0;
        
        if (opc == 1) resut = num1 + num2; //suma 
        
        if (opc == 2) resut = num1 - num2; //resta 
        
        if (opc == 3) resut = num1 * num2; //multiplicacion
        
        if (opc == 4) 
            if (num1 == 0 || num2 == 0)JOptionPane.showInputDialog("No es posbible dividir por cero ");
            else  JOptionPane.showInputDialog((" El resultado de la resta es " + (num1 / num2) + "\n\n"));
 
        return resut;
    }
}