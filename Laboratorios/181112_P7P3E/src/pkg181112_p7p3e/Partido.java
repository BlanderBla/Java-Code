/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg181112_p7p3e;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;
/**
 * Universidad Politecnica de San Luis Potosí (UPSLP)
 * Brayan Adrian Galván Flores || 181112
 * Programación III
 * 
 */
public class Partido {
        //  Declaracion de objetos
    Scanner entrada = new Scanner(System.in);
    ArrayList equipo1 = new ArrayList(5);
    ArrayList equipo2 = new ArrayList(5);
    // Declaracion de variables
    int n = 4;
    int aleatorio;
    String nom[] = {"Iker", "Stegen", "Messi", "Ronaldo", "Xavi", "Iniesta", "Ibrahimovic", "Falcao", "Andrea", "Sergio", "Neymar", "Sergio", "Alonso", "Thiago", "Ozil", "David", "William", "Reus", "Gerard", "Franck"};
    //  Lee los datos del para llenar al arreglo

    //Metodos 
    //  Genera los nombres y las edades de los jugadores y los coloca en el arreglo del equipo 1
    public void llenarEquipo1(){
        for(int i=0; i<n ;i++){
            Jugador jugador = new Jugador();
            aleatorio = (int)(Math.random()*18+2);
            jugador.setNombre(nom[aleatorio]);
            aleatorio = (int)(Math.random()*45+16);
            jugador.setEdad(aleatorio); 
            jugador.setGoles(0);
            equipo1.add(jugador);
        }  
        //  Para el portero posicionandolo la posicion inicial
        Jugador jugador = new Jugador();
        jugador.setNombre(nom[0]);
        aleatorio = (int)(Math.random()*45+10);
        jugador.setEdad(aleatorio); 
        jugador.setGoles(0);
        equipo1.add(0,jugador);
    }
    //  Genera los nombres y las edades de los jugadores y los coloca en el arreglo del equipo 2
    public void llenarEquipo2(){
        for(int i=0; i<n ;i++){
            Jugador jugador = new Jugador();
            aleatorio = (int)(Math.random()*17+2);
            jugador.setNombre(nom[aleatorio]);
            aleatorio = (int)(Math.random()*45+16);
            jugador.setEdad(aleatorio); 
            jugador.setGoles(0);
            equipo2.add(jugador);
        }
        //  Para el portero posicionandolo la posicion inicial
        Jugador jugador = new Jugador();
        jugador.setNombre(nom[1]);
        aleatorio = (int)(Math.random()*45+16);
        jugador.setEdad(aleatorio);
        equipo2.add(0,jugador);
    }
    //  Imprime los jugadores de cada equipo con sus edades
    public void mostrarEquipo1(){
        System.out.println("_____________________________________________\nEquipo 1");
        for (int i=0; i<equipo1.size(); i++){
            Jugador jugador = (Jugador)equipo1.get(i);
            System.out.println((i+1)+". "+jugador.getNombre()+"\t"+jugador.getEdad());
        }
        System.out.println("_____________________________________________\n");
    }
    //  Imprime los jugadores de cada equipo con sus edades
    public void mostrarEquipo2(){
        System.out.println("_____________________________________________\nEquipo 2");
        for (int i=0; i<equipo2.size(); i++){
            Jugador jugador = (Jugador)equipo2.get(i);
            System.out.println((i+1)+". "+jugador.getNombre()+"\t"+jugador.getEdad());
        }
        System.out.println("_____________________________________________");
    }
    //  Muestar las jugadas como los goles de cada equipo y que jugadores han anotado gol
    public void jugada(){
        int contador1=0, contador2=0;
        
        for(int i=0; i<10;i++){
            System.out.println("________________________________");
            System.out.println("---- JUGADA "+(i+1)+" -----");
            aleatorio = (int)(Math.random()*2+1);
            if(aleatorio==2){
                System.out.println("\tEquipo 1\n");
                aleatorio = (int)(Math.random()*4+1);
                Jugador jugador = (Jugador)equipo1.get(aleatorio);
                System.out.println("\tEl jugador "+jugador.getNombre());
                System.out.println("\tHa metido un gol");
                jugador.setGoles((jugador.getGoles()+1));
                contador1++;
                 
            }else{
                System.out.println("\tEquipo 2");
                aleatorio = (int)(Math.random()*4+1);
                Jugador jugador = (Jugador)equipo2.get(aleatorio);
                System.out.println("\tEl jugador "+jugador.getNombre());
                System.out.println("\tHa metido un gol");
                jugador.setGoles((jugador.getGoles()+1));
                contador2++;
            }
            System.out.println("\nContador\nEquipo 1 >> "+contador1+"\nEquipo 2 >> "+contador2);
            System.out.println("________________________________");
        }
    }
    //  Muestra cuantos goles anoto cada jugador de sus respectivos equipos
    public void marcador(){
        System.out.println("----- MARCADOR -----");
        System.out.println("_____________________________________________\nEquipo 1");
        for (int i=0; i<equipo1.size(); i++){
            Jugador jugador = (Jugador)equipo1.get(i);
            System.out.println((i+1)+". "+jugador.getNombre()+"\t"+jugador.getGoles());
        }
        System.out.println("_____________________________________________\n");
        
        System.out.println("_____________________________________________\nEquipo 2");
        for (int j=0; j<equipo1.size(); j++){
            Jugador jugador = (Jugador)equipo2.get(j);
            System.out.println((j+1)+". "+jugador.getNombre()+"\t"+jugador.getGoles());
        }
        System.out.println("_____________________________________________\n");
    }
}
