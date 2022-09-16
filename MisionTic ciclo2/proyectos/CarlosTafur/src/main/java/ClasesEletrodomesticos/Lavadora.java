package ClasesEletrodomesticos;


/**
 * reto 2
 * @author Carlos Tafur
 */
public class Lavadora extends Eletrodomestico {
    private byte pesokilos;
    private byte capacidadLavado;
    private Secadora secadora;

    //Creacion de constructor

    public Lavadora(byte pesokilos, byte capacidadLavado, String nombre, int valorComercial, int aniofechaCompra, String marca) {
        super(nombre, valorComercial, aniofechaCompra, marca);
        this.pesokilos = pesokilos;
        this.capacidadLavado = capacidadLavado;
        
    }
    
    
    
    /**
     * @return the pesokilos
     */
    public byte getPesokilos() {
        return pesokilos;
    }

    /**
     * @param pesokilos the pesokilos to set
     */
    public void setPesokilos(byte pesokilos) {
        this.pesokilos = pesokilos;
    }

    /**
     * @return the capacidadLavado
     */
    public byte getCapacidadLavado() {
        return capacidadLavado;
    }

    /**
     * @param capacidadLavado the capacidadLavado to set
     */
    public void setCapacidadLavado(byte capacidadLavado) {
        this.capacidadLavado = capacidadLavado;
    }
    
    
     /**
     * @return the secadora
     */
    public Secadora getSecadora() {
        return secadora;
    }

    /**
     * @param secadora the secadora to set
     */
    public void setSecadora(Secadora secadora) {
        this.secadora = secadora;
    }
    //metodos de la clase lavadora
    public void lavar(boolean estado){
          if (true== estado ) System.out.println("El estretodomestico "+ super.getNombre()+ "esta  lavando");  
        else System.out.println("El estretodomestico "+ super.getNombre()+ " no esta lavando");   
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
