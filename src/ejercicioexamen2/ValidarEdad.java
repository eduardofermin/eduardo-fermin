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
public class ValidarEdad {
    public static void validarMenorEdad (int edad) throws EdadAlumnoExcepcion{
        if (edad<18) throw new EdadAlumnoExcepcion();
    }
}
