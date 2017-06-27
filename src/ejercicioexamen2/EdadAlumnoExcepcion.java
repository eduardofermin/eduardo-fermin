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
public class EdadAlumnoExcepcion extends Exception {
    public EdadAlumnoExcepcion(){
        super("El alumno es menor de edad");
    }
}
