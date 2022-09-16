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
    
    
    //constructor vacio
    public ctrolmascota(){
        //instanciamos el objero modeloperro para hacer el puente entre el modelo y el controlador
        this.modeloperro = new modelperro();
    }
    
    
    //método booleano para si saber si se inserto o no una mascota
    public boolean CrearMascota(mascota mascotas)
    {
        try{
            switch (mascotas.tipoanimal())
            {
                case "Perro":
                   this.modeloperro.CrearMascota((clsPerro)mascotas);
                    break;
                
                case "Gato":
                    break;
            }
            return true;
        }catch (Exception e)
        {
                return false;
             
        }
    }
    
    //el type nos permite buscar el tipo de mascota que le pasamos en el case mediante el codigo
    // y la busqueda de la mascota se hace mediante el codigo
    public mascota BuscarMascota(String codigo, String type){
        mascota mascotas = null;
        try{
            switch (type)
            {
                case "Perro":
                   mascotas = this.modeloperro.BuscarMascota(codigo);
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
    
    
 public boolean EditarMascota(mascota mascotas)
    {
        try{
            switch (mascotas.tipoanimal())
            {
                case "Perro":
                    //llamamos el modelo en la clase editar
                   this.modeloperro.EditarMascota((clsPerro)mascotas);
                    break;
                
                case "Gato":
                    break;
            }
            return true;
        }catch (Exception e)
        {
                return false;
             
        }
    }
 
 
 public boolean EliminarMascota(mascota mascotas)
    {
        try{
            switch (mascotas.tipoanimal())
            {
                case "Perro":
                    //llamamos el modelo en la clase editar
                   this.modeloperro.EliminarMascota((clsPerro)mascotas);
                    break;
                
                case "Gato":
                    break;
            }
            return true;
        }catch (Exception e)
        {
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
