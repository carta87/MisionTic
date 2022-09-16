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
public class Perro extends Mascota{
    private String raza;
    private boolean peligri;

    public Perro(String raza, boolean peligri, String codigo, String nombre, int anhioNac, String color, String estadoSalud) {
        super(codigo, nombre, anhioNac, color, estadoSalud);
        this.raza = raza;
        this.peligri = peligri;
    }

    

    
    //crear metodo ladrar
    public void ladrar(){
        System.out.println("el perro " + super.getNombre()+ " esta ladrando");
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

    /**
     * @return the peligri
     */
    public boolean getPeligri() {
        return peligri;
    }

    /**
     * @param peligri the peligri to set
     */
    public void setPeligri(boolean peligri) {
        this.peligri = peligri;
    }

    @Override
    public void setTipoAnimal(String tipoAnimal) {
        super.setTipoAnimal("Perro"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTipoAnimal() {
        return super.getTipoAnimal(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
