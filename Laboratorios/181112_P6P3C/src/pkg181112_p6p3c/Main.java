/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg181112_p6p3c;
import java.util.Scanner;
/**
 * Universidad Poltecnica de San Luis Potosí
 * Programación III
 * Jueves 12/03/2020
 * Brayan Adrian Galvan Flores || 181112
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenidos\n\t1. Alumno\n\t2. Profestor\n\t3. Salir\n>>> ");
        opcion = entrada.nextInt();
        switch(opcion){
            case 1:
                System.out.println("\n\nAlumno");
                break;
            case 2:
                System.out.println("\n\nProfesor");
                break;
            case 3:
                System.out.println("Salir");
                break;
            default:
                break;
        }
    }
    
}
