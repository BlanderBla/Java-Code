/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s10p03polimorfismo;

/**
 *
 * Brayan Adrian Galvan Flors || 181112
 */
public class ClaseC extends ClaseB{
    public void calcular(){
        super.calcular();   //  Va a ejecutar lo que esta en el método de la clase padre - Clase B
        System.out.println("Calcular en C");
    }
    public void mensajeEnC(){
        System.out.println("Saludo desde la clase C");
    }
}
