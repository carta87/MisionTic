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
public class Mascota {
    
    private String codigo;
    private String nombre;
    private int anhioNac;
    private String color;
    private String estadoSalud;
    private Veterinaria veterinaria;
    private String tipoAnimal;
    
    //constructor en vacio
    public Mascota() {
    }
    
    //constructor con parametros
    public Mascota(String codigo, String nombre, int anhioNac, String color, String estadoSalud) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.anhioNac = anhioNac;
        this.color = color;
        this.estadoSalud = estadoSalud;
    }
    
    
    public void comer(){
        System.out.println("la mascota "+ this.getNombre()+ " esta comiendo");
    }
    
    public void moverse(){
        System.out.println("la mascota "+ this.getNombre()+  " se esta moviendo");
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the anhioNac
     */
    public int getAnhioNac() {
        return anhioNac;
    }

    /**
     * @param anhioNac the anhioNac to set
     */
    public void setAnhioNac(int anhioNac) {
        this.anhioNac = anhioNac;
    }


    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the estadoSalud
     */
    public String getEstadoSalud() {
        return estadoSalud;
    }

    /**
     * @param estadoSalud the estadoSalud to set
     */
    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    /**
     * @return the veterinaria
     */
    public Veterinaria getVeterinaria() {
        return veterinaria;
    }

    /**
     * @param veterinaria the veterinaria to set
     */
    public void setVeterinaria(Veterinaria veterinaria) {
        this.veterinaria = veterinaria;    }

    /**
     * @return the tipoAnimal
     */
    public String getTipoAnimal() {
        return tipoAnimal;
    }

    /**
     * @param tipoAnimal the tipoAnimal to set
     */
    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;

    }
  
    
}