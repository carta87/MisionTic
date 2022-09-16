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
public class Cliente {
    private String idCliente;
    private String dirreClie;
    private String telClie;
    private String emailClie;

    public Cliente(String idCliente, String dirreClie, String telClie, String emailClie) {
        this.idCliente = idCliente;
        this.dirreClie = dirreClie;
        this.telClie = telClie;
        this.emailClie = emailClie;
    }
    
    

    /**
     * @return the idCliente
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the dirreClie
     */
    public String getDirreClie() {
        return dirreClie;
    }

    /**
     * @param dirreClie the dirreClie to set
     */
    public void setDirreClie(String dirreClie) {
        this.dirreClie = dirreClie;
    }

    /**
     * @return the telClie
     */
    public String getTelClie() {
        return telClie;
    }

    /**
     * @param telClie the telClie to set
     */
    public void setTelClie(String telClie) {
        this.telClie = telClie;
    }

    /**
     * @return the emailClie
     */
    public String getEmailClie() {
        return emailClie;
    }

    /**
     * @param emailClie the emailClie to set
     */
    public void setEmailClie(String emailClie) {
        this.emailClie = emailClie;
    }
    
}
