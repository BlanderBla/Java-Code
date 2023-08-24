/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s10p03polimorfismo;
/**
 * Brayan Adrian Galván Flores  ||  181112
 */
public class ClaseB extends ClaseA{
    public void calcular(){
        super.calcular();   //  Va a ejecutar lo que esta en el método de la clase padre - Clase A
        System.out.println("Calculando en la clase B");
        
    }
    public void mensaje(){
        System.out.println("Hola, soy la clase B");
    }
}
