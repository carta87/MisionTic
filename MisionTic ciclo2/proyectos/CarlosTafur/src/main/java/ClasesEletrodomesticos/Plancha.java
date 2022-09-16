package ClasesEletrodomesticos;

/**
 * reto 2
 *
 * @author Carlos Tafur
 */
public class Plancha extends Eletrodomestico {

    private float minimaTemperatura;
    private float maximaTemperatura;

    //creando constructor
    public Plancha(float minimaTemperatura, float maximaTemperatura, String nombre, int valorComercial, int aniofechaCompra, String marca) {
        super(nombre, valorComercial, aniofechaCompra, marca);
        this.minimaTemperatura = minimaTemperatura;
        this.maximaTemperatura = maximaTemperatura;
    }

    public Plancha() {
    }
    
    
    /**
     * @return the minimaTemperatura
     */
    public float getMinimaTemperatura() {
        return minimaTemperatura;
    }

    /**
     * @param minimaTemperatura the minimaTemperatura to set
     */
    public void setMinimaTemperatura(float minimaTemperatura) {
        this.minimaTemperatura = minimaTemperatura;
    }

    /**
     * @return the maximaTemperatura
     */
    public float getMaximaTemperatura() {
        return maximaTemperatura;
    }

    /**
     * @param maximaTemperatura the maximaTemperatura to set
     */
    public void setMaximaTemperatura(float maximaTemperatura) {
        this.maximaTemperatura = maximaTemperatura;
    }

    //metodo planchar
    public void planchar(boolean estado) {
        if (true == estado) {
            System.out.println("El eletrodomestico " + super.getNombre() + " esta planchando");
        } else {
            System.out.println("El eletrodomestico " + super.getNombre() + " no esta planchando");
        }
    }

}
