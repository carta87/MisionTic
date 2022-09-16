/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import ClasesMascotas.Mascota;
import ClasesMascotas.Perro;

/**
 *
 * @author USUARIO
 */
public class ModelPeroo {
    
    public boolean crearMascota(Perro perro) {

        try {
            
            return true;

        } catch (Exception e) {
            return false;
        }

    }
    
    public boolean editarMascota(Perro perro) {

        try {
            
            return true;

        } catch (Exception e) {
            return false;
        }

    }
    
    
    public Mascota buscarMascota(String codigo) {
        Perro perro = null;

        try {
           
            return perro;

        } catch (Exception e) {
            return perro;
        }

    }
    
    public boolean eliminarMascota(Perro perro) {

        try {
            
            return true;

        } catch (Exception e) {
            return false;
        }

    }

    
}
