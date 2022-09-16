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
public class ClienteNatural extends Cliente{
    private String documento;
    private String primerNomClie;
    private String segundoNomClie;
    private String primerApeClie;
    private String segundoApeCle;

    public ClienteNatural(String documento, String primerNomClie, String segundoNomClie, String primerApeClie, String segundoApeCle, String idCliente, String dirreClie, String telClie, String emailClie) {
        super(idCliente, dirreClie, telClie, emailClie);
        this.documento = documento;
        this.primerNomClie = primerNomClie;
        this.segundoNomClie = segundoNomClie;
        this.primerApeClie = primerApeClie;
        this.segundoApeCle = segundoApeCle;
    }
    
    

    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the primerNomClie
     */
    public String getPrimerNomClie() {
        return primerNomClie;
    }

    /**
     * @param primerNomClie the primerNomClie to set
     */
    public void setPrimerNomClie(String primerNomClie) {
        this.primerNomClie = primerNomClie;
    }

    /**
     * @return the segundoNomClie
     */
    public String getSegundoNomClie() {
        return segundoNomClie;
    }

    /**
     * @param segundoNomClie the segundoNomClie to set
     */
    public void setSegundoNomClie(String segundoNomClie) {
        this.segundoNomClie = segundoNomClie;
    }

    /**
     * @return the primerApeClie
     */
    public String getPrimerApeClie() {
        return primerApeClie;
    }

    /**
     * @param primerApeClie the primerApeClie to set
     */
    public void setPrimerApeClie(String primerApeClie) {
        this.primerApeClie = primerApeClie;
    }

    /**
     * @return the segundoApeCle
     */
    public String getSegundoApeCle() {
        return segundoApeCle;
    }

    /**
     * @param segundoApeCle the segundoApeCle to set
     */
    public void setSegundoApeCle(String segundoApeCle) {
        this.segundoApeCle = segundoApeCle;
    }
    
}
