package ClasesEletrodomesticos;

import java.util.Date;

/**
 * En esta clase indicamos en el constructor la relacion de composicion ya que 
 * para su funcionamiento necesita de la clase vasoLicuadora
 * @author Carlos Tafur - reto 2
 */
public class Licuadora extends Eletrodomestico{
    private byte capacidadLitros;
    private byte numeroAspas;
    private VasoLicuadora vasoLicuadora;
    
    //constructor

    public Licuadora(byte capacidadLitros, byte numeroAspas, String nombre, int valorComercial, int aniofechaCompra, String marca,  VasoLicuadora vasoLicuadora ) {
        super(nombre, valorComercial, aniofechaCompra, marca);
        this.capacidadLitros = capacidadLitros;
        this.numeroAspas = numeroAspas;
        this.vasoLicuadora = vasoLicuadora;
    }
    
    
    /**
     * @return the capacidadLitros
     */
    public byte getCapacidadLitros() {
        return capacidadLitros;
    }

    /**
     * @param capacidadLitros the capacidadLitros to set
     */
    public void setCapacidadLitros(byte capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    /**
     * @return the numeroAspas
     */
    public byte getNumeroAspas() {
        return numeroAspas;
    }

    /**
     * @param numeroAspas the numeroAspas to set
     */
    public void setNumeroAspas(byte numeroAspas) {
        this.numeroAspas = numeroAspas;
    }

    /**
     * @return the vasoLicuadora
     */
    public VasoLicuadora getVasoLicuadora() {
        return vasoLicuadora;
    }

    /**
     * @param vasoLicuadora the vasoLicuadora to set
     */
    public void setVasoLicuadora(VasoLicuadora vasoLicuadora) {
        this.vasoLicuadora = vasoLicuadora;
    }
    
     //metodoLiquar
    public void licuar(boolean estado){
          if (true== estado ) System.out.println("El estretodomestico "+ super.getNombre()+ " esta licuando");  
        else System.out.println("El estretodomestico "+ super.getNombre() + " no esta licuando");   
        
    }
    
}
