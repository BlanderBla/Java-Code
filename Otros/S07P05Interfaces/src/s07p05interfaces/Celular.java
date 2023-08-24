/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07p05interfaces;
import java.util.Scanner;
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class Celular implements Telefono{
    public boolean llamadaEnProgreso(){
        return true;
    }
    public void marcarNumero(int n){
        System.out.println("Llamando a "+n);
    }  
    public void tomarFotos(){
        System.out.println("Tomando fotos");
    }
}
