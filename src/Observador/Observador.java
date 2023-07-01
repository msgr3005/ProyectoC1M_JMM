/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observador;

/**
 *
 * @author MAURICIO
 */
public class Observador {
   private Sujeto sujeto;
    
    public abstract void actualizar(); //corresponde a las reacciones
                        //específicas de cada observador concreto

    public Sujeto getSujeto() {
        return sujeto;
    }

    public void setSujeto(Sujeto sujeto) {
        this.sujeto = sujeto;
    }
}
