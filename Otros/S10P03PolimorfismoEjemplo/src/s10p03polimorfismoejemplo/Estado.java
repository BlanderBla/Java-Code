/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s10p03polimorfismoejemplo;
/*
 * Brayan Adrian Galván Flores  ||  181112
 */
public class Estado extends Pais{
    
    public void ubicacion(){
        super.ubicacion();
        System.out.println("\tSan Luis Potosí");
    }
    public void noEstado(){
        System.out.println("27");
    }
}
