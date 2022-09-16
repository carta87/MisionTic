/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import ClasesMascotas.*;
import datosconexion.*;
/**
 *
 * @author Esquivel_Cesar
 */
public class ctrolmascota {
    private modelperro modeloperro;
    
    public ctrolmascota(){
        this.modeloperro = new modelperro();
    }
    
    public boolean CrearMascota(mascota mascotas)
    {
        try{
            switch (mascotas.tipoanimal())
            {
                case "Perro":
                   this.modeloperro.CrearMascota((clsPerro)mascotas);
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
                case "perro":
                    mascotas = this.modeloperro.BuscarMascota(codigo);
                    break;
                case "Gato":
                    break;
            }
            return mascotas;
        } catch (Exception e) {
            return null;
        }
    }
    
 
    public  boolean EditarMascota(mascota mascota){
        boolean resp = false;
        mascota mascotas = null;
        try {
            switch(mascota.tipoanimal()){
                case "perro":
                    resp = this.modeloperro.EditarMascota((clsPerro)mascotas);
                    break;
                case "Gato":
                    break;
            }
            return resp;
        } catch (Exception e) {
            return false;
        }
    }
}
