/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexamen;
import java.util.*;
/**
 *
 * @author TOSHIBA
 */
public class Aplicacion {
    public static void main (String ... x){
        ArrayList<Pregunta> preguntas = new ArrayList();
        
        Opcion op1 = new Opcion("Lituania", false);
        Opcion op2 = new Opcion("Estunia", false);
        Opcion op3 = new Opcion("Kiev", true);
        Opcion op4 = new Opcion("Lilinakum", false);
        
        Pregunta p1 = new Pregunta();
        
        p1.setTitulo("¿Cual es la capotal de Ucrania?");
        
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        
        p1.setOpciones(opciones);
        
        preguntas.add(p1);
        
        for(Pregunta pre : preguntas){
            System.out.println(pre.getTitulo());
            for (Opcion op : pre.getOpciones()){
                System.out.println(op.getTitulo() + " : " + op.isEstatus());
            }
        }
    }
    
}
