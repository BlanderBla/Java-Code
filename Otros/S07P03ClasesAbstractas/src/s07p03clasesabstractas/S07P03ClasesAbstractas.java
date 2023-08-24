/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07p03clasesabstractas;
import java.util.Scanner;
/**
 * Brayan Adian Galvan Flores || 181112
 */
public class S07P03ClasesAbstractas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            MusicPlayer mp = new MusicPlayer(); //  Una clase abstracta no puede ser instanciada
            Por que no puede ser instanciado -> porque los metodos no tienen codigo.
        */
        System.out.println("CD player");
        CDPlayer cd = new CDPlayer();
        cd.play();
        cd.stop();
        cd.cambiarVolumen(5);
        
        System.out.println("MP3 Player");
        MP3Player mp3 = new MP3Player();
        mp3.play();
        mp3.stop();
        mp3.cambiarVolumen(10);
    }
}
