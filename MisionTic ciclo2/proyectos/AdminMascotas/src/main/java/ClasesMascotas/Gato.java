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
public class Gato  extends Mascota {
    private String raza; 

    public Gato(String raza, String codigo, String nombre, int anhioNac, String color, String estadoSalud) {
        super(codigo, nombre, anhioNac, color, estadoSalud);
        this.raza = raza;
    }
    
    //metodo maullar
    public void maullar(){
        System.out.println("El gato "+ this.getNombre() + " de color "+ super.getColor()+ " esta maullando");
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
    
    @Override
    public void setTipoAnimal(String tipoAnimal) {
        super.setTipoAnimal("Gato"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTipoAnimal() {
        return super.getTipoAnimal(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
