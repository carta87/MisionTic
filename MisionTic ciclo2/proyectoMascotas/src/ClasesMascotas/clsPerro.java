/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesMascotas;

/**
 *
 * @author Esquivel_Cesar
 */
public class clsPerro extends mascota {
    private int idperro;
    private String raza;
    private boolean pedigree;
    
    
    // CONSTRUCTOR

    public clsPerro(int idperro, String raza, boolean pedigree, int id, String codigo, String nombre, int anioNac, String color, String estadoSalud) {
        super(id, codigo, nombre, anioNac, color, estadoSalud);
        this.idperro = idperro;
        this.raza = raza;
        this.pedigree = pedigree;
    }

   

    

   
    //Crear un tipo de animal
    @Override
    public String tipoanimal(){
        return "Perro";
    }

  
  
    @Override
    public void sonido(){
        System.out.println("El perro" + super.getNombre() + " esta ladrando ");
    }
    
    
    
    
    public void ladrar(){
        
        System.out.println("El perro" + super.getNombre() + " esta ladrando ");
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
     * @return the pedigree
     */
    public boolean getPedigree() {
        return pedigree;
    }

    /**
     * @param pedigree the pedigree to set
     */
    public void setPedigree(boolean pedigree) {
        this.pedigree = pedigree;
    }

    

    /**
     * @return the idperro
     */
    public int getIdperro() {
        return idperro;
    }

    /**
     * @param idperro the idperro to set
     */
    public void setIdperro(int idperro) {
        this.idperro = idperro;
    }

   
    
    
}
