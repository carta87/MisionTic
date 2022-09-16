/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author USUARIO
 */
public class Envio {
    private String idEnvio;
   
    private String idPago;
    private String dirreccionFacturacion;
    private boolean finalizado;
    private String fechaEnvio;
    private String compania;
    private Pago pago;

    public Envio(String idEnvio, String idPago, String dirreccionFacturacion, boolean finalizado, String fechaEnvio, String compania, Pago pago) {
        this.idEnvio = idEnvio;
        this.idPago = idPago;
        this.dirreccionFacturacion = dirreccionFacturacion;
        this.finalizado = finalizado;
        this.fechaEnvio = fechaEnvio;
        this.compania = compania;
        this.pago = pago;
    }
    
    /**
     * @return the idEnvio
     */
    public String getIdEnvio() {
        return idEnvio;
    }

    /**
     * @param idEnvio the idEnvio to set
     */
    public void setIdEnvio(String idEnvio) {
        this.idEnvio = idEnvio;
    }

    /**
     * @return the idPago
     */
    public String getIdPago() {
        return idPago;
    }

    /**
     * @param idPago the idPago to set
     */
    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }

    /**
     * @return the dirreccionFacturacion
     */
    public String getDirreccionFacturacion() {
        return dirreccionFacturacion;
    }

    /**
     * @param dirreccionFacturacion the dirreccionFacturacion to set
     */
    public void setDirreccionFacturacion(String dirreccionFacturacion) {
        this.dirreccionFacturacion = dirreccionFacturacion;
    }

    /**
     * @return the finalizado
     */
    public boolean getFinalizado() {
        return finalizado;
    }

    /**
     * @param finalizado the finalizado to set
     */
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    /**
     * @return the fechaEnvio
     */
    public String getFechaEnvio() {
        return fechaEnvio;
    }

    /**
     * @param fechaEnvio the fechaEnvio to set
     */
    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    /**
     * @return the compania
     */
    public String getCompania() {
        return compania;
    }

    /**
     * @param compania the compania to set
     */
    public void setCompania(String compania) {
        this.compania = compania;
    }

    /**
     * @return the pago
     */
    public Pago getPago() {
        return pago;
    }

    /**
     * @param pago the pago to set
     */
    public void setPago(Pago pago) {
        this.pago = pago;
    }
}
