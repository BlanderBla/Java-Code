/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s03p02arreglos;
import java.util.Scanner;
/**
 * Brayan Adrian Galvan Flores || 181112
 */
public class Bidimensional {
    /*
        Por cuestion educativa en la memoria no se guarda de manera consecutiva ya que es RAM (memoria aleaorio).
    */
    int a[][] = new int [5][3];
    int [][]b = new int [3][2];
    
    //  leer arreglo
    public void leer(){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Dime las calificaciones parciales");
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Dime los parciales del alumno "+i);
            for(int j = 0; j < 3 ; j++){
                System.out.println("["+(i)+"]["+(j)+"] > ");
                a[i][j] = entrada.nextInt();
            }
        }
    }
    public void imprimir(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Alumno > "+i);
            for (int j = 0; j < 3; j++) {
                System.out.print("["+i+"]["+j+"] > "+a[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    /*
        -   Haga un metodo que reciba la matricula de un alumno y devuelva su promedio
        -   La matricula del alumno es el indice 0 - 4
    */
    public float promedio(){
        Scanner entrada = new Scanner(System.in);
        float prom = 0f;    //  Le ponemos la f para indicar que es un flotante
        int indice = 0;
        int sum = 0;
        System.out.print("Ingrese su matricula [0-4] > ");
        indice = entrada.nextInt();
        for(int i=0;i<5;i++){
            if(indice == i){
                for(int j=0;j<3;j++){
                    sum += a[i][j];
                }
            }
            
        }
        prom = (float) (sum/3.0);
        return prom;
    }
    
    public void mayorMenorProm(){
        int suma = 0;
        int sumaPar[] = new int [5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Calificaciones de alumno"+(i+1));
            for (int j = 0; j < 3; j++) {
               sumaPar[i] = a[i][j]+sumaPar[i]; 
            }
        }
        int may = 0;
        int men = 0;
        for (int i = 1; i < 5; i++) {
            if (sumaPar[men] > sumaPar[i]) {
                men = i;
            }
            if (sumaPar[may] < sumaPar[i]) {
                may = i;
            }
        }
        System.out.println("");
    }
}
