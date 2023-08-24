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
 * 20/03/2020
 */
public class Main {

    public static void main(String[] args) {
        Partido partido = new Partido();
        //  Mada llamar a las funciones de la clase partido
        partido.llenarEquipo1();
        partido.llenarEquipo2();
        partido.mostrarEquipo1();
        partido.mostrarEquipo2();
        partido.jugada();
        partido.marcador();
    }
    
}
