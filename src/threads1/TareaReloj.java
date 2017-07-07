/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads1;
import java.util.*;
/**
 *
 * @author T-
 */

public class TareaReloj extends Thread{

    @Override
    public void run() {
     
        while(true){
            
            Calendar cal = Calendar.getInstance();
            
            //aqui vamos a activar varias propiedades relacionadas a los calendarios, hora, minuto y segundo
            int hora = cal.get(Calendar.HOUR);
            int minuto = cal.get(Calendar.MINUTE);
            int segundo = cal.get(Calendar.SECOND);
            
            System.out.println("La hora es " + hora + ":" + minuto + ":" + segundo);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                
            }
        }
    }
}
