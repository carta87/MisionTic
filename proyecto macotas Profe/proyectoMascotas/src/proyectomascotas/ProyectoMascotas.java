/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectomascotas;
import ClasesMascotas.*;
import java.util.Date;
/**
 *
 * @author Esquivel_Cesar
 */
public class ProyectoMascotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //instanciamos un objeto tipo perro
        clsPerro perro1 = new clsPerro(2345, "ChauChau", true, 1,"321", "Kaiser", 210, "Cafe", "Sano");
       
              
        //instanciamos un objeto tipo gato
        
        clsGato gato1 = new clsGato("Angora", 1,  "431", "Minino", 2011, "Gris", "Sano");
        
      
        Date fecha_hoy = new Date();
        int aniohoy = fecha_hoy.getYear();
        int edad1 = aniohoy - perro1.getAnioNac();
        int edad2 = aniohoy - gato1.getAnioNac();
        
        if (edad1 > edad2){
            System.out.println("La mascota " + perro1.getNombre() + " de raza " + perro1.getRaza() + " es mayor a la mascota " + gato1.getNombre() );
        }
        else{
            if (edad2 > edad1){
            System.out.println("La mascota " + gato1.getNombre() + " de raza " + gato1.getRaza() + " es mayor a la mascota " + perro1.getNombre());
        }
            else{
                System.out.println("La mascota " + gato1.getNombre() + " de raza " + gato1.getRaza() + " tiene la misma edad a la mascota " + perro1.getNombre());
            }
        
        }
        
        perro1.Comer();
        gato1.Comer();
        perro1.Moverse();
        perro1.ladrar();
        gato1.caminar();
    
    }
    
}
