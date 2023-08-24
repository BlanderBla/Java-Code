/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg181112_p6p3e;
import java.util.Random;
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class operacion {
    
    Random rand = new Random();
    
    //  Atribnutos
    private String opC;
    private int c1, c2, suma1;
    private double cd1, cd2, suma2;
    private int cantidadArregloA;
    private int inicioArregloB;
    private int finalarregloC;
    int arreglo [];
    int sumarreglo1 = 0;
    int arreglo2 [];
    int n;
    //  Constructor por default (vacio)
    public void operacion(){
    
    }
    public void operacion(String opC){
        opC = this.opC;
    }
    
    //  Metodo sumar - 1er Método
    public int sumar(int c1, int c2){      
        return (c1+c2);
    }
    //  Método sumar - 2do Método
    public double sumar(double cd1, double cd2){
        return (cd1+cd2);
    }
    //  Metodo ejecutar - 1er Método
    public void ejecutar(){
        n = rand.nextInt(10)+1;
        arreglo = new int [n];
        for (int i=0; i<n; i++) {
            arreglo[i] = rand.nextInt(10)+1;
            sumarreglo1 += arreglo[i];
        }
        System.out.println("Numeros aleatorios >> "+n);
        for (int i=0; i<n; i++) {
            System.out.println("\t["+arreglo[i]+"]");
        }
        System.out.println("\tSuma del arreglo "+sumarreglo1);
    }
    //  Método ejecutar - 2do Método
    public void ejecutar(int a, int b, int c){
        int rango = (c-a);
        int cantidad = a;
        int inicio = b;
        int end = c;
        setCantidadArregloA(cantidad);
        setInicioArregloB(inicio);
        setFinalarregloC(end);
        arreglo2 =  new int [a];
        for (int i=0; i<a; i++) {
            arreglo2[i] = rand.nextInt(rango)+b;
        }
        for (int i=0; i<a; i++) {
            System.out.println("\t["+arreglo2[i]+"]");
        }
    }
    //  método imprimir
    public void imprimir(){
        System.out.println("\n\nImprimir resultados");
        System.out.println("Operacion a realizar >> "+getOpC());
        System.out.println("Suma 1\n\tCantidad entera 1 >> "+getC1()+"\n\tCantidad entera 2 >> "+getC2()+"\n\tSuma 1 >> "+getSuma1());
        System.out.println("\nSuma 2\n\tCantidad double 1 >> "+getC1()+"\n\tCantidad double 2 >> "+getC2()+"\n\tSuma 2 >> "+getSuma2());
        System.out.println("Arreglo 1");
        for (int i = 0; i < getSuma1(); i++) {
            System.out.println("\t["+arreglo[i]+"]");
        }
        System.out.println("Suma del primer arreglo >> "+sumarreglo1);
        System.out.println("Arreglo 2");
        for (int i = 0; i < (getCantidadArregloA()); i++) {
            System.out.println("\t["+arreglo2[i]+"]");
        }
    }
    //  Métodos SET y GET 
    //1. 
    public String getOpC() {
        return opC;
    } 
    public void setOpC(String opC) {
        this.opC = opC;
    }
    //2. 
    public int getC1() {
        return c1;
    }
    public void setC1(int c1) {
        this.c1 = c1;
    }
    //3. 
    public int getC2() {
        return c2;
    }
    public void setC2(int c2) {
        this.c2 = c2;
    }
    //4. 
    public double getCd1() {
        return cd1;
    }
    public void setCd1(double cd1) {
        this.cd1 = cd1;
    }
    //5. 
    public double getCd2() {
        return cd2;
    }
    public void setCd2(double cd2) {
        this.cd2 = cd2;
    }

    //6. 
    public int getSuma1() {
        return suma1;
    }
    public void setSuma1(int suma1) {
        this.suma1 = suma1;
    }
    //7.
    public double getSuma2() {
        return suma2;
    }
    public void setSuma2(double suma2) {
        this.suma2 = suma2;
    }


    public int getCantidadArregloA() {
        return cantidadArregloA;
    }
    public void setCantidadArregloA(int cantidadArregloA) {
        this.cantidadArregloA = cantidadArregloA;
    }

    public int getInicioArregloB() {
        return inicioArregloB;
    }
    public void setInicioArregloB(int inicioArregloB) {
        this.inicioArregloB = inicioArregloB;
    }

    public int getFinalarregloC() {
        return finalarregloC;
    }
    public void setFinalarregloC(int finalarregloC) {
        this.finalarregloC = finalarregloC;
    }
    
    
    
    
}
