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
public class NominaHonorarios extends Nomina{
    
    private float isr;
    private float iva;
    
    //invocar constructor por defecto 
    public NominaHonorarios() {    
    }
    
    //aqui se invoca el constructor de la clase padre mas el constructor de los nuevos atributos que tiene esta clase
    public NominaHonorarios(String nombre, String aPaterno, long numeroSeguro, float sueldoBase, float isr, float iva) {
        super(nombre, aPaterno, numeroSeguro, sueldoBase);
        this.isr = isr;
        this.iva = iva;
    }

    public float getIsr() {
        return isr;
    }

    public void setIsr(float isr) {
        this.isr = isr;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
    
}
