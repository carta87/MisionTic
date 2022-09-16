/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import ClasesMascotas.Mascota;
import ClasesMascotas.Perro;
import model.ModelPeroo;
import model.ModeloGato;

/**
 *
 * @author USUARIO
 */
public class CtolMascotas {

    private ModelPeroo  modelPerro;
    private ModeloGato modeloGato;
    
    public CtolMascotas() {
        this.modelPerro = new ModelPeroo();
        this.modeloGato = new ModeloGato();
    }

    public boolean crearMascota(Mascota masc) {

        try {
            //if(masc.getTipoAnimal().equals("Perro")) { }  AtravezCondicional
            switch (masc.getTipoAnimal()) {
                case "Perro":
                    this.modelPerro.crearMascota((Perro)masc);
                    break;
                case "Gato":
                   // this.modeloGato.crearMascota((Gato)masc); Por construir
                    break;
                case "Pajaro":
                    break;
            }
            return true;

        } catch (Exception e) {
            return false;
        }

    }
    
    public boolean editarMascota(Mascota masc) {

        try {
            //if(masc.getTipoAnimal().equals("Perro")) { }  AtravezCondicional
            switch (masc.getTipoAnimal()) {
                case "Perro": 
                    this.modelPerro.crearMascota((Perro)masc);
                    break;
                case "Gato":
                    break;
                case "Pajaro":
                    break;
            }
            return true;

        } catch (Exception e) {
            return false;
        }

    }
    
    
    public Mascota buscarMascota(String codigo, String type) {
        Mascota mascotabusc = null;

        try {
            //if(masc.getTipoAnimal().equals("Perro")) { }  AtravezCondicional
            switch (type) {
                case "Perro":
                    mascotabusc = this.modelPerro.buscarMascota(codigo);
                    break;
                case "Gato":
                    break;
                case "Pajaro":
                    break;
            }
            return mascotabusc;

        } catch (Exception e) {
            return null;
        }

    }
    
    public boolean eliminarMascota(Mascota masc) {

        try {
            //if(masc.getTipoAnimal().equals("Perro")) { }  AtravezCondicional
            switch (masc.getTipoAnimal()) {
                case "Perro":
                    this.modelPerro.crearMascota((Perro)masc);
                    break;
                case "Gato":
                    break;
                case "Pajaro":
                    break;
            }
            return true;

        } catch (Exception e) {
            return false;
        }

    }


}
