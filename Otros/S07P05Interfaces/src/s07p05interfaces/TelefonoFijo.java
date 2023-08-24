/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07p05interfaces;

/**
 *
 * Brayan Adrian Galvan Flores  ||   181112
 */
public class TelefonoFijo implements Telefono{
    /*
        extends es para herencia y se supone que lo vas a mejorar
        implements no significa que la vas a mejorar, sino solo extender
    */
    public boolean llamadaEnProgreso(){
        return true;
    }
    public void marcarNumero(int n){
        System.out.println("Marcado desde telefono fijo a: "+n);
    }
    public void conectarALaRoseta(){
        System.out.println("Conectar el RJ11 a la roseta");
    }

}
