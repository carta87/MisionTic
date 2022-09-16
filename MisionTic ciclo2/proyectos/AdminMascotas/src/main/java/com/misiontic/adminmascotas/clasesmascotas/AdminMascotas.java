/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.adminmascotas.clasesmascotas;

import ClasesMascotas.*;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class AdminMascotas {

    public static void main(String[] args) {
        
        Perro perro1 = new Perro("Doberman", true, "001", "bob", 2015, "blanco", "Saludable");
        Gato gato1 = new Gato("Angora", "001", "crispi", 2018, "negro", "enfermo");
        
       // Veterinaria vet1 = new Veterinaria("01", "lindasMascotas", "031-7909797", medico);

        Date hoy = new Date();
        int anhio = hoy.getYear() + 1900;
        System.out.println(anhio);

        int edadPerro1 = anhio - perro1.getAnhioNac();
        int edadGato1 = anhio - gato1.getAnhioNac();

        if (edadPerro1 > edadGato1) {
            System.out.println("la mascotas " + perro1.getNombre() + " es mayor que " + gato1.getNombre());
        } else {
            if (edadPerro1 > edadGato1) {
                System.out.println("la mascotas " + gato1.getNombre() + " es mayor que " + perro1.getNombre());
            } else {
                System.out.println("la mascotas " + perro1.getNombre() + " y " + gato1.getNombre() + " tienen la misma edad");
            }

        }

//        // instaciar objecto
//        Mascota perro1 = new Mascota(001, "Tony", 2015, "cafe", "saludable");
//        perro1.comer();
//        perro1.moverse();
//        
//        Mascota perro2 = new Mascota();
//        perro2.setNombre("yordan");
//        perro2.setCodigo(002);
//        perro2.setAnhioNac(2015);
//        perro2.setColor("gris");
//        perro2.setEstadoSalud("enfermo");
//        perro2.comer();
//        perro2.moverse();
//        
//        Date hoy = new Date();
//        int anhio = hoy.getYear()+ 1900;
//        System.out.println(anhio);
//        
//        int edadPerro1 = anhio - perro1.getAnhioNac();
//        int edadPerro2 = anhio - perro2.getAnhioNac();
//        
//        if(edadPerro1 > edadPerro2){
//            System.out.println("la mascotas " + perro1.getNombre()+ " es mayor que "+ perro2.getNombre());
//        }else{
//             if(edadPerro1 > edadPerro2){
//                 System.out.println("la mascotas " + perro2.getNombre()+ " es mayor que "+ perro1.getNombre());
//             }else {
//                 System.out.println("la mascotas " + perro1.getNombre()+ " y "+ perro1.getNombre()+ " tienen la misma edad");
//             }
//            
//        }
    }

}
