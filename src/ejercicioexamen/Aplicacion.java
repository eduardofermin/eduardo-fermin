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
        //se crea un arraylist de la clase pregunta
        ArrayList<Pregunta> preguntas = new ArrayList();
        
        //se crean las opciones de la clasew Opcion
        Opcion op1 = new Opcion("Lituania", false);
        Opcion op2 = new Opcion("Estunia", false);
        Opcion op3 = new Opcion("Kiev", true);
        Opcion op4 = new Opcion("Lilinakum", false);
        
        //se crea un objeto de la clase pregunta
        Pregunta p1 = new Pregunta();
        
        //se crea la pregunta al metodo set de la clase pregunta
        p1.setTitulo("¿Cual es la capotal de Ucrania?");
        
        //se agregan las opciones al arraylist de tipo opcion
        ArrayList<Opcion> opciones = new ArrayList<>();
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        
        //se agregan las opciones al metodo set de la clse opciones
        p1.setOpciones(opciones);
        
        //se agrega la pregunta creada al arraylist creado para la clase pregunta
        preguntas.add(p1);
        
        //se intera la pregunta y las opciones
        for(Pregunta pre : preguntas){
            System.out.println(pre.getTitulo());
            for (Opcion op : pre.getOpciones()){
                System.out.println(op.getTitulo() + " : " + op.isEstatus());
            }
        }
    }
    
}
