/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

/**
 *
 * @author T-
 */
public class Aplicacion {
    public static void main(String[] args) {
        
//ciclo de vida del Thread
        //nace
        PrimerTarea t1= new PrimerTarea();
        OtraTarea t2 = new OtraTarea();
        TareaReloj t3 = new TareaReloj();
        
        //Lo ponemos en estado iniciado
        t1.start();
        t2.start();
        t3.start();
        

        //El siguiente paso es meterlo a la cpu (Esto lo hace el administrador de Threads)
    }
    
}
