/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//VERSION
//NETBEANS IDE 8.2
package s02p03operacionessobrecarga;
import java.util.Scanner;
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class OperacionesSobre {
    //VARIABLES DE INSTANCIA
    int a,b;
    //SOBRECARGA: SUCEDE CUANDO TENEMOS 2 O MAS METODOS
    //QUE SE LLAMAN IGUAL PERO RECIBEN
    //PARAMETROS DIFERENTES
    
    //SOBRECARGA DE CONTRUCTOR SIEMPRE Y CUANDO LE DES DIFERENTES PARAMETROS
    public OperacionesSobre(){
        
    }
    //EL CONTRUCTOR ES PARA INICIALIZAR VARIABLES
    public OperacionesSobre(int a,int dos){
        //PUEDE SER this.a=a
        this.a=a;
        //o de esta manera
        b=dos;
    }
        //METODOS
        public void sumar(){
        //scanner es una claase
        Scanner entrada=new Scanner(System.in);
        System.out.println("DIME 2 NUMEROS: ");
        int b;
        int a=entrada.nextInt();
        b=entrada.nextInt();
        int s=a+b;
        System.out.println("LA SUMA ES: "+s);
        
    }
        //SOBRECARGA DE SUMA 1
        public int sumar(int a,int b){
        return a+b;
    }
        
        
    //SON VARIABLES LOCALES, CERO QUE VER CON LAS DE ARRIBA
    public int restar(int c ,int d){
        return c-d;
    }
    //SOBRECARGA RESTA
    public void restar(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("DIME DOS NUMEROS PARA RESTA: ");
        int a=entrada.nextInt();
        int b=entrada.nextInt();
        int s=a-b;
         System.out.println("LA RESTA ES = "+s);
    }
    
    //MULTIPLICAR
    public void multiplicar(int e, int f){
    int multi=e*f;
    System.out.println("LA MULTIPLICACION = "+multi);
   
}
    public int multiplicar(){
        int a=10,b=2;
        return(a*b);
    }
  
    //DIVIDIR
    public float dividir(int g,int h){
        //d=(float )a/(float)b   //que actue como de otro tipo de dato...casting una variable de un tipo que puede ser usada para otro tipo de datos
        float divi=(float)g/(float)h;
        return (divi);
    }
    
    public void dividir(){
        Scanner entrada =new Scanner(System.in);
        System.out.println("DAME DOS NUMEROS PARA DIVIDIR: ");
        int j=entrada.nextInt();
        int k=entrada.nextInt();
        float divi2=(float)j/(float)k;
        System.out.println("EL RESULTADO DE LA DIVISION CON SOBRECARGA ES = "+divi2);
        
    }
    
    
    
    
}
