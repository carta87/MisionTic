/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesMascotas;

/**
 *
 * @author Esquivel_Cesar
 */
public class clsVeterinaria {
      private String nombreVeter;
    private String telefonoVeter;
    private String dirVeter;
    private clsDoctor doctor;

    //constructor

    public clsVeterinaria(String nombreVeter, String telefonoVeter, String dirVeter, clsDoctor doctor) {
        this.nombreVeter = nombreVeter;
        this.telefonoVeter = telefonoVeter;
        this.dirVeter = dirVeter;
        this.doctor = doctor;
    }
    
    
    //Metodo cuidar Mascota invocamos la clase mascota y le pasamos una variable Mascota
    
    public String cuidarMascota(mascota Mascota){
          System.out.println("Estoy atendiendo la mascota " + Mascota.getNombre());
          return Mascota.getEstadoSalud();
        
    }

    /**
     * @return the nombreVeter
     */
    public String getNombreVeter() {
        return nombreVeter;
    }

    /**
     * @param nombreVeter the nombreVeter to set
     */
    public void setNombreVeter(String nombreVeter) {
        this.nombreVeter = nombreVeter;
    }

    /**
     * @return the telefonoVeter
     */
    public String getTelefonoVeter() {
        return telefonoVeter;
    }

    /**
     * @param telefonoVeter the telefonoVeter to set
     */
    public void setTelefonoVeter(String telefonoVeter) {
        this.telefonoVeter = telefonoVeter;
    }

    /**
     * @return the dirVeter
     */
    public String getDirVeter() {
        return dirVeter;
    }

    /**
     * @param dirVeter the dirVeter to set
     */
    public void setDirVeter(String dirVeter) {
        this.dirVeter = dirVeter;
    }

    /**
     * @return the doctor
     */
    public clsDoctor getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(clsDoctor doctor) {
        this.doctor = doctor;
    }

    
  
}
