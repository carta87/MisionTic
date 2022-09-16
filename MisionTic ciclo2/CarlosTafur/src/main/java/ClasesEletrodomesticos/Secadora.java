package ClasesEletrodomesticos;

/**
 * clase que muestra la agrupacion no es indespensable de una a la otra 
 * para su funcionamiento y se indica en el constructor al no incluirlo.
 * @author Carlos Tafur - reto 2
 */
public class Secadora {
    
    private byte capacidadCargaSecado;
   
    
    //constructor

    public Secadora(byte capacidadCargaSecado) {
        this.capacidadCargaSecado = capacidadCargaSecado;
    }
    
    /**
     * @return the capacidadCargaSecado
     */
    public byte getCapacidadCargaSecado() {
        return capacidadCargaSecado;
    }

    /**
     * @param capacidadCargaSecado the capacidadCargaSecado to set
     */
    public void setCapacidadCargaSecado(byte capacidadCargaSecado) {
        this.capacidadCargaSecado = capacidadCargaSecado;
    }


    
    public void secar(boolean estado){
        if(estado==true)System.out.println("La secadora esta secando");
        else System.out.println("La secadora no esta secando");
    }
    
    public void secarLavar(boolean estado){
        if(estado==true)System.out.println("La secadora esta secando");
        else System.out.println("La secadora no esta  secando");
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
     
    
}
