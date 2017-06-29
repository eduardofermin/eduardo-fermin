/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexamen2;
import java.util.*;

/**
 *
 * @author T-
 */
public class App {
    public static void main(String[] args) throws EdadAlumnoExcepcion, CantidadAlumnosExcepcion {
        
        Alumno a1 = new Alumno(2332, "lalo", 20);
        Alumno a2 = new Alumno(2332, "lalo", 20);
        Alumno a3 = new Alumno(2332, "lalo", 20);
        Alumno a4 = new Alumno(2332, "lalo", 20);
        
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(a1);
        alumnos.add(a2);
        
        Curso c1 = new Curso();
        c1.setAlumnos(alumnos);
        
    }  
}
