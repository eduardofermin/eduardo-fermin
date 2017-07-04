/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;

/**
 *
 * @author T-
 * Esta es la primer forma de crear un Thread que es la forma mas facil y consiste en heredar la clase Thread
 */

//paso 1, heredar la clase thread
public class PrimerTarea extends Thread {
    
    //sobreescribir el metodo run con el @Override, sin argumentos porque es la clase que hereda del padre
    @Override
    public void run(){
        System.out.println("Soy un Thread que no hace nada");
    }
    
}
