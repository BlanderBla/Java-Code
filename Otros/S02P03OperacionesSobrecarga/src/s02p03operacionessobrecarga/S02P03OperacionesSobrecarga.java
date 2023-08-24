/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s02p03operacionessobrecarga;
import java.util.Scanner;
//  - pakcege private. Publico dentro del proyecto
//  - protected. Dentro de la cadena de herencia
//  - private. Dentro de la clase
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class S02P03OperacionesSobrecarga {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SUMA 1
        OperacionesSobre op =new OperacionesSobre();
        op.sumar();
        //SUMA 2
        Scanner entrada=new Scanner(System.in);
        System.out.println("DIME 2 NUMEROS PARA SOBRECARGA DE SUMA 2: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        System.out.println("SUMA SOBRECARGA 2 ES = "+op.sumar(a, b));
        //RESTA 1
        op.restar();
        //RESTA 2
        Scanner entrada2 = new Scanner(System.in);
         System.out.println("DIME 2 NUMEROS PARA SOBRECARGA DE RESTA : ");
        int c = entrada2.nextInt();
        int d = entrada2.nextInt();
        System.out.println("LA RESTA EN SOBRECARGA ES = "+op.restar(c, d));
        //MULTIPLICACION 1
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("DAME DOS NUMEROS PARA MULTIPLICACION: ");
        int e = entrada3.nextInt();
        int f = entrada3.nextInt();
        op.multiplicar(e,f);
        //MULTIPLICACION 2
        System.out.println("LA MULTIPLICACION EN SOBRECARGA ES ="+op.multiplicar());
        //DIVISION 1
        Scanner entrada4 = new Scanner(System.in);
        System.out.println("DAME DOS NUMEROS A DIVIDIR: ");
        int g = entrada3.nextInt();
        int h = entrada3.nextInt();
        System.out.println("RESULTADO DE DIVISION = "+op.dividir(g, h));
        //DIVISION 2
        op.dividir();    
    }  
}
