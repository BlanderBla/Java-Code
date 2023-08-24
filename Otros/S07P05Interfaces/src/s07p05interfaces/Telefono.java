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
public interface Telefono {
    /* Se le puede poner abstract, pero no deberia ya que se supone que 
        deberia tener todos los metodos abstractos */
    public /*abstract*/ void marcarNumero(int n);  
    public boolean llamadaEnProgreso();
}
