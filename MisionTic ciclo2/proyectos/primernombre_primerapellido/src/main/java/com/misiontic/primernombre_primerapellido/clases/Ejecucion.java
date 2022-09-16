package com.misiontic.primernombre_primerapellido.clases;

import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 * Programa que permite ingresarlos marcadores de 5 equipos de la liga
 * colombiana y mostrara las tres posiciones que ocuparon al final del torneo
 * con los siguientes resultados: partidos jugados, ganados, perdidos, empatafos
 * y su puntaje final
 *
 * @Carlos Tafur
 */
public class Ejecucion {

    static Equipo equipo1 = new Equipo("Millonarios");
    static Equipo equipo2 = new Equipo("Tolima");
    static Equipo equipo3 = new Equipo("Nacional");
    static Equipo equipo4 = new Equipo("Junior");
    static Equipo equipo5 = new Equipo("Cali");
    static Equipo[] ligaVisitante = {equipo1, equipo2, equipo3, equipo4, equipo5};
    static Equipo puesto1 = new Equipo();
    static Equipo puesto2 = new Equipo();
    static Equipo puesto3 = new Equipo();
    static Equipo puesto4 = new Equipo();
    static Equipo puesto5 = new Equipo();
    static int marcadorLocal;
    static int marcadorVisitante;

    public static void main(String[] args) {

        calcularMarcador(equipo1, ligaVisitante);
        calcularMarcador(equipo2, ligaVisitante);
        calcularMarcador(equipo3, ligaVisitante);
        calcularMarcador(equipo4, ligaVisitante);
        calcularMarcador(equipo5, ligaVisitante);

        // Arrays.sort(LigaVisitante, new OrdenarCompare());
        Arrays.sort(ligaVisitante, new Comparator<Equipo>() {
            @Override
            public int compare(Equipo arg0, Equipo arg1) {
                if (arg0.getPuntos() > arg1.getPuntos()) {
                    return 1;
                } else if (arg0.getPuntos() < arg1.getPuntos()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        for (int i = 0; i < ligaVisitante.length; i++) {
            System.out.println(ligaVisitante[i].getNombre() + ligaVisitante[i].getPuntos());

        }

        boolean flag = false;
        for (int i = 0; i < ligaVisitante.length; i++) {

            int puntos = ligaVisitante[i].getPuntos();
            System.out.println(puntos);
            System.out.println("el valor de puesto iteracion  :" + ligaVisitante[i].getNombre());

            if (flag == false) {
                puesto1 = ligaVisitante[i];
                flag = true;
                continue;
            } if (flag == true) {
                puesto2 = ligaVisitante[i];
                flag = false;
            }
            ++i;
            puesto3 = ligaVisitante[i];
            System.out.println("por aqui");
            ++i;
            puesto4 = ligaVisitante[i];
            ++i;
            puesto5 = ligaVisitante[i];
            break;
        }

        mostrarPuesto(puesto5, (byte) 1);
        mostrarPuesto(puesto4, (byte) 2);
        mostrarPuesto(puesto3, (byte) 3);

    }

    public static void calcularMarcador(Equipo equipoLocal, Equipo ligaVisitante[]) {

        for (byte i = 0; i < ligaVisitante.length; i++) {
            if (equipoLocal.getNombre() != ligaVisitante[i].getNombre()) {
                marcadorLocal = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese  marcador del partido\nEquipo que juega de local es "
                        + equipoLocal.getNombre() + " su marcador es ").trim());
                marcadorVisitante = Integer.parseInt(JOptionPane.showInputDialog(null, "vs  equipo que juega de vistante es " + ligaVisitante[i].getNombre()
                        + " su marcador es ").trim());
                if (marcadorLocal > marcadorVisitante) {
                    equipoLocal.cantidadPuntos((byte) 3);
                    equipoLocal.setPartidosGanados((byte) 1);
                    equipoLocal.setPartidosJugados((byte) 1);
                    ligaVisitante[i].cantidadPuntos((byte) -1);
                    ligaVisitante[i].setPartidosPerdidos((byte) -1);
                    ligaVisitante[i].setPartidosJugados((byte) 1);
                }

                if (marcadorLocal == marcadorVisitante) {
                    ligaVisitante[i].cantidadPuntos((byte) 1);
                    ligaVisitante[i].setPartidosEmpatados((byte) 1);
                    ligaVisitante[i].setPartidosJugados((byte) 1);
                    equipoLocal.cantidadPuntos((byte) 1);
                    equipoLocal.setPartidosEmpatados((byte) 1);
                    equipoLocal.setPartidosJugados((byte) 1);
                }
                if (marcadorLocal < marcadorVisitante) {
                    ligaVisitante[i].cantidadPuntos((byte) 3);
                    ligaVisitante[i].setPartidosPerdidos((byte) 3);
                    ligaVisitante[i].setPartidosJugados((byte) 1);
                    equipoLocal.cantidadPuntos((byte) -1);
                    equipoLocal.setPartidosPerdidos((byte) -1);
                    equipoLocal.setPartidosJugados((byte) 1);
                }
            }
        }
    }

    public static void mostrarPuesto(Equipo equipo, byte puesto) {
        System.out.println(" puesto numero " + puesto + " del equipo con el nombre: " + equipo.getNombre()
                + " Partidos Jugados: " + equipo.getPartidosJugados() + " \n "
                + " Partidos Ganados: " + equipo.getPartidosGanados() + " \n "
                + " Partidos Empatados: " + equipo.getPartidosEmpatados() + " \n "
                + " Partidos perdidos : " + equipo.getPartidosPerdidos() + " \n "
                + " puntos Totales: " + equipo.getPuntos());
    }

}
