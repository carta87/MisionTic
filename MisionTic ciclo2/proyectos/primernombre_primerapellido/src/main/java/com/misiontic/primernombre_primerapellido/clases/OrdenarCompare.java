/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misiontic.primernombre_primerapellido.clases;

import java.util.Comparator;

/**
 *
 * @author USUARIO
 */
class OrdenarCompare implements Comparator<Equipo> {
    @Override
    public int compare(Equipo equi1, Equipo equi2) {
         if ( equi1.getPuntos() > equi2.getPuntos()) {
            return 1;
        } else if (equi1.getPuntos() < equi2.getPuntos()){
            return -1;
        }else {
            return 0;
        }  
    }
}
