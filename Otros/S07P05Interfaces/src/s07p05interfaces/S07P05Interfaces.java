/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07p05interfaces;
import java.util.Scanner;
/**
 * brayan Adrian Galvan Flores || 181112
 */
public class S07P05Interfaces {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Celular");
        Celular c1 = new Celular();
        c1.marcarNumero(444454545);
        c1.tomarFotos();
        c1.llamadaEnProgreso();
        System.out.println("Llamada en progreso? "+c1.llamadaEnProgreso());
        System.out.println("\nTelefono fijo"); 
        TelefonoFijo tF1 = new TelefonoFijo();
        tF1.conectarALaRoseta();
        tF1.marcarNumero(444454545);
        tF1.llamadaEnProgreso();
        System.out.println("Llamada en progreso? "+tF1.llamadaEnProgreso());
    }
    
}
