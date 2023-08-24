/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg181112_p6p3e;
import java.util.Scanner;
import java.util.Random;
import java.lang.NullPointerException;
/**
 * Universidad Politecnica de San Luis Potosi
 * Programacion III - 12/03/2020
 * Brayan Adrian Galvan Flores || 181112
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        operacion op = new operacion();
        //  Variables
        String operacion;
        int a,b,suma1;
        double c,d,suma2;
        int n1,n2,n3;
        
        System.out.print("Operacion a realizar >> ");
        operacion = entrada.nextLine();
        op.setOpC(operacion);
        //  METODO SUMAR
        //  Primer metodo
        System.out.println("Metodo Sumar1 - Recibe dos enteros");
        System.out.print("\tCantidada entera 1 >> ");
        a = entrada.nextInt();
        op.setC1(a);
        System.out.print("\tCantidada entera 2 >> ");
        b = entrada.nextInt();
        op.setC2(b);
        suma1 = op.sumar(a, b);
        op.setSuma1(suma1);
        System.out.println("La suma de enteros es >> "+suma1);
        
        //  Segundo metodo
        System.out.println("\nMetodo Sumar2 - Recibe dos doubles");
        System.out.print("\tCantidada double 1 >> ");
        c = entrada.nextDouble();
        op.setCd1(c);
        System.out.print("\tCantidada double 2 >> ");
        d = entrada.nextDouble();
        op.setCd2(d);
        suma2 = op.sumar(c, d);
        op.setSuma2(suma2);
        System.out.println("La suma de enteros es >> "+suma2);
        //  METODO EJECUTAR
        //  Primer metodo
        System.out.println("Metodo ejecutar1 - No recibe parametros");
        op.ejecutar();
        //  Segundo metodo
        n1 = rand.nextInt(10)+1;    //  Cantidad de numeros a generar - Cantidad arreglo
        n2 = rand.nextInt(5)+5;      //  Inicio del rango de 5 - 10 
        n3 = rand.nextInt(20)+30;      //  Final del rango 30-50
        System.out.println("Metodo ejecutar2 - Recibe 3 parametros\n\t1. cantidad de numeros aleatorios >> "+n1+"\n\t2. Inicio >> "+n2+"\n\t3. Final >> "+n3);
        op.ejecutar(n1, n2, n3);
        //  Imprimir
    }
    
}
