/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones1;

/**
 *
 * @author T-
 */
public class NominaContrato extends Nomina{
    
    //invocar constructor por defecto 
    public NominaContrato() {    
    }

    //Invocar constructor de la clase padre
    public NominaContrato(String nombre, String aPaterno, long numeroSeguro, float sueldoBase) {
        super(nombre, aPaterno, numeroSeguro, sueldoBase);
    }

    
    
}
