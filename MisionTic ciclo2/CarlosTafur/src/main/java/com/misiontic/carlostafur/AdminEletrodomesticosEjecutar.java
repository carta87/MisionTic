package com.misiontic.carlostafur;

import ClasesEletrodomesticos.*;
import java.util.Date;

/**
 * clase encargada de instanciar los objectos de las clases creadas y 
 * hacer uso de las relaciones entre algunas de ellas al ejecutarls
 * @author Carlos Tafur - reto 2
 */
public class AdminEletrodomesticosEjecutar {
    
    public static void main(String[] args) {
        
        System.out.println("\nRealizaremos una comparacion entre dos licuadoras cual es mayor valor comercial");
        //creando Objectos  y realizando la comparacion entre su valor comercial y mostrar por consola
        VasoLicuadora vasLicuadora001 = new VasoLicuadora("vidrio", 12.5f);
        Licuadora licuadora1 = new Licuadora((byte)14, (byte)8, "licaudora380", 120000, 2015, "SAMSUNG", vasLicuadora001);
        
        VasoLicuadora vasLicuadora002= new VasoLicuadora("vidrio", 14.5f);
        Licuadora licuadora2 = new Licuadora((byte)28, (byte)12, "licaudora499", 150000, 2018, "LG", vasLicuadora002);
        
        
        if (licuadora1.getValorComercial() > licuadora2.getValorComercial()){
            System.out.println("el valor comercial de "+ licuadora1.getNombre()+ " es mayor a " + licuadora2.getNombre() );
        } else {
            if (licuadora1.getValorComercial() < licuadora2.getValorComercial()){
             System.out.println("el valor comercial de "+ licuadora2.getNombre()+ " es mayor a " + licuadora1.getNombre() );   
            } else{
                System.out.println("el valor comercial de "+ licuadora2.getNombre()+ " es igual a  " + licuadora1.getNombre() );   
            }
        }
        
        
        //llamando metodos de compartamiento de objectos para ser mostrados en consola
        System.out.println("\nMostrara el llamado de algunos metodos de objectos");
        licuadora1.ubicacion("cosina");
        licuadora1.encendidoApagado(true);
        licuadora2.encendidoApagado(false);
        
        //si tuvieramos una lavadora secadora, seteamos su valor para ser llamado
        System.out.println("\nCuando la lavadora puede tener sercadora");
        Secadora secadora1 = new Secadora((byte)124);
        Lavadora lavadora1 = new Lavadora((byte)120, (byte)8, "lavad3899", 150000, 2029, "LG");
        lavadora1.setSecadora(secadora1);
        System.out.println("la lavodora con nombre " +  lavadora1.getNombre() +" tiene ademas una secadora con capacidad de carga  " + secadora1.getCapacidadCargaSecado());
        System.out.println("Pondremos a lavar primero la lavadora ");
        lavadora1.encendidoApagado(true);
        
        
        //comparacion entre dos fechas de compra realizando instancias de objectos y mostrar su resultado por consola
        System.out.println("\nComparacion de antiguedad entre dos planchas segun su fecha de compra  ");
        
        Date hoy = new Date();
        int anhio = hoy.getYear() + 1900;
         
        Plancha plancha1 = new Plancha(0f, -22f, " plancha900", 120000, 2015, "LG");
        Plancha plancha2 = new Plancha(0f, -29f, " plancha1006", 150000, 2019, "LG");
        
        int anhioCompraPlan1 = anhio - plancha1.getAnioFechaCompra();
        int anhioCompraPlan2 = anhio - plancha2.getAnioFechaCompra();

        if (anhioCompraPlan1 > anhioCompraPlan2) {
            System.out.println("La fecha de compra es mas antigua de  " + plancha1.getNombre() + "  que de " + plancha2.getNombre());
        } else {
            if (anhioCompraPlan1 > anhioCompraPlan2) {
                System.out.println("La fecha de compra es mas antigua es " + plancha2.getNombre() + "  que de " + plancha1.getNombre());
            } else {
                System.out.println("La fecha de compra de " + plancha1.getNombre() + " y " + plancha2.getNombre() + " es la misma");
            }

        }
        
    }
    
}
