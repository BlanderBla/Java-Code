/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s02p01tenedor;
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class Espatula {
    //  ATRIBUTOS
    String color;
    String material;
    
    //  METODO CONTRUCTOR
    public Espatula(String m,String c){
        material = m;
        color = c;
    }
    //  METODOS
    public void voltear(){
        System.out.println("VOLTEANDO..");
    }
    public void untar(){
        System.out.println("UNTANDO...");
    } 
}
