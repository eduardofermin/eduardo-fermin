/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexamen;

/**
 *
 * @author TOSHIBA
 */
public class Opcion {
    private String titulo;
    private boolean estatus;
    
    public Opcion(){
    }

    public Opcion(String titulo, boolean estatus) {
        this.titulo = titulo;
        this.estatus = estatus;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
       
}
