/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s02p02operacionesbasicas;
import java.util.Scanner;//Puede no tener instrucciones import o tantos como quiera
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class Operaciones {
    //  METODOS
    //  Sumar
    public void sumar(){
        //scanner es una clase
        Scanner entrada=new Scanner(System.in);
        System.out.println("DIME 2 NUMEROS: ");
        int b;
        int a=entrada.nextInt();
        b=entrada.nextInt();
        int s=a+b;
        System.out.println("SUMA: "+s);
        
    }
    //  Restar
    public int restar(int a ,int b){
        return (a-b); //  Son variables locales
    }
    //  Multiplicar
    public void multiplicar(int c, int d){
        float multi=c*d;
        System.out.println("MULTIPLICACION: "+multi);
    }
    //  Dividir
    public float dividir(int c,int d){
        //d=(float )a/(float)b   //que actue como de otro tipo de dato...casting una variable de un tipo que puede ser usada para otro tipo de datos
        float divi = (float)c/(float)d;
        return (divi);
    }
    
}
