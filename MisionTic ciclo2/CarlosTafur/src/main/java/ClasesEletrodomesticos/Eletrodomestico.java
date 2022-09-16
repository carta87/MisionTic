package ClasesEletrodomesticos;


/**
 * reto 2
 * @author Carlos Tafur
 */
public class Eletrodomestico {
    private String nombre;
    private int valorComercial;
    private int aniofechaCompra;
    private String marca;
    
    //constructor 
    public Eletrodomestico() {
    }
     
    //constructor 

    public Eletrodomestico(String nombre, int valorComercial, int aniofechaCompra, String marca) {
        this.nombre = nombre;
        this.valorComercial = valorComercial;
        this.aniofechaCompra = aniofechaCompra;
        this.marca = marca;
    }
        
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the valorComercial
     */
    public int getValorComercial() {
        return valorComercial;
    }

    /**
     * @param valorComercial the valorComercial to set
     */
    public void setValorComercial(int valorComercial) {
        this.valorComercial = valorComercial;
    }

    /**
     * @return the fechaCompra
     */
    public int getAnioFechaCompra() {
        return aniofechaCompra;
    }

    /**
     * @param fechaCompra the fechaCompra to set
     */
    public void setAnioFechaCompra(int fechaCompra) {
        this.aniofechaCompra = fechaCompra;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //Creacion de metodos
    public void ubicacion(String indiqueUbicacion){
        System.out.println("El eletrodomestrico " + this.nombre + " esta en " + indiqueUbicacion  );
    }
    
    public void encendidoApagado(boolean estado){
          if (true== estado ) System.out.println("El estretodomestico "+ this.nombre+ " esta  encendido");  
        else System.out.println("El estretodomestico "+ this.nombre+ " esta  apagado");   
    }
}
