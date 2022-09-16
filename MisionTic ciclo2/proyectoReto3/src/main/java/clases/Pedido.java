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
public class Pedido {
    private String idPedido;
    private String fechRealizacion;
    private boolean estado;
    private int total;
    private ClienteJuridico idClienteJuri;
    private ClienteNatural  idClienteNat;
    private String nomProdValorUni;
    private int cantidad;

    public Pedido(String idPedido, String fechRealizacion, boolean estado, int total, String nomProdValorUni, int cantidad) {
        this.idPedido = idPedido;
        this.fechRealizacion = fechRealizacion;
        this.estado = estado;
        this.total = total;
        this.nomProdValorUni = nomProdValorUni;
        this.cantidad = cantidad;
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
     * @return the fechRealizacion
     */
    public String getFechRealizacion() {
        return fechRealizacion;
    }

    /**
     * @param fechRealizacion the fechRealizacion to set
     */
    public void setFechRealizacion(String fechRealizacion) {
        this.fechRealizacion = fechRealizacion;
    }

    /**
     * @return the estado
     */
    public boolean getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * @return the idClienteJuri
     */
    public ClienteJuridico getIdClienteJuri() {
        return idClienteJuri;
    }

    /**
     * @param idClienteJuri the idClienteJuri to set
     */
    public void setIdClienteJuri(ClienteJuridico idClienteJuri) {
        this.idClienteJuri = idClienteJuri;
    }

    /**
     * @return the idClienteNat
     */
    public ClienteNatural getIdClienteNat() {
        return idClienteNat;
    }

    /**
     * @param idClienteNat the idClienteNat to set
     */
    public void setIdClienteNat(ClienteNatural idClienteNat) {
        this.idClienteNat = idClienteNat;
    }

    /**
     * @return the nomProdValorUni
     */
    public String getNomProdValorUni() {
        return nomProdValorUni;
    }

    /**
     * @param nomProdValorUni the nomProdValorUni to set
     */
    public void setNomProdValorUni(String nomProdValorUni) {
        this.nomProdValorUni = nomProdValorUni;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
     

    
    
}


