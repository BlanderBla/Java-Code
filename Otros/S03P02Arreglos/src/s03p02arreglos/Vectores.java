/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s03p02arreglos;
import java.util.Scanner;
/**
 * Brayan Adrian Galvan Flroes || 181112
 */
public class Vectores {
    int a[]=new int[5];
    //metodos
    public void leer(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Dame 5 numeros: ");
        for (int i = 0; i <5; i++) {
          a[i]=entrada.nextInt();
        }
    }
     public void imprimir(){
        System.out.println("Arreglo: ");
            for (int i = 0; i <5; i++) {
                System.out.print(a[i]+" ");
            }
    }
    public void mayor(){
         int mayor=0;
         System.out.println("\nposicion del elemento mayor y el elemento mayor");
         for (int i = 1; i < 5; i++) {
             if(a[mayor]<a[i]){// if(a[mayor]<a[i])
                 mayor=i;
             }
         }
         System.out.println("El numero mayor es: "+a[mayor]);
         System.out.println("posiscion: "+mayor);
    }
    public void menor(){
         int menor=0;
         System.out.println("\nPosicion del elemento menor y el elemento menor");
         for (int i = 1; i < 5; i++) {
             if(a[menor]>a[i]){// if(a[mayor]<a[i])
                 menor=i;
             }
         }
         System.out.println("El numero menor es: "+a[menor]);
         System.out.println("Posiscion: "+menor);     
    }
    public void ordenarBurbuja(){
        int temp;
        for(int i=1; i < 5; i++){
            for(int j = 5-1; j>=i;j--){
                if(a[j]<a[j-1]){
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
        for(int i=0; i<5; i++){
            System.out.println("> "+a[i]);
        }
        /*
            PROFESOR
            for(int i=0;i<4;i++){
                menor = i;
                for(int j=i+1;j<5;j++){
                    if(a[menor]>a[j]){
                        menor = j;
                    }
                    if(menor !=i){
                        aux = a[i];
                        a[i] = a[menor];
                        a[menor] = aux;
                    }
                }
            }
        */
    }
}

