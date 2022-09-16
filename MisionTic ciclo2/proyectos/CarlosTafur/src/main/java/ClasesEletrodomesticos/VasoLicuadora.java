package ClasesEletrodomesticos;

/**
 * reto 2
 * @author Carlos Tafur
 */
public class VasoLicuadora {
    
    private String tipoMaterial;
    private float cantLibras;
    
    //constructor
    public VasoLicuadora(String tipoMaterial, float cantLibras) {
        this.tipoMaterial = tipoMaterial;
        this.cantLibras = cantLibras;
    }

    /**
     * @return the tipoMaterial
     */
    public String getTipoMaterial() {
        return tipoMaterial;
    }

    /**
     * @param tipoMaterial the tipoMaterial to set
     */
    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    /**
     * @return the cantLibras
     */
    public float getCantLibras() {
        return cantLibras;
    }

    /**
     * @param cantLibras the cantLibras to set
     */
    public void setCantLibras(float cantLibras) {
        this.cantLibras = cantLibras;
    }
      
}
