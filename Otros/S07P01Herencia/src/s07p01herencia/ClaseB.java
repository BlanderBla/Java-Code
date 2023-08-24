/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07p01herencia;
import java.util.Scanner;
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class ClaseB extends ClaseA{    
//La palabra reservada 'extends' nos va a permitir heredar los atributos de la clase
    /*
        La palabra extends se refiere a extender -> hace referencia a una extension de la claseA.
        Extiende las caracteristicas de la claseA pero tambien tendrás sus particularidades
        Lo mas adecuado es que solo se herede de una clase.
    */
    //  Atributos
    String color;
    //  Métodos
    public void metodoEnB(){
        System.out.println("Estoy en B");
    }
}
