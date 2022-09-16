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
public class Pago {
    private String idPago;
    private String fechaPago;
    private String medioago;
    private String idPedido;
    private Pedido pedido;

    public Pago(String idPago, String fechaPago, String medioago, String idPedido) {
        this.idPago = idPago;
        this.fechaPago = fechaPago;
        this.medioago = medioago;
        this.idPedido = idPedido;
        
    }

    public Pago(String idPago, String fechaPago, String medioago, String idPedido, Pedido pedido) {
        this.idPago = idPago;
        this.fechaPago = fechaPago;
        this.medioago = medioago;
        this.idPedido = idPedido;
        this.pedido = pedido;
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
     * @return the fechaPago
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * @param fechaPago the fechaPago to set
     */
    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    /**
     * @return the medioago
     */
    public String getMedioago() {
        return medioago;
    }

    /**
     * @param medioago the medioago to set
     */
    public void setMedioago(String medioago) {
        this.medioago = medioago;
    }

    /**
     * @return the idPedido
     */
    public String getIdPedido() {
        return idPedido;
    }

    /**
     * @param idPedido the idPedido to set
     */
    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * @return the pedido
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    

    
    
    
    
}
