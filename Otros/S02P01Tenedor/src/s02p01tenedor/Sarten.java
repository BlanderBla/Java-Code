/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s02p01tenedor;
/**
 * Brayan Adrian Galvan Flores || 181112
 * Agregar dos atributos y dos metodos
 * escribir contructor que reciba como
 * parametros los valores de las variables
 * de instancia
 * genere un onjeto de la clase, pruebe
 * los metodos e imprima los valores de las variables
 */
public class Sarten {
    //  ATRIBUTOS
    String material;
    String color;
    
    //  METODO CONTRUCTOR
    public Sarten(String a,String b){
        material = a;
        color = b;
    }
    //  METODOS
    public void freir(){
        System.out.println("FRIENDO..");
    }
    public void calentar(){
        System.out.println("CALENTANDO...");
        
    }
}
