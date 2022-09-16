/*
 * POJO del Equipo con sus respectivos atributos y sus metodos 
 */
package com.misiontic.primernombre_primerapellido.clases;

/**
 * @author Carlos Tafur
 */
public class Equipo {

    private String nombre;
    private int puntos;
    private byte partidosJugados;
    private byte partidosGanados;
    private byte partidosEmpatados;
    private byte partidosPerdidos;

    public Equipo() {
    }

    public Equipo(String nombre) {
        this.nombre = nombre;

    }

    public void cantidadPuntos(byte puntosSumar) {
        if (puntosSumar == 3) {
            this.setPuntos((byte) (this.getPuntos() + puntosSumar));
        }
        if (puntosSumar == 1) {
            this.setPuntos((byte) (this.getPuntos() + puntosSumar));
        }
        if (puntosSumar == -1) {
            this.setPuntos((byte) (this.getPuntos() + puntosSumar));
        }

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
     * @return the puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(byte puntos) {
        this.puntos = puntos;
    }

    /**
     * @return the partidosJugados
     */
    public byte getPartidosJugados() {
        return partidosJugados;
    }

    /**
     * @param partidosJugados the partidosJugados to set
     */
    public void setPartidosJugados(byte partidosJugados) {
        this.partidosJugados = (byte) (partidosJugados + this.partidosJugados);
    }

    /**
     * @return the partidosGanados
     */
    public byte getPartidosGanados() {
        return partidosGanados;
    }

    /**
     * @param partidosGanados the partidosGanados to set
     */
    public void setPartidosGanados(byte partidosGanados) {
        this.partidosGanados = (byte) (this.partidosGanados + partidosGanados);
    }

    /**
     * @return the partidosEmpatados
     */
    public byte getPartidosEmpatados() {
        return partidosEmpatados;
    }

    /**
     * @param partidosEmpatados the partidosEmpatados to set
     */
    public void setPartidosEmpatados(byte partidosEmpatados) {
        this.partidosEmpatados = (byte) (partidosEmpatados + this.partidosEmpatados);
    }

    /**
     * @return the partidosPerdidos
     */
    public byte getPartidosPerdidos() {
        return partidosPerdidos;
    }

    /**
     * @param partidosPerdidos the partidosPerdidos to set
     */
    public void setPartidosPerdidos(byte partidosPerdidos) {
        this.partidosPerdidos = (byte) (partidosPerdidos + this.partidosPerdidos);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    

}
