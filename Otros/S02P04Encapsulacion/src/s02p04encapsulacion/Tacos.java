/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s02p04encapsulacion;

/**
 * Brayan Adrian galvan Flores || 181112
 */
public class Tacos {
    //ATRIBUTOS
    //PRIVATE NO PODER ACCEDER DIRECTAMENTE A LOS ATRIBUTOS
    private String ingrediente;
    private String tipoTortilla;
    String tipoSalsa;
    float precio;
    
    //  METODO
    public void engordar(){
        System.out.println("ENGORDANDO!");
    }
    //  VARIABLES PRIVATE Y METODOS PUBLIC, SE PONE PUBLIC PARA PODER USAR SET Y GET
    public void setIngrediente(String ing){
        //ASIGNAR VALOR A UN ATRIBUTO
        ingrediente = ing;
    }
    //  Devolver el valor de ingrediente
    public String getIngrediente(){
        return ingrediente;
    }
    public void  setTortilla(String tortilla){
        //ASIGNAR VALOR A TORTILLA
        tipoTortilla = tortilla;
    }
    public  String getTortilla(){
        return tipoTortilla;
    }
}
