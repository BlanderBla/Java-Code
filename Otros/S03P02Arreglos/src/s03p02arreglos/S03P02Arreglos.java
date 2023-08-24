/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s03p02arreglos;
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class S03P02Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vectores v = new Vectores();
        Bidimensional b = new Bidimensional();
        float promT = 0f;
        
        //  Vectores.java
        /*
        v.leer();
        v.imprimir();
        v.mayor();
        v.menor();
        v.ordenarBurbuja();
        */
        
        //  Bidimensional.java 
        b.leer();
        b.imprimir();
        promT = b.promedio();
        System.out.println("Su promedio es: "+promT);
                
    }
    
}
