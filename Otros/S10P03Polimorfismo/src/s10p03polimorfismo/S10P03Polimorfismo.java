/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s10p03polimorfismo;
/**
 * Brayan Adrina Galvan Flores usuario
 */
public class S10P03Polimorfismo {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ClaseA a = new ClaseA();
        a.calcular();
        
        //  Polimorfismo
        a = new ClaseB();
        a.calcular();   //  En realidad no es la clase B, sino que es de A actuando como B
        //  a.mensaje();
            /*  El objeto solo funciona en metodos sobreescritos   -   
              Ya que el método mensaje solo se encuentra en la clase B  */
        a = new ClaseC();
        a.calcular();
        
        /*
        System.out.println("Prueba con objeto C");
        ClaseB b = new ClaseB();
        b.calcular();
        b.mensaje();
        
        b = new ClaseC();
        b.calcular();
        b.mensaje();
        */
    }
}
