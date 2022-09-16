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
public class Veterinaria {
    private String codigoV;
    private String nombreV;
    private String telefonoV;
    private Medico medico;//relacion de composicion con la clase medico

    public Veterinaria(String codigoV, String nombreV, String telefonoV, Medico medico) {
        this.codigoV = codigoV;
        this.nombreV = nombreV;
        this.telefonoV = telefonoV;
        this.medico = medico;
    }
    
    
    

    /**
     * @return the codigoV
     */
    public String getCodigoV() {
        return codigoV;
    }

    /**
     * @param codigoV the codigoV to set
     */
    public void setCodigoV(String codigoV) {
        this.codigoV = codigoV;
    }

    /**
     * @return the nombreV
     */
    public String getNombreV() {
        return nombreV;
    }

    /**
     * @param nombreV the nombreV to set
     */
    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }

    /**
     * @return the telefonoV
     */
    public String getTelefonoV() {
        return telefonoV;
    }

    /**
     * @param telefonoV the telefonoV to set
     */
    public void setTelefonoV(String telefonoV) {
        this.telefonoV = telefonoV;
    }

    /**
     * @return the medico
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    
    
    
}
