/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexamen2;
import java.util.*;

/**
 *
 * @author TOSHIBA
 */
public class ValidarAlumnos {
    public static void validarNumeroAlumnos (ArrayList<Alumno> alumnos) throws CantidadAlumnosExcepcion{
        if (alumnos.size() > 3) throw new CantidadAlumnosExcepcion();
    }
    
}
