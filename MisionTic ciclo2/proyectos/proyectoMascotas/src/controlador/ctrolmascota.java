/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import ClasesMascotas.*;
import datosconexion.*;
import java.util.LinkedList;
/**
 *
 * @author Esquivel_Cesar
 */
public class ctrolmascota {
    private modelperro modeloperro;
    private modelogato modelgato;
    
    public ctrolmascota(){
        this.modeloperro = new modelperro();
        this.modelgato = new modelogato();
        
        
    }
    
    public boolean CrearMascota(mascota mascotas)
    {
        try{
            switch (mascotas.tipoanimal())
            {
                case "Perro":
                   this.modeloperro.crearMascota((clsPerro)mascotas);
                    break;
                case "Gato":
                    this.modelgato.crearMascota((clsGato)mascotas);
                    break;         
               
            }
            return true;
        }catch (Exception e)
        {
                return false;
             
        }
    }
    
    public mascota BuscarMascota(String codigo, String type){
        
        mascota mascotas = null;
        
        try {
            switch(type){
                case "Perro":
                    mascotas = this.modeloperro.BuscarMascota(codigo);
                    break;
                case "Gato":
                    mascotas = this.modelgato.buscarMascota(codigo);
                    break;
            }
            return mascotas;
        } catch (Exception e) {
            return null;
        }
    }
    
 
    public  boolean EditarMascota(mascota mascotas){
        try {
            switch(mascotas.tipoanimal()){
                case "Perro":
                    this.modeloperro.EditarMascota((clsPerro)mascotas);
                    break;
                case "Gato":
                    this.modelgato.editarMascota((clsGato)mascotas);
                    break;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean eliminarMascota( mascota mascotas){
        try {
            switch(mascotas.tipoanimal()){
                case "Perro":
                    this.modeloperro.eliminarMascota((clsPerro)mascotas);
                    break;
                case "Gato":
                    this.modelgato.eliminarMascota((clsGato)mascotas);
                    break;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
     public LinkedList <mascota>  ListarMascota(String type){
        LinkedList<mascota> mascotas = null;
        try{
            switch (type)
            {
                case "Perro":
                   mascotas = this.modeloperro.ListarMascota();
                    break;
                
                case "Gato":
                    break;
            }
            return mascotas;
        }catch (Exception e)
        {
                return null;
             
        }
    }
    
}
