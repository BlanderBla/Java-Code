/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg181112_p6p3c;
import  java.util.Scanner;
/**
 * Universidad Poltecnica de San Luis Potosí
 * Programación III
 * Jueves 12/03/2020
 * Brayan Adrian Galvan Flores || 181112
 */
public class Datos {
    //  Atributos
    private String nombre;
    private int edad;
    //  Métodos
    //  Métodos Constructor
    //  Método constructor vacio
    public void Datos(){
        this.setNombre(getNombre());
        this.setEdad(getEdad());
    }
    
    /*
    1. generaMatriculas() - No recibe parámetros y genera n cantidad de matrículas (aleatorio entre 5 y 15) 
    para asignar al grupo y las guarda en un arreglo.
    */
    public void generaMatriculas(){
    
    }
    /*
    2. generaMatriculas() – Recibe el nombre del profesor y la antigüedad, genera tantas matriculas como la
    antigüedad del profesor y las guarda en un arreglo.
    */
    public void generaMatriculas(String nombre, int anios){
    
    }
    /*
    3. generaMatriculas() – recibe el nombre del profesor y la materia, genera un horario aleatorio para su 
    materia y un salón para impartir el curso.
    */
    public void generaMatriculas(String nombre, String materia){
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
