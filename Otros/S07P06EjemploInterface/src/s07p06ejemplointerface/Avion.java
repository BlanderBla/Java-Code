/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07p06ejemplointerface;
import java.util.Scanner;
/**
 * Brayan Adrian Galvan Flores 181112
 */
public class Avion implements Transporte{
    public void acelerar(){
        System.out.println("\tAcelerar");
    }
    public void frenar(){
        System.out.println("\tFrenar");
    }
    public void pasajeros(int n){
        System.out.println("\tPasajeros "+n);
    }
    public void turborreactor(int m){
        System.out.println("\tTurborreactores "+m);
    }
}
