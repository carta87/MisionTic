/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesMascotas;

/**
 *
 * @author Esquivel_Cesar
 */
public class clsGato extends mascota{
     private String raza;

    // CONSTRUCTOR

    public clsGato(String raza, int id,  String codigo, String nombre, int anioNac, String color, String estadoSalud) {
        super(id, codigo, nombre, anioNac, color, estadoSalud);
        this.raza = raza;
    }

    
    
    // METODO CAMINAR
    
    public void caminar(){
        
        System.out.println("El gato " + super.getNombre()+ " esta caminando ");
        
    }
    
    @Override
    public void sonido(){
        System.out.println("El gato" + super.getNombre() + " esta MaullandoSS ");
    }
    
    
    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    
   
}
