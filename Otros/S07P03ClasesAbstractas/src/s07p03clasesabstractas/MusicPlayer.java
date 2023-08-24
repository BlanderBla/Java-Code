/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07p03clasesabstractas;
import java.util.Scanner;
/**
 * Brayan Adrian Galvan Flores || 181112
 */

/*
    Usar palabra reservada abstract y debe de contener al menos un metodo abstracto y uno concreto
    Un metodo abstracto es ->
    Un método concreto es ->
    
    1. Los métodos abstractos no pueden tener un cuerpo {Cuerpo}
    Nota. Una interfaz es un tipo de codigo cuyos metodos son abstractos.
*/
public abstract class MusicPlayer {  
    //  Metodo abstracto
    public abstract void play();
    //
    public abstract void stop();
    //
    public void cambiarVolumen(int v){
        System.out.println("Volumen en "+v);
    }
}
