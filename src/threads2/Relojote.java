/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads2;

/**
 *
 * @author T-
 * aqui vamos a usas el POLIMORFISMO
 * esat clase es polimorfica
 */
public class Relojote implements Runnable, ComportamientoComer{
    
    public static void main(String[] args) {
        //probemos que no podemos crear objetos de las interfaces
        
        //no se pueden crear objetos en las interfaces
        //ComportamientoComer cp = new ComportamientoComer();
        
        //creacion del thread POLIMORFICAMENTE
        Runnable r = new Relojote();
        Thread t1 = new Thread(r);
        t1.start();
    }

    @Override
    public void run() {
        System.out.println("Pronto seras un reloj");
    }

    @Override
    public String obtenerHabitoAlimenticio() {
        return "Mi relojote";
        
    }
    
    
    
}
