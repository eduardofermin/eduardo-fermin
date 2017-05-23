/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduardo.fermin;

/**
 *
 * @author T-
 */
public class EduardoFermin {

    float altura, peso;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hola mundo cruel");
        
        /*Probaremos nuestra solucion
        Crearemos un usuario hipotetico */
        Usuario u=new Usuario();
        
        //le asignamos valore
        u.altura=1.72f;
        u.peso=83f;
        
        //Generamos el modelo
        Imc imc=new Imc();
        
        
        System.out.println("El valor del IMC es: " + imc.calcular(u));
    }
    
}
