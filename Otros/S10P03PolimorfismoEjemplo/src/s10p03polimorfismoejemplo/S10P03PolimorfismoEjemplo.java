/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s10p03polimorfismoejemplo;
/*
 * Brayan Adrian Galván Flores  ||  181112
 */
public class S10P03PolimorfismoEjemplo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pais localizacion = new Pais();
        System.out.println("Clase Pais");
        localizacion.ubicacion();
        
        localizacion = new Estado();
        System.out.println("\nClase Estado");
        localizacion.ubicacion();
        
        localizacion = new Municipio();
        System.out.println("\nClase municipio");
        localizacion.ubicacion();
    }
}
