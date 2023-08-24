/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07p06ejemplointerface;
import java.util.Scanner;
/**
 * Brayan Adrian Galvan Flores || 181112
 * 
 * Cree una interface con al menos 2 metodos
 * Programe 2 clases que implementen a la interface y agregue un metodo mas
 * Cree objetos de la clase y pruebe los metodos.
 */
public class S07P06EjemploInterface {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*AUTOS*/
        Auto a1 = new Auto();
        System.out.println("Auto");
        a1.acelerar();
        a1.frenar();
        a1.pasajeros(6);
        a1.ruedas(4);
        
        Motocicleta moto = new Motocicleta();
        System.out.println("\nMotocicleta");
        moto.acelerar();
        moto.frenar();
        moto.pasajeros(2);
        moto.ruedas(2);
        
        Avion avion = new Avion();
        System.out.println("\nAvion");
        avion.acelerar();
        avion.frenar();
        avion.pasajeros(2);
        avion.turborreactor(4);
    }
}
