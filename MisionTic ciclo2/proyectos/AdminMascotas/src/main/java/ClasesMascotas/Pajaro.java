/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesMascotas;

/**
 *
 * @author USUARIO
 */
public class Pajaro extends Mascota{
    private String raza;

    public Pajaro(String raza, String codigo, String nombre, int anhioNac, String color, String estadoSalud) {
        super(codigo, nombre, anhioNac, color, estadoSalud);
        this.raza = raza;
    }
    
    public void cantar(){
        System.out.println("El pajaro " + super.getNombre() + " esta cantando ");
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
