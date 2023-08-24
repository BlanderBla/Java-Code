/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s02p02operacionesbasicas;
import java.util.Scanner;
/**
 * Brayan adrian Galvan Flores || 181112
 * multiplicar no devueova nada pero que reciba dos numeros
 * dividir recibe 2 enteros y devuelve la division sin perder precision
 */
public class S02P02OperacionesBasicas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //SUMAR
    Operaciones op =new Operaciones();
    op.sumar();
    //RESTAR
    System.out.println("RESTA: "+op.restar(8,5));
    //MULTIPLICACION
    Scanner entrada=new Scanner(System.in);
    System.out.println("Ingrese dos numeros: ");
    int c = entrada.nextInt();
    int d = entrada.nextInt();
    op.multiplicar(c, d);
    //DIVIDIR
    System.out.println("DIVISION: "+op.dividir(c,d));    
    }
    //objeto de clase
    
    
    
}
