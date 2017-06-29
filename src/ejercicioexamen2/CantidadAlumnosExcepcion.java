/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexamen2;

/**
 *
 * @author TOSHIBA
 */
public class CantidadAlumnosExcepcion extends Exception{
    public CantidadAlumnosExcepcion(){
        super("El rango de alumnos no es valido");
    }
}
