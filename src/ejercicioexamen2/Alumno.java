/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexamen2;

/**
 *
 * @author T-
 */
public class Alumno {
    private int cuenta;
    private String nombre;
    private int edad;
    
    public Alumno(){
    }
    
    public Alumno(int cuenta, String nombre, int edad){
        this.cuenta=cuenta;
        this.nombre=nombre;
        this.edad=edad;
    }
    
    public void setEdad (int edad)throws EdadAlumnoExcepcion{
        ValidarEdad.validarMenorEdad(edad);
        this.edad=edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setCuenta (int cuenta){
        this.cuenta=cuenta;
    }
    
    public int getCuenta(){
        return cuenta;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
}
