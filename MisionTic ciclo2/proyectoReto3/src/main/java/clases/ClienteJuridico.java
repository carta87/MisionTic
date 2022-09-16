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
public class ClienteJuridico extends Cliente{

    public ClienteJuridico(String razonSocial, String nitCliente, String idCliente, String dirreClie, String telClie, String emailClie) {
        super(idCliente, dirreClie, telClie, emailClie);
        this.razonSocial = razonSocial;
        this.nitCliente = nitCliente;
    }
   

    /**
     * @return the razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * @param razonSocial the razonSocial to set
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @return the nitCliente
     */
    public String getNitCliente() {
        return nitCliente;
    }

    /**
     * @param nitCliente the nitCliente to set
     */
    public void setNitCliente(String nitCliente) {
        this.nitCliente = nitCliente;
    }
    private String razonSocial;
    private String nitCliente;
    
}
