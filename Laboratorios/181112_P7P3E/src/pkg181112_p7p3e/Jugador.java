/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg181112_p7p3e;

/**
 * Universidad Politecnica de San Luis Potosí (UPSLP)
 * Brayan Adrian Galván Flores || 181112
 * Programación III
 * 
 */
public class Jugador {
    //  Atributos
    private String nombre;
    private int edad;
    private int goles;
    //  Métodos contructor
        //  Método contructor vacio
    public void Jugador(){
       
    }

    //  Métodos SET & GET
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    
    public void setGoles(int goles){
        this.goles = goles; 
    }
    public int getGoles(){
        return goles;
    }
}
