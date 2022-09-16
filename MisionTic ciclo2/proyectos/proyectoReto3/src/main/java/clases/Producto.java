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
public class Producto {
    private String idProduo;
    private String denominacion;
    private String provedor;

    public Producto(String idProduo, String denominacion, String provedor) {
        this.idProduo = idProduo;
        this.denominacion = denominacion;
        this.provedor = provedor;
    }

    /**
     * @return the idProduo
     */
    public String getIdProduo() {
        return idProduo;
    }

    /**
     * @param idProduo the idProduo to set
     */
    public void setIdProduo(String idProduo) {
        this.idProduo = idProduo;
    }

    /**
     * @return the denominacion
     */
    public String getDenominacion() {
        return denominacion;
    }

    /**
     * @param denominacion the denominacion to set
     */
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    /**
     * @return the provedor
     */
    public String getProvedor() {
        return provedor;
    }

    /**
     * @param provedor the provedor to set
     */
    public void setProvedor(String provedor) {
        this.provedor = provedor;
    }
    
    
}
