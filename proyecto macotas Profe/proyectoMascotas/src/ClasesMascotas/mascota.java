/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesMascotas;
import Interfaces.*;
/**
 *
 * @author Esquivel_Cesar
 */
public class mascota implements intmascota {
    private int id;
    private String codigo;
    private String nombre;
    private int anioNac;
    private String color;
    private String estadoSalud;
    private clsVeterinaria veterinaria;

    public mascota(int id, String codigo, String nombre, int anioNac, String color, String estadoSalud) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.anioNac = anioNac;
        this.color = color;
        this.estadoSalud = estadoSalud;
        
    }

   
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
     * @return the anioNac
     */
    public int getAnioNac() {
        return anioNac;
    }

    /**
     * @param anioNac the anioNac to set
     */
    public void setAnioNac(int anioNac) {
        this.anioNac = anioNac;
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
    public clsVeterinaria getVeterinaria() {
        return veterinaria;
    }

    /**
     * @param veterinaria the veterinaria to set
     */
    public void setVeterinaria(clsVeterinaria veterinaria) {
        this.veterinaria = veterinaria;
    }
    
    
     /* CREAR LOS METODOS MOVERSE Y COMER    */
    
    
    public void Moverse(){
        System.out.println("La mascota " + this.nombre + "se esta Moviendo ");
    }
    
    public void Comer(){
        System.out.println("La mascota " + this.nombre + " esta Comiendo ");
    }
    
    
    public void sonido(){
        System.out.println("La mascota " + this.getNombre() + " esta haciendo sonido ");
    }
    
    @Override
     public String tipoanimal(){
        return "animal";
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
}
