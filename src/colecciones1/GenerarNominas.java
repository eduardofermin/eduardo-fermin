/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones1;

import java.util.*;

/**
 *
 * @author T-
 */
public class GenerarNominas {
    public static void main(String[] args) {
        NominaContrato nc = new NominaContrato("juan","lopez",1234,45000);
        NominaHonorarios nh = new NominaHonorarios("ana", "perez", 4321, 60000, 0.16f, 0.16f);
        
        //arreglo generico
        //generamos un arraylist para meter las dos  nomnas anteriores
        ArrayList<Nomina> misNominas = new ArrayList<>();
        
        //para generar un objeto a este arreglo de tipo ArrayList usamos el motodo add
        misNominas.add(nc);
        misNominas.add(nh);
        
        //para recorrer este arreglo y verificar que se agregaron los objetos usamos el for mejorado
        for (Nomina nomina: misNominas){
            System.out.println("EL nombre del usuario es: " + nomina.getNombre());
        }
    }
}
