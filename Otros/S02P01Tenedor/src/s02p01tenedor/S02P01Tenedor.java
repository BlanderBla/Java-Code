/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s02p01tenedor;
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class S02P01Tenedor {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TENEDOR
        Tenedor t1 = new Tenedor();
        t1.picar();
        t1.sostener();
        
        System.out.println("color "+t1.color);
        //ESPATULA
        Espatula es1=new Espatula("plastico","blanco");
        es1.voltear();
        es1.untar();
        // TODO code application logic hereTenedor t1= new Tenedor();
        System.out.println("color "+es1.color);
        //SARTEN
        Sarten s1=new Sarten("ACERO INOXIDABLE","AZUL");
        s1.freir();
        s1.calentar();   
    }
}
