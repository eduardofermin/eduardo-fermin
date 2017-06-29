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
public class Curso {
    private String nombre;
    private int cuatrimestre;
    private ArrayList<Alumno> alumnos;
    
    public Curso(){  
    }
    
    public Curso(String nombre, int cuatrimestre, ArrayList<Alumno> alumnos) throws CantidadAlumnosExcepcion{
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
        ValidarAlumnos.validarNumeroAlumnos(alumnos);
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumno> alumnos) throws CantidadAlumnosExcepcion{
        ValidarAlumnos.validarNumeroAlumnos(alumnos);
        this.alumnos = alumnos;
    }

}
